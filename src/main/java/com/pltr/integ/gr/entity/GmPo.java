package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * The persistent class for the GM_PO database table.
 * 
 */
@Entity
@Table(schema = "GM_MERCH", name = "GM_PO")
@NamedQuery(name = "GmPo.findAll", query = "SELECT g FROM GmPo g")
public class GmPo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PO_NUM")
	private BigDecimal poNum;

	@Temporal(TemporalType.DATE)
	@Column(name = "APP_DT")
	private Date appDt;

	@Column(name = "APP_INIT")
	private String appInit;

	@Column(name = "BACK_ORD")
	private String backOrd;

	@Temporal(TemporalType.DATE)
	@Column(name = "CANCEL_DT")
	private Date cancelDt;

	@Temporal(TemporalType.DATE)
	@Column(name = "CREATE_DT")
	private Date createDt;

	@Column(name = "DAYS_NET")
	private BigDecimal daysNet;

	@Column(name = "DELIV_STORE_CD")
	private String delivStoreCd;

	@Column(name = "DIST_LN_COUNT")
	private BigDecimal distLnCount;

	@Column(name = "DIST_METHOD_CD")
	private String distMethodCd;

	@Temporal(TemporalType.DATE)
	@Column(name = "DO_NOT_SHIP_BEFORE_DT")
	private Date doNotShipBeforeDt;

	@Column(name = "EMP_INIT_BUY")
	private String empInitBuy;

	@Column(name = "FACT_CD")
	private String factCd;

	private String fob;

	@Column(name = "FRT_MIN_CST")
	private BigDecimal frtMinCst;

	@Column(name = "FRT_MIN_QTY")
	private BigDecimal frtMinQty;

	@Column(name = "FRT_MIN_WEIGHT")
	private BigDecimal frtMinWeight;

	@Column(name = "FRT_TERMS")
	private String frtTerms;

	@Column(name = "GP_CMNT_SEQ_NUM")
	private BigDecimal gpCmntSeqNum;

	@Column(name = "LN_COUNT")
	private BigDecimal lnCount;

	@Temporal(TemporalType.DATE)
	@Column(name = "LST_CHNG_DT")
	private Date lstChngDt;

	@Column(name = "LST_CHNG_EMP_INIT")
	private String lstChngEmpInit;

	@Temporal(TemporalType.DATE)
	@Column(name = "ORD_DT")
	private Date ordDt;

	@Column(name = "ORIGIN_CD")
	private String originCd;

	@Column(name = "PAY_VE")
	private String payVe;

	@Column(name = "PC_NUM")
	private String pcNum;

	@Column(name = "POG_NUM")
	private BigDecimal pogNum;

	@Temporal(TemporalType.DATE)
	@Column(name = "PRINT_DT")
	private Date printDt;

	@Column(name = "RB_PCT")
	private BigDecimal rbPct;

	@Column(name = "SEASON_CD")
	private String seasonCd;

	@Temporal(TemporalType.DATE)
	@Column(name = "SHIP_CMPLT_DT")
	private Date shipCmpltDt;

	@Column(name = "SHIP_VIA")
	private String shipVia;

	@Column(name = "STAT_CD")
	private String statCd;

	@Temporal(TemporalType.DATE)
	@Column(name = "STAT_DT")
	private Date statDt;

	@Temporal(TemporalType.DATE)
	@Column(name = "STAT_DT_TIME")
	private Date statDtTime;

	@Column(name = "STORE_PACKED")
	private String storePacked;

	@Column(name = "TERMS_CMNT")
	private String termsCmnt;

	@Column(name = "TERMS_DAYS")
	private BigDecimal termsDays;

	@Column(name = "TERMS_KEY")
	private BigDecimal termsKey;

	@Column(name = "TERMS_PCT")
	private BigDecimal termsPct;

	@Temporal(TemporalType.DATE)
	private Date udf1;

	private BigDecimal udf2;

	private String udf3;

	private String udf4;

	private String udf5;

	@Temporal(TemporalType.DATE)
	@Column(name = "UPD_DT_TIME")
	private Date updDtTime;

	@Column(name = "VE_CD")
	private String veCd;

	@Column(name = "XMIT_BY")
	private String xmitBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "XMIT_DT")
	private Date xmitDt;

