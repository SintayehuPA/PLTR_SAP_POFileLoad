package com.pltr.integ.gr.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VE database table.
 * 
 */
@Entity
@Table(name="VE", schema="AP" )
@NamedQuery(name="Ve.findAll", query="SELECT v FROM Ve v")
public class Ve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="VE_CD")
	private String veCd;

	@Column(name="ADV_EXP")
	private BigDecimal advExp;

	@Column(name="APA_INV_CST")
	private String apaInvCst;

	@Column(name="APA_REQ_PO")
	private String apaReqPo;

	@Column(name="APA_TP")
	private String apaTp;

	@Column(name="ASN_STAT_CD")
	private String asnStatCd;

	@Column(name="BACK_ORD")
	private String backOrd;

	@Column(name="BLIND_RCV")
	private String blindRcv;

	@Column(name="CANCEL_DAYS")
	private BigDecimal cancelDays;

	@Column(name="CURRENCY_CD")
	private String currencyCd;

	@Column(name="DAYS_NET")
	private BigDecimal daysNet;

	@Column(name="DFLT_FOB")
	private String dfltFob;

	@Column(name="DFLT_FRT_MIN_CST")
	private BigDecimal dfltFrtMinCst;

	@Column(name="DFLT_FRT_MIN_QTY")
	private BigDecimal dfltFrtMinQty;

	@Column(name="DFLT_FRT_MIN_WEIGHT")
	private BigDecimal dfltFrtMinWeight;

	@Column(name="DFLT_PO_CMNT")
	private String dfltPoCmnt;

	@Column(name="DFLT_PO_DIST_METHOD_CD")
	private String dfltPoDistMethodCd;

	@Column(name="DFLT_RB_PCT")
	private BigDecimal dfltRbPct;

	@Column(name="DISC_IVC")
	private String discIvc;

	@Column(name="EDI_ID_CD")
	private String ediIdCd;

	@Column(name="ELIGIBLE_PO_REVIEW")
	private String eligiblePoReview;

	@Column(name="EMP_CD_OP")
	private String empCdOp;

	@Column(name="FACT_CD")
	private String factCd;

	@Column(name="FMT_CD")
	private String fmtCd;

	@Column(name="FRT_DISC")
	private String frtDisc;

	@Column(name="FRT_TERMS")
	private String frtTerms;

	@Column(name="GP_CMNT_SEQ_NUM")
	private BigDecimal gpCmntSeqNum;

	@Temporal(TemporalType.DATE)
	@Column(name="INS_DT_TIME")
	private Date insDtTime;

	@Column(name="ITM_MFG")
	private String itmMfg;

	@Column(name="IVC_MAX")
	private BigDecimal ivcMax;

	@Column(name="LANG_CD")
	private String langCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_PMT_DT")
	private Date lstPmtDt;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_PO_REVW_DT")
	private Date lstPoRevwDt;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_PUR_DT")
	private Date lstPurDt;

	@Column(name="MATCH_AMT_ABOVE")
	private BigDecimal matchAmtAbove;

	@Column(name="MATCH_AMT_BELOW")
	private BigDecimal matchAmtBelow;

	@Column(name="MATCH_DISC_DAYS")
	private BigDecimal matchDiscDays;

	@Column(name="MATCH_DUE_DAYS")
	private BigDecimal matchDueDays;

	@Column(name="MATCH_PCNT_ABOVE")
	private BigDecimal matchPcntAbove;

	@Column(name="MATCH_PCNT_BELOW")
	private BigDecimal matchPcntBelow;

	@Column(name="MIN_MAX_ROQ")
	private String minMaxRoq;

	@Column(name="MTD_IVC_MAX")
	private BigDecimal mtdIvcMax;

	@Column(name="ORD_DAYS")
	private BigDecimal ordDays;

	@Column(name="OVR_AP_MATCH")
	private String ovrApMatch;

	@Column(name="OVR_RCV")
	private String ovrRcv;

	@Column(name="PAY_VE")
	private String payVe;

	@Column(name="PO_REVW_DAYS")
	private BigDecimal poRevwDays;

	@Column(name="POS_PO_RCV_TP")
	private String posPoRcvTp;

	private BigDecimal priority;

	@Column(name="RCV_ASN_QTY")
	private String rcvAsnQty;

	@Column(name="RCV_COUNT")
	private BigDecimal rcvCount;

	@Column(name="RCV_COUNT_INCR")
	private BigDecimal rcvCountIncr;

	@Column(name="RCV_UNORD_SKU")
	private String rcvUnordSku;

	@Column(name="SEPARATE_CK")
	private String separateCk;

	@Column(name="SHIP_COMP_DAYS")
	private BigDecimal shipCompDays;

	@Column(name="SHIP_DAYS")
	private BigDecimal shipDays;

	@Column(name="SHIP_VIA")
	private String shipVia;

	@Column(name="STAT_CD")
	private String statCd;

	@Column(name="TAX_AREA_CD")
	private String taxAreaCd;

	@Column(name="TERMS_CMNT")
	private String termsCmnt;

	@Column(name="TERMS_DAYS")
	private BigDecimal termsDays;

	@Column(name="TERMS_KEY")
	private BigDecimal termsKey;

	@Column(name="TERMS_PCT")
	private BigDecimal termsPct;

	@Column(name="TNET_PO_PREFIX")
	private BigDecimal tnetPoPrefix;

	@Column(name="TNET_VE_CD")
	private String tnetVeCd;

	@Column(name="TOL_AMT")
	private BigDecimal tolAmt;

	@Column(name="TOL_PCT")
	private BigDecimal tolPct;

	@Column(name="TXPR_ID")
	private String txprId;

	private String udf1;

	private String udf2;

	private String udf3;

	private String udf4;

	private BigDecimal udf5;

	private BigDecimal udf6;

	@Temporal(TemporalType.DATE)
	@Column(name="UPD_DT_TIME")
	private Date updDtTime;

	@Column(name="USE_VE_TOL")
	private String useVeTol;

	@Column(name="VE_1099")
	private String ve1099;

	@Column(name="VE_CUST_CD")
	private String veCustCd;

	@Column(name="VE_NAME")
	private String veName;

	@Column(name="XMIT_BY")
	private String xmitBy;

	public Ve() {
	}

	public String getVeCd() {
		return this.veCd;
	}

	public void setVeCd(String veCd) {
		this.veCd = veCd;
	}

	public BigDecimal getAdvExp() {
		return this.advExp;
	}

	public void setAdvExp(BigDecimal advExp) {
		this.advExp = advExp;
	}

	public String getApaInvCst() {
		return this.apaInvCst;
	}

	public void setApaInvCst(String apaInvCst) {
		this.apaInvCst = apaInvCst;
	}

	public String getApaReqPo() {
		return this.apaReqPo;
	}

	public void setApaReqPo(String apaReqPo) {
		this.apaReqPo = apaReqPo;
	}

	public String getApaTp() {
		return this.apaTp;
	}

	public void setApaTp(String apaTp) {
		this.apaTp = apaTp;
	}

	public String getAsnStatCd() {
		return this.asnStatCd;
	}

	public void setAsnStatCd(String asnStatCd) {
		this.asnStatCd = asnStatCd;
	}

	public String getBackOrd() {
		return this.backOrd;
	}

	public void setBackOrd(String backOrd) {
		this.backOrd = backOrd;
	}

	public String getBlindRcv() {
		return this.blindRcv;
	}

	public void setBlindRcv(String blindRcv) {
		this.blindRcv = blindRcv;
	}

	public BigDecimal getCancelDays() {
		return this.cancelDays;
	}

	public void setCancelDays(BigDecimal cancelDays) {
		this.cancelDays = cancelDays;
	}

	public String getCurrencyCd() {
		return this.currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public BigDecimal getDaysNet() {
		return this.daysNet;
	}

	public void setDaysNet(BigDecimal daysNet) {
		this.daysNet = daysNet;
	}

	public String getDfltFob() {
		return this.dfltFob;
	}

	public void setDfltFob(String dfltFob) {
		this.dfltFob = dfltFob;
	}

	public BigDecimal getDfltFrtMinCst() {
		return this.dfltFrtMinCst;
	}

	public void setDfltFrtMinCst(BigDecimal dfltFrtMinCst) {
		this.dfltFrtMinCst = dfltFrtMinCst;
	}

	public BigDecimal getDfltFrtMinQty() {
		return this.dfltFrtMinQty;
	}

	public void setDfltFrtMinQty(BigDecimal dfltFrtMinQty) {
		this.dfltFrtMinQty = dfltFrtMinQty;
	}

	public BigDecimal getDfltFrtMinWeight() {
		return this.dfltFrtMinWeight;
	}

	public void setDfltFrtMinWeight(BigDecimal dfltFrtMinWeight) {
		this.dfltFrtMinWeight = dfltFrtMinWeight;
	}

	public String getDfltPoCmnt() {
		return this.dfltPoCmnt;
	}

	public void setDfltPoCmnt(String dfltPoCmnt) {
		this.dfltPoCmnt = dfltPoCmnt;
	}

	public String getDfltPoDistMethodCd() {
		return this.dfltPoDistMethodCd;
	}

	public void setDfltPoDistMethodCd(String dfltPoDistMethodCd) {
		this.dfltPoDistMethodCd = dfltPoDistMethodCd;
	}

	public BigDecimal getDfltRbPct() {
		return this.dfltRbPct;
	}

	public void setDfltRbPct(BigDecimal dfltRbPct) {
		this.dfltRbPct = dfltRbPct;
	}

	public String getDiscIvc() {
		return this.discIvc;
	}

	public void setDiscIvc(String discIvc) {
		this.discIvc = discIvc;
	}

	public String getEdiIdCd() {
		return this.ediIdCd;
	}

	public void setEdiIdCd(String ediIdCd) {
		this.ediIdCd = ediIdCd;
	}

	public String getEligiblePoReview() {
		return this.eligiblePoReview;
	}

	public void setEligiblePoReview(String eligiblePoReview) {
		this.eligiblePoReview = eligiblePoReview;
	}

	public String getEmpCdOp() {
		return this.empCdOp;
	}

	public void setEmpCdOp(String empCdOp) {
		this.empCdOp = empCdOp;
	}

	public String getFactCd() {
		return this.factCd;
	}

	public void setFactCd(String factCd) {
		this.factCd = factCd;
	}

	public String getFmtCd() {
		return this.fmtCd;
	}

	public void setFmtCd(String fmtCd) {
		this.fmtCd = fmtCd;
	}

	public String getFrtDisc() {
		return this.frtDisc;
	}

	public void setFrtDisc(String frtDisc) {
		this.frtDisc = frtDisc;
	}

	public String getFrtTerms() {
		return this.frtTerms;
	}

	public void setFrtTerms(String frtTerms) {
		this.frtTerms = frtTerms;
	}

	public BigDecimal getGpCmntSeqNum() {
		return this.gpCmntSeqNum;
	}

	public void setGpCmntSeqNum(BigDecimal gpCmntSeqNum) {
		this.gpCmntSeqNum = gpCmntSeqNum;
	}

	public Date getInsDtTime() {
		return this.insDtTime;
	}

	public void setInsDtTime(Date insDtTime) {
		this.insDtTime = insDtTime;
	}

	public String getItmMfg() {
		return this.itmMfg;
	}

	public void setItmMfg(String itmMfg) {
		this.itmMfg = itmMfg;
	}

	public BigDecimal getIvcMax() {
		return this.ivcMax;
	}

	public void setIvcMax(BigDecimal ivcMax) {
		this.ivcMax = ivcMax;
	}

	public String getLangCd() {
		return this.langCd;
	}

	public void setLangCd(String langCd) {
		this.langCd = langCd;
	}

	public Date getLstPmtDt() {
		return this.lstPmtDt;
	}

	public void setLstPmtDt(Date lstPmtDt) {
		this.lstPmtDt = lstPmtDt;
	}

	public Date getLstPoRevwDt() {
		return this.lstPoRevwDt;
	}

	public void setLstPoRevwDt(Date lstPoRevwDt) {
		this.lstPoRevwDt = lstPoRevwDt;
	}

	public Date getLstPurDt() {
		return this.lstPurDt;
	}

	public void setLstPurDt(Date lstPurDt) {
		this.lstPurDt = lstPurDt;
	}

	public BigDecimal getMatchAmtAbove() {
		return this.matchAmtAbove;
	}

	public void setMatchAmtAbove(BigDecimal matchAmtAbove) {
		this.matchAmtAbove = matchAmtAbove;
	}

	public BigDecimal getMatchAmtBelow() {
		return this.matchAmtBelow;
	}

	public void setMatchAmtBelow(BigDecimal matchAmtBelow) {
		this.matchAmtBelow = matchAmtBelow;
	}

	public BigDecimal getMatchDiscDays() {
		return this.matchDiscDays;
	}

	public void setMatchDiscDays(BigDecimal matchDiscDays) {
		this.matchDiscDays = matchDiscDays;
	}

	public BigDecimal getMatchDueDays() {
		return this.matchDueDays;
	}

	public void setMatchDueDays(BigDecimal matchDueDays) {
		this.matchDueDays = matchDueDays;
	}

	public BigDecimal getMatchPcntAbove() {
		return this.matchPcntAbove;
	}

	public void setMatchPcntAbove(BigDecimal matchPcntAbove) {
		this.matchPcntAbove = matchPcntAbove;
	}

	public BigDecimal getMatchPcntBelow() {
		return this.matchPcntBelow;
	}

	public void setMatchPcntBelow(BigDecimal matchPcntBelow) {
		this.matchPcntBelow = matchPcntBelow;
	}

	public String getMinMaxRoq() {
		return this.minMaxRoq;
	}

	public void setMinMaxRoq(String minMaxRoq) {
		this.minMaxRoq = minMaxRoq;
	}

	public BigDecimal getMtdIvcMax() {
		return this.mtdIvcMax;
	}

	public void setMtdIvcMax(BigDecimal mtdIvcMax) {
		this.mtdIvcMax = mtdIvcMax;
	}

	public BigDecimal getOrdDays() {
		return this.ordDays;
	}

	public void setOrdDays(BigDecimal ordDays) {
		this.ordDays = ordDays;
	}

	public String getOvrApMatch() {
		return this.ovrApMatch;
	}

	public void setOvrApMatch(String ovrApMatch) {
		this.ovrApMatch = ovrApMatch;
	}

	public String getOvrRcv() {
		return this.ovrRcv;
	}

	public void setOvrRcv(String ovrRcv) {
		this.ovrRcv = ovrRcv;
	}

	public String getPayVe() {
		return this.payVe;
	}

	public void setPayVe(String payVe) {
		this.payVe = payVe;
	}

	public BigDecimal getPoRevwDays() {
		return this.poRevwDays;
	}

	public void setPoRevwDays(BigDecimal poRevwDays) {
		this.poRevwDays = poRevwDays;
	}

	public String getPosPoRcvTp() {
		return this.posPoRcvTp;
	}

	public void setPosPoRcvTp(String posPoRcvTp) {
		this.posPoRcvTp = posPoRcvTp;
	}

	public BigDecimal getPriority() {
		return this.priority;
	}

	public void setPriority(BigDecimal priority) {
		this.priority = priority;
	}

	public String getRcvAsnQty() {
		return this.rcvAsnQty;
	}

	public void setRcvAsnQty(String rcvAsnQty) {
		this.rcvAsnQty = rcvAsnQty;
	}

	public BigDecimal getRcvCount() {
		return this.rcvCount;
	}

	public void setRcvCount(BigDecimal rcvCount) {
		this.rcvCount = rcvCount;
	}

	public BigDecimal getRcvCountIncr() {
		return this.rcvCountIncr;
	}

	public void setRcvCountIncr(BigDecimal rcvCountIncr) {
		this.rcvCountIncr = rcvCountIncr;
	}

	public String getRcvUnordSku() {
		return this.rcvUnordSku;
	}

	public void setRcvUnordSku(String rcvUnordSku) {
		this.rcvUnordSku = rcvUnordSku;
	}

	public String getSeparateCk() {
		return this.separateCk;
	}

	public void setSeparateCk(String separateCk) {
		this.separateCk = separateCk;
	}

	public BigDecimal getShipCompDays() {
		return this.shipCompDays;
	}

	public void setShipCompDays(BigDecimal shipCompDays) {
		this.shipCompDays = shipCompDays;
	}

	public BigDecimal getShipDays() {
		return this.shipDays;
	}

	public void setShipDays(BigDecimal shipDays) {
		this.shipDays = shipDays;
	}

	public String getShipVia() {
		return this.shipVia;
	}

	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	public String getStatCd() {
		return this.statCd;
	}

	public void setStatCd(String statCd) {
		this.statCd = statCd;
	}

	public String getTaxAreaCd() {
		return this.taxAreaCd;
	}

	public void setTaxAreaCd(String taxAreaCd) {
		this.taxAreaCd = taxAreaCd;
	}

	public String getTermsCmnt() {
		return this.termsCmnt;
	}

	public void setTermsCmnt(String termsCmnt) {
		this.termsCmnt = termsCmnt;
	}

	public BigDecimal getTermsDays() {
		return this.termsDays;
	}

	public void setTermsDays(BigDecimal termsDays) {
		this.termsDays = termsDays;
	}

	public BigDecimal getTermsKey() {
		return this.termsKey;
	}

	public void setTermsKey(BigDecimal termsKey) {
		this.termsKey = termsKey;
	}

	public BigDecimal getTermsPct() {
		return this.termsPct;
	}

	public void setTermsPct(BigDecimal termsPct) {
		this.termsPct = termsPct;
	}

	public BigDecimal getTnetPoPrefix() {
		return this.tnetPoPrefix;
	}

	public void setTnetPoPrefix(BigDecimal tnetPoPrefix) {
		this.tnetPoPrefix = tnetPoPrefix;
	}

	public String getTnetVeCd() {
		return this.tnetVeCd;
	}

	public void setTnetVeCd(String tnetVeCd) {
		this.tnetVeCd = tnetVeCd;
	}

	public BigDecimal getTolAmt() {
		return this.tolAmt;
	}

	public void setTolAmt(BigDecimal tolAmt) {
		this.tolAmt = tolAmt;
	}

	public BigDecimal getTolPct() {
		return this.tolPct;
	}

	public void setTolPct(BigDecimal tolPct) {
		this.tolPct = tolPct;
	}

	public String getTxprId() {
		return this.txprId;
	}

	public void setTxprId(String txprId) {
		this.txprId = txprId;
	}

	public String getUdf1() {
		return this.udf1;
	}

	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}

	public String getUdf2() {
		return this.udf2;
	}

	public void setUdf2(String udf2) {
		this.udf2 = udf2;
	}

	public String getUdf3() {
		return this.udf3;
	}

	public void setUdf3(String udf3) {
		this.udf3 = udf3;
	}

	public String getUdf4() {
		return this.udf4;
	}

	public void setUdf4(String udf4) {
		this.udf4 = udf4;
	}

	public BigDecimal getUdf5() {
		return this.udf5;
	}

	public void setUdf5(BigDecimal udf5) {
		this.udf5 = udf5;
	}

	public BigDecimal getUdf6() {
		return this.udf6;
	}

	public void setUdf6(BigDecimal udf6) {
		this.udf6 = udf6;
	}

	public Date getUpdDtTime() {
		return this.updDtTime;
	}

	public void setUpdDtTime(Date updDtTime) {
		this.updDtTime = updDtTime;
	}

	public String getUseVeTol() {
		return this.useVeTol;
	}

	public void setUseVeTol(String useVeTol) {
		this.useVeTol = useVeTol;
	}

	public String getVe1099() {
		return this.ve1099;
	}

	public void setVe1099(String ve1099) {
		this.ve1099 = ve1099;
	}

	public String getVeCustCd() {
		return this.veCustCd;
	}

	public void setVeCustCd(String veCustCd) {
		this.veCustCd = veCustCd;
	}

	public String getVeName() {
		return this.veName;
	}

	public void setVeName(String veName) {
		this.veName = veName;
	}

	public String getXmitBy() {
		return this.xmitBy;
	}

	public void setXmitBy(String xmitBy) {
		this.xmitBy = xmitBy;
	}
	

}