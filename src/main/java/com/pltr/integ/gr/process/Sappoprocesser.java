package com.pltr.integ.gr.process;

import java.math.BigDecimal;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pltr.integ.gr.entity.Sappofileline;
import com.pltr.integ.gr.entity.Sappohd;
import com.pltr.integ.gr.entity.Sappolineitem;
import com.pltr.integ.gr.entity.Sappolinesku;
import com.pltr.integ.gr.entity.Sappolineskudistr;
import com.pltr.integ.gr.model.SapPoFileComposite;
import com.pltr.integ.gr.model.SappoComposite;
import com.pltr.integ.gr.repository.GmSkuRepository;
import com.pltr.integ.gr.repository.PoimportseqnumRepository;
import com.pltr.integ.gr.repository.SappofilelineRepository;
import com.pltr.integ.gr.repository.SappofilelogRepository;
import com.pltr.integ.gr.repository.SappohdRepository;
import com.pltr.integ.gr.repository.SappolineitemRepository;
import com.pltr.integ.gr.repository.SappolineskuRepository;
import com.pltr.integ.gr.repository.SappolineskudistrRepository;

@Component("Sappoprocesser")
public class Sappoprocesser {

	@Autowired
	SappofilelineRepository sappofilelineRepository;
	@Autowired
	PoimportseqnumRepository poimportseqnumRepository;
	@Autowired
	SappofilelogRepository sappofilelogRepository;
	@Autowired
	SappolineskuRepository sappolineskuRepository;
	@Autowired
	SappohdRepository sappohdRepository;
	@Autowired
	SappolineitemRepository sappolineitemRepository;
	@Autowired
	SappolineskudistrRepository sappolineskudistrRepository;
	@Autowired
	GmSkuRepository gmSkuRepository;

	BigDecimal itemseqnum = null;
	BigDecimal polnseqstart = null;
	BigDecimal polnseqend = new BigDecimal(1);

	Sappohd sappohd = null;
	Hashtable<String, Sappolineitem> lineitems = new Hashtable<String, Sappolineitem>();
	Hashtable<String, Sappolinesku> linesku = new Hashtable<String, Sappolinesku>();
	Hashtable<String, Sappolineskudistr> lineskudistr = new Hashtable<String, Sappolineskudistr>();

	public SappoComposite getContentForPo(SapPoFileComposite sapPoFileComposite) {

		Sappolineitem currentitemln = null;
		Sappolinesku currentskuln = null;
		Sappolineskudistr currentskudistrln = null;
		sappohd = null;
		lineitems = new Hashtable<String, Sappolineitem>();
		linesku = new Hashtable<String, Sappolinesku>();
		lineskudistr = new Hashtable<String, Sappolineskudistr>();

		itemseqnum = new BigDecimal(1);
		polnseqstart = new BigDecimal(1);

		for (Sappofileline sappofileline : sapPoFileComposite.getSappofilelines()) {
			if (sappohd == null) {
				sappohd = createSappohd(sappofileline);
				String status=sapPoFileComposite.getSappofile().getStatus();
				sappohd.setStatus("ERROR".equals(status)?"ERROR":"POCONS");
			}
			if (sappofileline.getItmcd() != null && !lineitems.containsKey(sappofileline.getItmcd())) {
				currentitemln = createSappolineitem(sappofileline);
				lineitems.put(sappofileline.getItmcd(), currentitemln);
				sappohd.addSappolineitems(currentitemln);
			} else if (sappofileline.getItmcd() != null && lineitems.containsKey(sappofileline.getItmcd())) {
				currentitemln = lineitems.get(sappofileline.getItmcd());
			}
			if (sappofileline.getSkunum() != null && !linesku.containsKey(sappofileline.getSkunum())) {
				currentskuln = createSappolinesku(sappofileline);
				linesku.put(sappofileline.getSkunum(), currentskuln);
				currentitemln.addSappolinesku(currentskuln);
			} else if (sappofileline.getSkunum() != null && linesku.containsKey(sappofileline.getSkunum())) {
				currentskuln = linesku.get(sappofileline.getSkunum());
			}
			if (sappofileline.getSkunum() != null && sappofileline.getStorecd() != null
					&& !lineskudistr.containsKey(sappofileline.getSkunum() + ":" + sappofileline.getStorecd())) {
				currentskudistrln = createSappolineskudistr(sappofileline);
				lineskudistr.put(sappofileline.getSkunum() + ":" + sappofileline.getStorecd(), currentskudistrln);
				currentskuln.addSappolineskudistrs(currentskudistrln);
				if ("SNGLOC".equals(sappohd.getPotype()) && currentskuln.getSappolineskudistrs().size() > 1) {
					sappohd.setPotype("MLTLOC");
				}
			}
		}

		SappoComposite sappoComposite = new SappoComposite();
		sappoComposite.setLineitems(lineitems);
		sappoComposite.setLinesku(linesku);
		sappoComposite.setLineskudistr(lineskudistr);
		sappoComposite.setSappohd(sappohd);
		sappohdRepository.save(sappohd);
		return sappoComposite;

	}

