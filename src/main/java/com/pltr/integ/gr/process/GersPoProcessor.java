package com.pltr.integ.gr.process;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.entity.GmPo;
import com.pltr.integ.gr.entity.GmPoLn;
import com.pltr.integ.gr.entity.GmPoLnKey;
import com.pltr.integ.gr.entity.GmPoLnShip;
import com.pltr.integ.gr.entity.GmPoLnShipKey;
import com.pltr.integ.gr.entity.Sappohd;
import com.pltr.integ.gr.entity.Sappolineitem;
import com.pltr.integ.gr.entity.Sappolinesku;
import com.pltr.integ.gr.entity.Sappolineskudistr;
import com.pltr.integ.gr.model.GmPoComposite;
import com.pltr.integ.gr.model.SappoComposite;
import com.pltr.integ.gr.repository.GmPoLnRepository;
import com.pltr.integ.gr.repository.GmPoLnShipRepository;
import com.pltr.integ.gr.repository.GmPoRepository;

@Service("GersPoProcessor")
public class GersPoProcessor {
	@Autowired
	GmPoRepository gmPoRepository;
	@Autowired
	GmPoLnRepository gmPoLnRepository;
	@Autowired
	GmPoLnShipRepository gmPoLnShipRepository;

	@Autowired
	SapFileLoging sapFileLoging;

	public GmPoComposite createNewPo(SappoComposite sappoComposite) {
		if (sappoComposite.getSappohd().getStatus().equals("POCONS")) {
			GmPoComposite gmPoComposite = new GmPoComposite();
			gmPoComposite.setGmPo(createGmPo(sappoComposite));
			return gmPoComposite;
		}
		return null;
	}

