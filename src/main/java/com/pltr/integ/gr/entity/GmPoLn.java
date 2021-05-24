package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the GM_PO_LN database table.
 * 
 */
@Entity
@Table(schema = "GM_MERCH",name="GM_PO_LN")
@NamedQuery(name="GmPoLn.findAll", query="SELECT g FROM GmPoLn g")
public class GmPoLn implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private GmPoLnKey gmPoLnKey;
	

	public GmPoLnKey getGmPoLnKey() {
		return gmPoLnKey;
	}

	public void setGmPoLnKey(GmPoLnKey gmPoLnKey) {
		this.gmPoLnKey = gmPoLnKey;
	}

	@Column(name="BILL_CD")
	private String billCd;

	@Column(name="BILL_QTY")
	private BigDecimal billQty;

	@Column(name="BUY_CD")
	private String buyCd;

	@Column(name="CLASS_CD")
	private String classCd;

	@Column(name="CORE_CST")
	private BigDecimal coreCst;

	@Column(name="CORE_RET_PRC")
	private BigDecimal coreRetPrc;

	private BigDecimal cst;

	@Column(name="DA_ORD_QTY")
	private BigDecimal daOrdQty;

	@Column(name="DEPT_CD")
	private String deptCd;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="EMP_INIT_CST_OVR")
	private String empInitCstOvr;

	@Column(name="EMP_INIT_FRZ_CST")
	private String empInitFrzCst;

	@Temporal(TemporalType.DATE)
	@Column(name="ETA_DT")
	private Date etaDt;

	@Temporal(TemporalType.DATE)
	@Column(name="ETA_DT_INS_UPD")
	private Date etaDtInsUpd;

	@Column(name="ITM_CD")
	private String itmCd;

	@Column(name="LN_STATUS")
	private String lnStatus;

	@Column(name="NET_BUY_CST")
	private BigDecimal netBuyCst;

	@Column(name="ORIG_BUY_QTY")
	private BigDecimal origBuyQty;

	@Column(name="ORIG_XFR_QTY")
	private BigDecimal origXfrQty;

	@Column(name="PPK_COLOR_CD")
	private String ppkColorCd;

	@Column(name="PPK_QTY")
	private BigDecimal ppkQty;

	@Column(name="PREPACK_CD")
	private String prepackCd;

	private BigDecimal qty;

	@Column(name="RET_PRC")
	private BigDecimal retPrc;

	@Column(name="RTD_DIST_QTY")
	private BigDecimal rtdDistQty;

	@Column(name="RTD_QTY")
	private BigDecimal rtdQty;

	@Column(name="RTV_DA_TP")
	private String rtvDaTp;

	@Column(name="SKU_NUM")
	private String skuNum;

	@Column(name="STORE_ORD_LN_SEQ_NUM")
	private BigDecimal storeOrdLnSeqNum;

	@Column(name="STORE_ORD_NUM")
	private BigDecimal storeOrdNum;

	@Column(name="SUBCLASS_CD")
	private String subclassCd;

	@Column(name="TAX_TP")
	private String taxTp;

	@Column(name="TOT_DISC")
	private BigDecimal totDisc;

	@Column(name="TOT_DIST_QTY")
	private BigDecimal totDistQty;

	@Column(name="TOT_FRT")
	private BigDecimal totFrt;

	@Column(name="TOT_LC")
	private BigDecimal totLc;

	@Column(name="TOT_TERMS")
	private BigDecimal totTerms;

	@Column(name="UPC_CD")
	private String upcCd;

	@Column(name="VE_CD")
	private String veCd;

	private String vsn;

	private BigDecimal weight;
	