	private Sappohd createSappohd(Sappofileline sappofileline) {
		Sappohd sappohd = sappohdRepository.findByPonum(sappofileline.getPonum());
		if (sappohd == null) {
			sappohd = new Sappohd();
			sappohd.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
			sappohd.setVecd(sappofileline.getVecd());
			sappohd.setFob(sappofileline.getFob());
			sappohd.setTermskey(sappofileline.getTermskey());
			sappohd.setTermsdays(sappofileline.getTermsdays());
			sappohd.setTermspct(sappofileline.getTermspct());
			sappohd.setFrtterms(sappofileline.getFrtterms());
		}

		sappohd.setSapponum(sappofileline.getPonum());
		sappohd.setCanceldt(
				sappofileline.getCanceldt() == null ? sappofileline.getShipcmpltdt() : sappofileline.getCanceldt());
		String gersPoNum = sappofileline.getPonum().substring(0, 2) + sappofileline.getPonum().substring(4);
		sappohd.setGersponum(gersPoNum);
		sappohd.setPotype("SNGLOC");
		sappohd.setShipcmpltdt(sappofileline.getShipcmpltdt());
		sappohd.setShipdt(sappofileline.getShipdt());

		
		return sappohd;
	}

	private Sappolineitem createSappolineitem(Sappofileline sappofileline) {
		Sappolineitem sappolineitem = sappolineitemRepository.findByPoAndItmcd(sappofileline.getPonum(),
				sappofileline.getItmcd());

		if (sappolineitem == null) {
			sappolineitem = new Sappolineitem();
			sappolineitem.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
			sappolineitem.setItemseqnum(itemseqnum);
			sappolineitem.setPolnseqstart(polnseqstart);
			sappolineitem.setGersponum(sappohd.getGersponum());
			BigDecimal numofvarient = gmSkuRepository.findMaxItmSeq(sappofileline.getItmcd());
			polnseqend = polnseqstart.add(numofvarient);
			sappolineitem.setPolnseqend(polnseqend);
			sappolineitem.setNumofvarient(numofvarient);
			itemseqnum = itemseqnum.add(new BigDecimal(1));
			polnseqstart = polnseqend.add(new BigDecimal(1));
		} else {
			itemseqnum = sappolineitem.getItemseqnum().add(new BigDecimal(1));
			polnseqstart = sappolineitem.getPolnseqend().add(new BigDecimal(1));
		}

		sappolineitem.setItmcd(sappofileline.getItmcd());
		sappolineitem.setSapponum(sappofileline.getPonum());
		sappolineitem.setStatus(sappofileline.getStatus());
		sappolineitem.setVcst(sappofileline.getVcst());
		sappolineitem.setVsnum(sappofileline.getVsnum());
		sappolineitem.setDivcd(sappofileline.getDivcd());
		sappolineitem.setDeptcd(sappofileline.getDeptcd());
		sappolineitem.setClasscd(sappofileline.getClasscd());
		sappolineitem.setSubclasscd(sappofileline.getSubclasscd());
		sappolineitem.setSappohdid(sappohd.getId());
		sappolineitemRepository.save(sappolineitem);

		return sappolineitem;
	}

	private Sappolinesku createSappolinesku(Sappofileline sappofileline) {
		Sappolinesku sappolinesku = sappolineskuRepository.findByPonumAndSkunum(sappofileline.getPonum(),
				sappofileline.getSkunum());
		if (sappolinesku == null) {
			sappolinesku = new Sappolinesku();
			sappolinesku.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
			sappolinesku.setGersponum(sappohd.getGersponum());
		}
		BigDecimal polnseq = new BigDecimal(sappofileline.getSkunum().substring(9));
		Sappolineitem currentitemln = lineitems.get(sappofileline.getItmcd());
		polnseq = currentitemln.getPolnseqstart().add(polnseq).subtract(new BigDecimal(1));

		sappolinesku.setItmcd(sappofileline.getItmcd());
		sappolinesku.setLprc(sappofileline.getLprc());
		sappolinesku.setPolnseq(null);
		sappolinesku.setPotype(null);
		sappolinesku.setSapponum(sappofileline.getPonum());
		sappolinesku.setSeqnum(polnseq);
		sappolinesku.setSkunum(sappofileline.getSkunum());
		sappolinesku.setStatus(sappofileline.getStatus());
		sappolinesku.setSappolineitemid(currentitemln.getId());
		sappolineskuRepository.save(sappolinesku);
		return sappolinesku;
	}

	private Sappolineskudistr createSappolineskudistr(Sappofileline sappofileline) {
		Sappolineskudistr sappolineskudistr = sappolineskudistrRepository.findByPonumAndSkunumAndStorecd(
				sappofileline.getPonum(), sappofileline.getSkunum(), sappofileline.getStorecd());
		if (sappolineskudistr == null) {
			sappolineskudistr = new Sappolineskudistr();
			sappolineskudistr.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
			sappolineskudistr.setGersponum(sappohd.getGersponum());
			sappolineskudistr.setSapponum(sappofileline.getPonum());
			sappolineskudistr.setStatus(sappofileline.getStatus());
			sappolineskudistr.setStorecd(sappofileline.getStorecd());
			sappolineskudistr.setPolnitem(sappofileline.getPolnitem());
			sappolineskudistr.setSkunum(sappofileline.getSkunum());
			sappolineskudistr.setPotype(null);
		}
		sappolineskudistr.setQty(sappofileline.getQty());

		sappolineskudistr.setSappolineskuid(linesku.get(sappofileline.getSkunum()).getId());
		sappolineskudistrRepository.save(sappolineskudistr);
		sappofileline.setSappolineskudistrid(sappolineskudistr.getId());
		sappofilelineRepository.save(sappofileline);
		return sappolineskudistr;
	}

}
