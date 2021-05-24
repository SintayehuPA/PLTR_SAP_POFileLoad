package com.pltr.integ.gr.process;

import java.math.BigDecimal;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pltr.integ.gr.entity.Cst;
import com.pltr.integ.gr.entity.GmItm;
import com.pltr.integ.gr.entity.GmItm2ve;
import com.pltr.integ.gr.entity.GmPrc;
import com.pltr.integ.gr.entity.GmSku;
import com.pltr.integ.gr.entity.GmSku2upcCd;
import com.pltr.integ.gr.entity.Sappofileline;
import com.pltr.integ.gr.entity.Ve;
import com.pltr.integ.gr.model.SapPoFileComposite;
import com.pltr.integ.gr.repository.CstRepository;
import com.pltr.integ.gr.repository.GmItm2veRepository;
import com.pltr.integ.gr.repository.GmItmRepository;
import com.pltr.integ.gr.repository.GmPrcRepository;
import com.pltr.integ.gr.repository.GmSku2upcCdRepository;
import com.pltr.integ.gr.repository.GmSkuRepository;
import com.pltr.integ.gr.repository.PoimportseqnumRepository;
import com.pltr.integ.gr.repository.SappofileRepository;
import com.pltr.integ.gr.repository.SappofilelineRepository;
import com.pltr.integ.gr.repository.SappofilelogRepository;
import com.pltr.integ.gr.repository.VeRepository;

@Component("Sapfilepoprocessor")
public class Sapfilepoprocessor {
	private final Logger log = LoggerFactory.getLogger(Sapfilepoprocessor.class);
	@Autowired
	PoimportseqnumRepository poimportseqnumRepository;

	@Autowired
	GmSku2upcCdRepository gmSku2upcCdRepository;

	@Autowired
	GmSkuRepository gmSkuRepository;

	@Autowired
	GmItmRepository gmItmRepository;

	@Autowired
	VeRepository veRepository;

	@Autowired
	GmItm2veRepository gmItm2veRepository;

	@Autowired
	CstRepository cstRepository;

	@Autowired
	GmPrcRepository gmPrcRepository;

	@Autowired
	SappofilelogRepository sappofilelogRepository;
	@Autowired
	SappofilelineRepository sappofilelineRepository;

	@Autowired
	SappofileRepository sappofileRepository;

	@Autowired
	SapFileLoging sapFileLoging;

	String fileStatus = null;
	String ponum = null;
	int numOfLine=0;
	int numOfErrLine=0;

	public void excute(SapPoFileComposite sapPoFileComposite) {
		numOfLine=0;
		numOfErrLine=0;
		fileStatus = null;
		ponum = null;
		for (Sappofileline sappofileline : sapPoFileComposite.getSappofilelines()) {
			numOfLine++;
			processLine(sappofileline);
			ponum=sappofileline.getPonum();
		}
		sapPoFileComposite.getSappofile().setStatus("DETADD");
		if (fileStatus != null) {
			sapPoFileComposite.getSappofile().setStatus(fileStatus);
		}
		sapPoFileComposite.getSappofile().setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
		sapPoFileComposite.getSappofile().setNumofline(new BigDecimal(numOfLine));
		sapPoFileComposite.getSappofile().setNumoflineerr(new BigDecimal(numOfErrLine));
		sapPoFileComposite.getSappofile().setProcessdate(new Date());
		sapPoFileComposite.getSappofile().setPonum(ponum);
		sappofileRepository.save(sapPoFileComposite.getSappofile());

	}

	private void processLine(Sappofileline sappofileline) {
		sappofileline.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
		addItemDetail(sappofileline);
		sappofilelineRepository.save(sappofileline);
	}

	private void addItemDetail(Sappofileline sappofileline) {
		try {
			sappofileline.setStatus(null);
			GmSku2upcCd gmSku2upcCd = gmSku2upcCdRepository.findByUpcCd(sappofileline.getUpccd());
			if (gmSku2upcCd != null) {
				sappofileline.setSkunum(gmSku2upcCd.getSkuNum());
				GmSku gmSku = gmSkuRepository.findBySkuNum(sappofileline.getSkunum());
				if (gmSku != null) {
					sappofileline.setItmcd(gmSku.getItmCd());

					Ve ve = veRepository.findByVeCd(sappofileline.getVecd());
					GmItm gmItm = gmItmRepository.findByItmCd(sappofileline.getItmcd());
					GmItm2ve gmItm2ve = gmItm2veRepository.findByVeItmCd(sappofileline.getVecd(),
							sappofileline.getItmcd());

					if (gmItm != null) {
						sappofileline.setDivcd(gmItm.getDivCd());
						sappofileline.setDeptcd(gmItm.getDeptCd());
						sappofileline.setClasscd(gmItm.getClassCd());
						sappofileline.setSubclasscd(gmItm.getSubclassCd());
					} else {
						sapFileLoging.addLog(sappofileline, "ERROR", "GmItm not found");
					}

					if (ve != null) {
						sappofileline.setTermskey(ve.getTermsKey());
						sappofileline.setTermsdays(ve.getTermsDays());
						sappofileline.setTermspct(ve.getTermsPct()==null?new BigDecimal(0):ve.getTermsPct());
						sappofileline.setFrtterms(ve.getFrtTerms());
					} else {
						sapFileLoging.addLog(sappofileline, "ERROR", "Vendor not found");
					}
					if (gmItm2ve != null) {
						sappofileline.setVsnum(gmItm2ve.getVsn());
						Cst cst = cstRepository.findByVecdItmcd(sappofileline.getVecd(), sappofileline.getItmcd());
						if (cst != null)
							sappofileline.setVcst(cst.getCst());
						else {
							sapFileLoging.addLog(sappofileline, "ERROR", "cost not found");
						}
					} else {
						sapFileLoging.addLog(sappofileline, "ERROR", "Item not assign to vendor");
					}
					GmPrc gmPrc = gmPrcRepository.findByStoreCdSkunum(sappofileline.getStorecd(),
							sappofileline.getSkunum());
					if (gmPrc != null)
						sappofileline.setLprc(gmPrc.getRetPrc());
					else {
						sapFileLoging.addLog(sappofileline, "ERROR", "Price not found");
					}
				} else {
					sapFileLoging.addLog(sappofileline, "ERROR", "SKU_NUM not found");
				}
			} else {
				sapFileLoging.addLog(sappofileline, "ERROR", "UPC not found");
			}

			GmPrc gmPrc = gmPrcRepository.findByStoreCdSkunum(sappofileline.getStorecd(), sappofileline.getSkunum());
			sappofileline.setLprc(gmPrc.getRetPrc());
			if ("ERROR".equals(sappofileline.getStatus())) {
				fileStatus = sappofileline.getStatus();
				numOfErrLine++;
			}
			sappofilelineRepository.save(sappofileline);
		} catch (Exception e) {
			log.error(e.getMessage());
			sappofileline.setStatus("ERROR");
			fileStatus = sappofileline.getStatus();
		}
	}

}