//	@OneToMany
//	@JoinColumns( {
//        @JoinColumn(name = "PO_NUM", referencedColumnName = "PO_NUM"),
//        @JoinColumn(name = "PO_LN_SEQ_NUM", referencedColumnName = "PO_LN_SEQ_NUM")
//    })
//	private List<GmPoLnShip> poLnShips;
//	
//	public List<GmPoLnShip> getPoLnShips() {
//		poLnShips=poLnShips==null? new ArrayList<GmPoLnShip>():poLnShips;
//		return poLnShips;
//	}
//
//	public void setPoLnShips(List<GmPoLnShip> poLnShips) {
//		getPoLnShips();
//		this.poLnShips = poLnShips;
//	}
//	
//	public void addPoLnShips(GmPoLnShip poLnShip) {
//		this.poLnShips.add(poLnShip);
//	}

	public GmPoLn() {
	}

	public String getBillCd() {
		return this.billCd;
	}

	public void setBillCd(String billCd) {
		this.billCd = billCd;
	}

	public BigDecimal getBillQty() {
		return this.billQty;
	}

	public void setBillQty(BigDecimal billQty) {
		this.billQty = billQty;
	}

	public String getBuyCd() {
		return this.buyCd;
	}

	public void setBuyCd(String buyCd) {
		this.buyCd = buyCd;
	}

	public String getClassCd() {
		return this.classCd;
	}

	public void setClassCd(String classCd) {
		this.classCd = classCd;
	}

	public BigDecimal getCoreCst() {
		return this.coreCst;
	}

	public void setCoreCst(BigDecimal coreCst) {
		this.coreCst = coreCst;
	}

	public BigDecimal getCoreRetPrc() {
		return this.coreRetPrc;
	}

	public void setCoreRetPrc(BigDecimal coreRetPrc) {
		this.coreRetPrc = coreRetPrc;
	}

	public BigDecimal getCst() {
		return this.cst;
	}

	public void setCst(BigDecimal cst) {
		this.cst = cst;
	}

	public BigDecimal getDaOrdQty() {
		return this.daOrdQty;
	}

	public void setDaOrdQty(BigDecimal daOrdQty) {
		this.daOrdQty = daOrdQty;
	}

	public String getDeptCd() {
		return this.deptCd;
	}

	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}

	public String getDivCd() {
		return this.divCd;
	}

	public void setDivCd(String divCd) {
		this.divCd = divCd;
	}

	public String getEmpInitCstOvr() {
		return this.empInitCstOvr;
	}

	public void setEmpInitCstOvr(String empInitCstOvr) {
		this.empInitCstOvr = empInitCstOvr;
	}

	public String getEmpInitFrzCst() {
		return this.empInitFrzCst;
	}

	public void setEmpInitFrzCst(String empInitFrzCst) {
		this.empInitFrzCst = empInitFrzCst;
	}

	public Date getEtaDt() {
		return this.etaDt;
	}

	public void setEtaDt(Date etaDt) {
		this.etaDt = etaDt;
	}

	public Date getEtaDtInsUpd() {
		return this.etaDtInsUpd;
	}

	public void setEtaDtInsUpd(Date etaDtInsUpd) {
		this.etaDtInsUpd = etaDtInsUpd;
	}

	public String getItmCd() {
		return this.itmCd;
	}

	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	public String getLnStatus() {
		return this.lnStatus;
	}

	public void setLnStatus(String lnStatus) {
		this.lnStatus = lnStatus;
	}

	public BigDecimal getNetBuyCst() {
		return this.netBuyCst;
	}

	public void setNetBuyCst(BigDecimal netBuyCst) {
		this.netBuyCst = netBuyCst;
	}

	public BigDecimal getOrigBuyQty() {
		return this.origBuyQty;
	}

	public void setOrigBuyQty(BigDecimal origBuyQty) {
		this.origBuyQty = origBuyQty;
	}

	public BigDecimal getOrigXfrQty() {
		return this.origXfrQty;
	}

	public void setOrigXfrQty(BigDecimal origXfrQty) {
		this.origXfrQty = origXfrQty;
	}

	public String getPpkColorCd() {
		return this.ppkColorCd;
	}

	public void setPpkColorCd(String ppkColorCd) {
		this.ppkColorCd = ppkColorCd;
	}

	public BigDecimal getPpkQty() {
		return this.ppkQty;
	}

	public void setPpkQty(BigDecimal ppkQty) {
		this.ppkQty = ppkQty;
	}

	public String getPrepackCd() {
		return this.prepackCd;
	}

	public void setPrepackCd(String prepackCd) {
		this.prepackCd = prepackCd;
	}

	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getRetPrc() {
		return this.retPrc;
	}

	public void setRetPrc(BigDecimal retPrc) {
		this.retPrc = retPrc;
	}

	public BigDecimal getRtdDistQty() {
		return this.rtdDistQty;
	}

	public void setRtdDistQty(BigDecimal rtdDistQty) {
		this.rtdDistQty = rtdDistQty;
	}

	public BigDecimal getRtdQty() {
		return this.rtdQty;
	}

	public void setRtdQty(BigDecimal rtdQty) {
		this.rtdQty = rtdQty;
	}

	public String getRtvDaTp() {
		return this.rtvDaTp;
	}

	public void setRtvDaTp(String rtvDaTp) {
		this.rtvDaTp = rtvDaTp;
	}

	public String getSkuNum() {
		return this.skuNum;
	}

	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}

	public BigDecimal getStoreOrdLnSeqNum() {
		return this.storeOrdLnSeqNum;
	}

	public void setStoreOrdLnSeqNum(BigDecimal storeOrdLnSeqNum) {
		this.storeOrdLnSeqNum = storeOrdLnSeqNum;
	}

	public BigDecimal getStoreOrdNum() {
		return this.storeOrdNum;
	}

	public void setStoreOrdNum(BigDecimal storeOrdNum) {
		this.storeOrdNum = storeOrdNum;
	}

	public String getSubclassCd() {
		return this.subclassCd;
	}

	public void setSubclassCd(String subclassCd) {
		this.subclassCd = subclassCd;
	}

	public String getTaxTp() {
		return this.taxTp;
	}

	public void setTaxTp(String taxTp) {
		this.taxTp = taxTp;
	}

	public BigDecimal getTotDisc() {
		return this.totDisc;
	}

	public void setTotDisc(BigDecimal totDisc) {
		this.totDisc = totDisc;
	}

	public BigDecimal getTotDistQty() {
		return this.totDistQty;
	}

	public void setTotDistQty(BigDecimal totDistQty) {
		this.totDistQty = totDistQty;
	}

	public BigDecimal getTotFrt() {
		return this.totFrt;
	}

	public void setTotFrt(BigDecimal totFrt) {
		this.totFrt = totFrt;
	}

	public BigDecimal getTotLc() {
		return this.totLc;
	}

	public void setTotLc(BigDecimal totLc) {
		this.totLc = totLc;
	}

	public BigDecimal getTotTerms() {
		return this.totTerms;
	}

	public void setTotTerms(BigDecimal totTerms) {
		this.totTerms = totTerms;
	}

	public String getUpcCd() {
		return this.upcCd;
	}

	public void setUpcCd(String upcCd) {
		this.upcCd = upcCd;
	}

	public String getVeCd() {
		return this.veCd;
	}

	public void setVeCd(String veCd) {
		this.veCd = veCd;
	}

	public String getVsn() {
		return this.vsn;
	}

	public void setVsn(String vsn) {
		this.vsn = vsn;
	}

	public BigDecimal getWeight() {
		return this.weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "\nGmPoLn [gmPnLnPk=" + gmPoLnKey + ", billCd=" + billCd + ", billQty=" + billQty + ", buyCd=" + buyCd
				+ ", classCd=" + classCd + ", coreCst=" + coreCst + ", coreRetPrc=" + coreRetPrc + ", cst=" + cst
				+ ", daOrdQty=" + daOrdQty + ", deptCd=" + deptCd + ", divCd=" + divCd + ", empInitCstOvr="
				+ empInitCstOvr + ", empInitFrzCst=" + empInitFrzCst + ", etaDt=" + etaDt + ", etaDtInsUpd="
				+ etaDtInsUpd + ", itmCd=" + itmCd + ", lnStatus=" + lnStatus + ", netBuyCst=" + netBuyCst
				+ ", origBuyQty=" + origBuyQty + ", origXfrQty=" + origXfrQty + ", ppkColorCd=" + ppkColorCd
				+ ", ppkQty=" + ppkQty + ", prepackCd=" + prepackCd + ", qty=" + qty + ", retPrc=" + retPrc
				+ ", rtdDistQty=" + rtdDistQty + ", rtdQty=" + rtdQty + ", rtvDaTp=" + rtvDaTp + ", skuNum=" + skuNum
				+ ", storeOrdLnSeqNum=" + storeOrdLnSeqNum + ", storeOrdNum=" + storeOrdNum + ", subclassCd="
				+ subclassCd + ", taxTp=" + taxTp + ", totDisc=" + totDisc + ", totDistQty=" + totDistQty + ", totFrt="
				+ totFrt + ", totLc=" + totLc + ", totTerms=" + totTerms + ", upcCd=" + upcCd + ", veCd=" + veCd
				+ ", vsn=" + vsn + ", weight=" + weight + ", poLnShips= + poLnShips"  + "]";
	}
	

}