	private GmPo createGmPo(SappoComposite sappoComposite) {
		GmPo gmPo = null;
		Sappohd sappohd = sappoComposite.getSappohd();
		BigDecimal poNum = new BigDecimal(sappohd.getGersponum());
		gmPo = gmPoRepository.findByPoNum(poNum);

		if (gmPo == null) {
			gmPo = new GmPo();
			gmPo.setStatCd("OPEN");
			gmPo.setPoNum(poNum);
			gmPo.setOriginCd("SAP");
			gmPo.setVeCd(sappohd.getVecd());
			gmPo.setFactCd(sappohd.getVecd());
			gmPo.setEmpInitBuy("MIGPO");
			gmPo.setTermsPct(sappohd.getTermspct() == null ? new BigDecimal(0) : sappohd.getTermspct());
			gmPo.setRbPct(new BigDecimal(0));
			gmPo.setShipVia("EDI");
			gmPo.setFrtTerms(sappohd.getFrtterms());
			gmPo.setXmitBy("EDI");
			gmPo.setSeasonCd("BASIC");
			gmPo.setOrdDt(new Date());
			gmPo.setCreateDt(new Date());
			gmPo.setTermsKey(sappohd.getTermskey() == null ? new BigDecimal(0) : sappohd.getTermskey());
		} else if (gmPo.getStatCd().equals("RCVD") || gmPo.getStatCd().equals("CANC")) {
			sapFileLoging.addLog(sappohd, "ERROR", "PO in GERS with status " + gmPo.getStatCd());
			return gmPo;
		}
		gmPo.setStatDt(new Date());
		gmPo.setCancelDt(sappohd.getCanceldt());
		gmPo.setLstChngDt(new Date());
		gmPo.setLstChngEmpInit("MIGPO");
		gmPo.setDoNotShipBeforeDt(sappohd.getShipdt());
		gmPo.setShipCmpltDt(sappohd.getShipcmpltdt());
		gmPo.setAppDt(new Date());
		gmPo.setAppInit("MIGPO");
		gmPo.setDistMethodCd("P");
		gmPo.setUpdDtTime(new Date());
		gmPo.setStatDtTime(new Date());

		for (Sappolineitem sappolineitem : sappohd.getSappolineitems()) {
			for (Sappolinesku sappolinesku : sappolineitem.getSappolineskus()) {
				GmPoLn gmPoLn = gmPoLnRepository.findByPoNumSkuNum(poNum, sappolinesku.getSkunum());
				if (gmPoLn == null) {
					gmPoLn = new GmPoLn();
					GmPoLnKey gmPoLnKey = new GmPoLnKey();
					gmPoLn.setGmPoLnKey(gmPoLnKey);
					gmPoLnKey.setPoNum(poNum);
					gmPoLnKey.setPoLnSeqNum(sappolinesku.getSeqnum());
					gmPoLn.setVeCd(sappohd.getVecd());
					gmPoLn.setVsn(sappolineitem.getVsnum());
					gmPoLn.setDivCd(sappolineitem.getDivcd());
					gmPoLn.setDeptCd(sappolineitem.getDeptcd());
					gmPoLn.setClassCd(sappolineitem.getClasscd());
					gmPoLn.setSubclassCd(sappolineitem.getSubclasscd());
					gmPoLn.setItmCd(sappolineitem.getItmcd());
					gmPoLn.setSkuNum(sappolinesku.getSkunum());
					gmPoLn.setWeight(new BigDecimal(0));
					gmPoLn.setBuyCd("EA");
					gmPoLn.setBillCd("EA");
					gmPoLn.setBillQty(new BigDecimal(1));
					gmPoLn.setRtdQty(new BigDecimal(0));
					gmPoLn.setQty(new BigDecimal(0));
					gmPoLn.setOrigBuyQty(new BigDecimal(1));
					gmPoLn.setNetBuyCst(sappolinesku.getLprc());
					gmPoLn.setOrigXfrQty(new BigDecimal(1));
				}
				gmPoLn.setCst(sappolineitem.getVcst() == null ? new BigDecimal(0) : sappolineitem.getVcst());
				gmPoLn.setRetPrc(sappolinesku.getLprc() == null ? new BigDecimal(0) : sappolinesku.getLprc());
				gmPoLn.setCoreCst(gmPoLn.getCst());
				gmPoLn.setCoreRetPrc(gmPoLn.getRetPrc());
				gmPoLnRepository.save(gmPoLn);
				for (Sappolineskudistr sappolineskudistr : sappolinesku.getSappolineskudistrs()) {
					GmPoLnShip gmPoLnShip = gmPoLnShipRepository.findByPoNumPoLnSeqNumStoreCd(poNum,
							gmPoLn.getGmPoLnKey().getPoLnSeqNum(), sappolineskudistr.getStorecd());
					if (gmPoLnShip == null) {
						GmPoLnShipKey gmPoLnShipKey = new GmPoLnShipKey();
						gmPoLnShipKey.setPoNum(poNum);
						gmPoLnShipKey.setPoLnSeqNum(gmPoLn.getGmPoLnKey().getPoLnSeqNum());
						gmPoLnShipKey.setStoreCd(sappolineskudistr.getStorecd());
						gmPoLnShip = new GmPoLnShip();
						gmPoLnShip.setGmPoLnShipKey(gmPoLnShipKey);
						gmPoLnShip.setRtdQty(new BigDecimal(0));
					}
					gmPoLnShip.setShipDt(sappohd.getShipdt());
					gmPoLnShip.setQty(sappolineskudistr.getQty());
					gmPoLnShipRepository.save(gmPoLnShip);
				}
			}
			gmPoRepository.save(gmPo);
			updateMislPo(poNum);
		}

		return gmPo;
	}

	private void updateMislPo(BigDecimal poNum) {
		String storeCd = null;
		Set<String> storeCds = new HashSet<String>();
		GmPo gmPo = gmPoRepository.findByPoNum(poNum);
		List<GmPoLn> gmPoLns = gmPoLnRepository.findByPoNum(poNum);
		for (GmPoLn gmPoLn : gmPoLns) {
			List<GmPoLnShip> gmPoLnShips = gmPoLnShipRepository.findByPoNumPoLnSeqNum(poNum,
					gmPoLn.getGmPoLnKey().getPoLnSeqNum());
			BigDecimal qty = new BigDecimal(0);
			for (GmPoLnShip gmPoLnShip : gmPoLnShips) {
				qty = gmPoLnShip.getQty().add(qty);
				storeCd = gmPoLnShip.getGmPoLnShipKey().getStoreCd();
				storeCds.add(storeCd);
			}
			gmPoLn.setQty(qty);
			gmPoLn.setNetBuyCst(qty.multiply(gmPoLn.getCst()));
			gmPoLnRepository.save(gmPoLn);
		}
		if (storeCds.size() > 1) {
			gmPo.setDelivStoreCd(null);
			gmPo.setDistMethodCd("M");
		} else {

			gmPo.setDelivStoreCd(storeCd);
			gmPo.setDistMethodCd("P");
		}
		gmPoRepository.save(gmPo);
	}

}