//	@OneToMany(mappedBy = "gmPoLnKey.poNum",cascade = CascadeType.PERSIST)
//	private List<GmPoLn> poLns = new ArrayList<GmPoLn>();
//	public List<GmPoLn> getPoLns() {
//		poLns=poLns==null?new ArrayList<GmPoLn>():poLns;
//		return poLns;
//	}
//
//	public void setPoLns(List<GmPoLn> poLns) {
//		this.poLns = poLns;
//	}
//	
//	public void addPoLns(GmPoLn poLn) {
//		this.poLns.add(poLn);
//	}

	@Transient
	private List<GpCmnt> gpCmnt;

	public List<GpCmnt> getGpCmnt() {
		try {
//			this.gpCmnt = CmntDao.getCmnt(gpCmntSeqNum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return gpCmnt;
	}

	public void setGpCmnt(List<GpCmnt> gpCmnt) {
		this.gpCmnt = gpCmnt;
	}



	public GmPo() {
	}

	public BigDecimal getPoNum() {
		return this.poNum;
	}

	public void setPoNum(BigDecimal poNum) {
		this.poNum = poNum;
	}

	public Date getAppDt() {
		return this.appDt;
	}

	public void setAppDt(Date appDt) {
		this.appDt = appDt;
	}

	public String getAppInit() {
		return this.appInit;
	}

	public void setAppInit(String appInit) {
		this.appInit = appInit;
	}

	public String getBackOrd() {
		return this.backOrd;
	}

	public void setBackOrd(String backOrd) {
		this.backOrd = backOrd;
	}

	public Date getCancelDt() {
		return this.cancelDt;
	}

	public void setCancelDt(Date cancelDt) {
		this.cancelDt = cancelDt;
	}

	public Date getCreateDt() {
		return this.createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

	public BigDecimal getDaysNet() {
		return this.daysNet;
	}

	public void setDaysNet(BigDecimal daysNet) {
		this.daysNet = daysNet;
	}

	public String getDelivStoreCd() {
		return this.delivStoreCd;
	}

	public void setDelivStoreCd(String delivStoreCd) {
		this.delivStoreCd = delivStoreCd;
	}

	public BigDecimal getDistLnCount() {
		return this.distLnCount;
	}

	public void setDistLnCount(BigDecimal distLnCount) {
		this.distLnCount = distLnCount;
	}

	public String getDistMethodCd() {
		return this.distMethodCd;
	}

	public void setDistMethodCd(String distMethodCd) {
		this.distMethodCd = distMethodCd;
	}

	public Date getDoNotShipBeforeDt() {
		return this.doNotShipBeforeDt;
	}

	public void setDoNotShipBeforeDt(Date doNotShipBeforeDt) {
		this.doNotShipBeforeDt = doNotShipBeforeDt;
	}

	public String getEmpInitBuy() {
		return this.empInitBuy;
	}

	public void setEmpInitBuy(String empInitBuy) {
		this.empInitBuy = empInitBuy;
	}

	public String getFactCd() {
		return this.factCd;
	}

	public void setFactCd(String factCd) {
		this.factCd = factCd;
	}

	public String getFob() {
		return this.fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public BigDecimal getFrtMinCst() {
		return this.frtMinCst;
	}

	public void setFrtMinCst(BigDecimal frtMinCst) {
		this.frtMinCst = frtMinCst;
	}

	public BigDecimal getFrtMinQty() {
		return this.frtMinQty;
	}

	public void setFrtMinQty(BigDecimal frtMinQty) {
		this.frtMinQty = frtMinQty;
	}

	public BigDecimal getFrtMinWeight() {
		return this.frtMinWeight;
	}

	public void setFrtMinWeight(BigDecimal frtMinWeight) {
		this.frtMinWeight = frtMinWeight;
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

	public BigDecimal getLnCount() {
		return this.lnCount;
	}

	public void setLnCount(BigDecimal lnCount) {
		this.lnCount = lnCount;
	}

	public Date getLstChngDt() {
		return this.lstChngDt;
	}

	public void setLstChngDt(Date lstChngDt) {
		this.lstChngDt = lstChngDt;
	}

	public String getLstChngEmpInit() {
		return this.lstChngEmpInit;
	}

	public void setLstChngEmpInit(String lstChngEmpInit) {
		this.lstChngEmpInit = lstChngEmpInit;
	}

	public Date getOrdDt() {
		return this.ordDt;
	}

	public void setOrdDt(Date ordDt) {
		this.ordDt = ordDt;
	}

	public String getOriginCd() {
		return this.originCd;
	}

	public void setOriginCd(String originCd) {
		this.originCd = originCd;
	}

	public String getPayVe() {
		return this.payVe;
	}

	public void setPayVe(String payVe) {
		this.payVe = payVe;
	}

	public String getPcNum() {
		return this.pcNum;
	}

	public void setPcNum(String pcNum) {
		this.pcNum = pcNum;
	}

	public BigDecimal getPogNum() {
		return this.pogNum;
	}

	public void setPogNum(BigDecimal pogNum) {
		this.pogNum = pogNum;
	}

	public Date getPrintDt() {
		return this.printDt;
	}

	public void setPrintDt(Date printDt) {
		this.printDt = printDt;
	}

	public BigDecimal getRbPct() {
		return this.rbPct;
	}

	public void setRbPct(BigDecimal rbPct) {
		this.rbPct = rbPct;
	}

	public String getSeasonCd() {
		return this.seasonCd;
	}

	public void setSeasonCd(String seasonCd) {
		this.seasonCd = seasonCd;
	}

	public Date getShipCmpltDt() {
		return this.shipCmpltDt;
	}

	public void setShipCmpltDt(Date shipCmpltDt) {
		this.shipCmpltDt = shipCmpltDt;
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

	public Date getStatDt() {
		return this.statDt;
	}

	public void setStatDt(Date statDt) {
		this.statDt = statDt;
	}

	public Date getStatDtTime() {
		return this.statDtTime;
	}

	public void setStatDtTime(Date statDtTime) {
		this.statDtTime = statDtTime;
	}

	public String getStorePacked() {
		return this.storePacked;
	}

	public void setStorePacked(String storePacked) {
		this.storePacked = storePacked;
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

	public Date getUdf1() {
		return this.udf1;
	}

	public void setUdf1(Date udf1) {
		this.udf1 = udf1;
	}

	public BigDecimal getUdf2() {
		return this.udf2;
	}

	public void setUdf2(BigDecimal udf2) {
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

	public String getUdf5() {
		return this.udf5;
	}

	public void setUdf5(String udf5) {
		this.udf5 = udf5;
	}

	public Date getUpdDtTime() {
		return this.updDtTime;
	}

	public void setUpdDtTime(Date updDtTime) {
		this.updDtTime = updDtTime;
	}

	public String getVeCd() {
		return this.veCd;
	}

	public void setVeCd(String veCd) {
		this.veCd = veCd;
	}

	public String getXmitBy() {
		return this.xmitBy;
	}

	public void setXmitBy(String xmitBy) {
		this.xmitBy = xmitBy;
	}

	public Date getXmitDt() {
		return this.xmitDt;
	}

	public void setXmitDt(Date xmitDt) {
		this.xmitDt = xmitDt;
	}

	@Override
	public String toString() {
		return "GmPo [poNum=" + poNum + ", appDt=" + appDt + ", appInit=" + appInit + ", backOrd=" + backOrd
				+ ", cancelDt=" + cancelDt + ", createDt=" + createDt + ", daysNet=" + daysNet + ", delivStoreCd="
				+ delivStoreCd + ", distLnCount=" + distLnCount + ", distMethodCd=" + distMethodCd
				+ ", doNotShipBeforeDt=" + doNotShipBeforeDt + ", empInitBuy=" + empInitBuy + ", factCd=" + factCd
				+ ", fob=" + fob + ", frtMinCst=" + frtMinCst + ", frtMinQty=" + frtMinQty + ", frtMinWeight="
				+ frtMinWeight + ", frtTerms=" + frtTerms + ", gpCmntSeqNum=" + gpCmntSeqNum + ", lnCount=" + lnCount
				+ ", lstChngDt=" + lstChngDt + ", lstChngEmpInit=" + lstChngEmpInit + ", ordDt=" + ordDt + ", originCd="
				+ originCd + ", payVe=" + payVe + ", pcNum=" + pcNum + ", pogNum=" + pogNum + ", printDt=" + printDt
				+ ", rbPct=" + rbPct + ", seasonCd=" + seasonCd + ", shipCmpltDt=" + shipCmpltDt + ", shipVia="
				+ shipVia + ", statCd=" + statCd + ", statDt=" + statDt + ", statDtTime=" + statDtTime
				+ ", storePacked=" + storePacked + ", termsCmnt=" + termsCmnt + ", termsDays=" + termsDays
				+ ", termsKey=" + termsKey + ", termsPct=" + termsPct + ", udf1=" + udf1 + ", udf2=" + udf2 + ", udf3="
				+ udf3 + ", udf4=" + udf4 + ", udf5=" + udf5 + ", updDtTime=" + updDtTime + ", veCd=" + veCd
				+ ", xmitBy=" + xmitBy + ", xmitDt=" + xmitDt +  "]";
	}

}