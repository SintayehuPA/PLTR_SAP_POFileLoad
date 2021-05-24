package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GM_ITM database table.
 * 
 */
@Entity
@Table(name="GM_ITM", schema="GM_INV" )
@NamedQuery(name="GmItm.findAll", query="SELECT g FROM GmItm g")
public class GmItm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ITM_CD")
	private String itmCd;

	private String aisle;

	@Column(name="ALLOC_CD")
	private String allocCd;

	@Column(name="AVG_CST_QTY")
	private BigDecimal avgCstQty;

	@Column(name="AVG_CST_TOT")
	private BigDecimal avgCstTot;

	@Temporal(TemporalType.DATE)
	@Column(name="BEG_PO_REVW_DT")
	private Date begPoRevwDt;

	@Temporal(TemporalType.DATE)
	@Column(name="BEG_RB_DT")
	private Date begRbDt;

	@Column(name="BILL_CD")
	private String billCd;

	@Column(name="BILL_QTY")
	private BigDecimal billQty;

	@Column(name="BUY_CD")
	private String buyCd;

	@Column(name="BUY_INCR")
	private BigDecimal buyIncr;

	@Column(name="BUY_QTY")
	private BigDecimal buyQty;

	@Column(name="CLASS_CD")
	private String classCd;

	@Column(name="COOR_GRP_CD")
	private String coorGrpCd;

	@Column(name="CORE_CD")
	private String coreCd;

	@Column(name="CRIT_REPLEN_CD")
	private String critReplenCd;

	@Column(name="CSHR_PRC")
	private String cshrPrc;

	@Column(name="CSHR_VAL")
	private String cshrVal;

	@Column(name="DC_CD")
	private String dcCd;

	@Temporal(TemporalType.DATE)
	@Column(name="DC_DT")
	private Date dcDt;

	@Column(name="DEPT_CD")
	private String deptCd;

	private String des1;

	private String des2;

	@Column(name="DFLT_WHS_UOM")
	private String dfltWhsUom;

	private String disc;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="ELIGIBLE_PO_REVIEW")
	private String eligiblePoReview;

	@Temporal(TemporalType.DATE)
	@Column(name="END_PO_REVW_DT")
	private Date endPoRevwDt;

	@Temporal(TemporalType.DATE)
	@Column(name="END_RB_DT")
	private Date endRbDt;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_RCV_DT")
	private Date firstRcvDt;

	private String generic;

	@Column(name="GP_CMNT_SEQ_NUM")
	private BigDecimal gpCmntSeqNum;

	@Column(name="GRID_FLAG")
	private String gridFlag;

	@Column(name="GRID_LBL_1")
	private String gridLbl1;

	@Column(name="GRID_LBL_2")
	private String gridLbl2;

	@Column(name="GRID_LBL_3")
	private String gridLbl3;

	@Column(name="HST_BY_GRID_SKU")
	private String hstByGridSku;

	@Column(name="INC_PLU")
	private String incPlu;

	@Column(name="INNER_PACK_CD")
	private String innerPackCd;

	@Column(name="INNER_PACK_QTY")
	private BigDecimal innerPackQty;

	@Column(name="INNER_PACK_RU_PCT")
	private BigDecimal innerPackRuPct;

	private String inventory;

	@Column(name="ITM_TP_CD")
	private String itmTpCd;

	@Column(name="KEY_VALUE")
	private String keyValue;

	@Column(name="LIST_PRC")
	private BigDecimal listPrc;

	@Column(name="LST_BUY_CST")
	private BigDecimal lstBuyCst;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_BUY_CST_CHNG_DT")
	private Date lstBuyCstChngDt;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_RCV_DT")
	private Date lstRcvDt;

	@Column(name="LST_TERMS_AMT")
	private BigDecimal lstTermsAmt;

	@Column(name="MASTER_PACK_CD")
	private String masterPackCd;

	@Column(name="MASTER_PACK_QTY")
	private BigDecimal masterPackQty;

	@Column(name="MASTER_PACK_RU_PCT")
	private BigDecimal masterPackRuPct;

	@Column(name="MGR_MKDN")
	private String mgrMkdn;

	@Column(name="MSS_CD")
	private String mssCd;

	@Column(name="MSS_QTY")
	private BigDecimal mssQty;

	@Column(name="MSS_RU_PCT")
	private BigDecimal mssRuPct;

	@Column(name="NEG_PRC")
	private String negPrc;

	@Column(name="ORIGIN_CD")
	private String originCd;

	@Column(name="PALLET_LAYER_QTY")
	private BigDecimal palletLayerQty;

	@Column(name="PALLET_LAYER_RU_PCT")
	private BigDecimal palletLayerRuPct;

	@Column(name="PALLET_QTY")
	private BigDecimal palletQty;

	@Column(name="PALLET_RU_PCT")
	private BigDecimal palletRuPct;

	@Column(name="PO_DIST_METHOD_CD")
	private String poDistMethodCd;

	@Column(name="PRC_STAT")
	private String prcStat;

	@Column(name="PREPACK_CD")
	private String prepackCd;

	@Column(name="PRIMARY_VE_CD")
	private String primaryVeCd;

	@Column(name="PUT_CD")
	private String putCd;

	@Column(name="RANKING_CD")
	private String rankingCd;

	@Column(name="REG_DES")
	private String regDes;

	@Column(name="REPLEN_CD")
	private String replenCd;

	@Column(name="RET_PRC")
	private BigDecimal retPrc;

	@Column(name="\"RETURNS\"")
	private String returns;

	@Column(name="ROQ_CD")
	private String roqCd;

	@Column(name="RTV_DA_TP")
	private String rtvDaTp;

	@Column(name="RTV_VIA_CD")
	private String rtvViaCd;

	@Column(name="SEASON_CD")
	private String seasonCd;

	@Column(name="SHELF_CD")
	private String shelfCd;

	@Column(name="SHELF_QTY")
	private BigDecimal shelfQty;

	@Column(name="SPEC_ORD")
	private String specOrd;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	@Column(name="STAT_CD")
	private String statCd;

	@Column(name="STORE_ORD")
	private String storeOrd;

	@Column(name="SUBCLASS_CD")
	private String subclassCd;

	@Column(name="TAX_TP")
	private String taxTp;

	@Column(name="TKT_CD")
	private String tktCd;

	@Column(name="TNET_VSN_PREFIX")
	private String tnetVsnPrefix;

	private String udf1;

	private String udf2;

	private String udf3;

	private String udf4;

	private BigDecimal udf5;

	private BigDecimal udf6;

	@Column(name="UNIT_CD")
	private String unitCd;

	@Column(name="UNIT_QTY")
	private BigDecimal unitQty;

	@Temporal(TemporalType.DATE)
	@Column(name="UPD_DT_TIME")
	private Date updDtTime;

	@Column(name="VE_CD")
	private String veCd;

	@Column(name="VE_UPC")
	private String veUpc;

	private BigDecimal vol;

	private String vsn;

	private BigDecimal weight;

	public GmItm() {
	}

	public String getItmCd() {
		return this.itmCd;
	}

	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	public String getAisle() {
		return this.aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	public String getAllocCd() {
		return this.allocCd;
	}

	public void setAllocCd(String allocCd) {
		this.allocCd = allocCd;
	}

	public BigDecimal getAvgCstQty() {
		return this.avgCstQty;
	}

	public void setAvgCstQty(BigDecimal avgCstQty) {
		this.avgCstQty = avgCstQty;
	}

	public BigDecimal getAvgCstTot() {
		return this.avgCstTot;
	}

	public void setAvgCstTot(BigDecimal avgCstTot) {
		this.avgCstTot = avgCstTot;
	}

	public Date getBegPoRevwDt() {
		return this.begPoRevwDt;
	}

	public void setBegPoRevwDt(Date begPoRevwDt) {
		this.begPoRevwDt = begPoRevwDt;
	}

	public Date getBegRbDt() {
		return this.begRbDt;
	}

	public void setBegRbDt(Date begRbDt) {
		this.begRbDt = begRbDt;
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

	public BigDecimal getBuyIncr() {
		return this.buyIncr;
	}

	public void setBuyIncr(BigDecimal buyIncr) {
		this.buyIncr = buyIncr;
	}

	public BigDecimal getBuyQty() {
		return this.buyQty;
	}

	public void setBuyQty(BigDecimal buyQty) {
		this.buyQty = buyQty;
	}

	public String getClassCd() {
		return this.classCd;
	}

	public void setClassCd(String classCd) {
		this.classCd = classCd;
	}

	public String getCoorGrpCd() {
		return this.coorGrpCd;
	}

	public void setCoorGrpCd(String coorGrpCd) {
		this.coorGrpCd = coorGrpCd;
	}

	public String getCoreCd() {
		return this.coreCd;
	}

	public void setCoreCd(String coreCd) {
		this.coreCd = coreCd;
	}

	public String getCritReplenCd() {
		return this.critReplenCd;
	}

	public void setCritReplenCd(String critReplenCd) {
		this.critReplenCd = critReplenCd;
	}

	public String getCshrPrc() {
		return this.cshrPrc;
	}

	public void setCshrPrc(String cshrPrc) {
		this.cshrPrc = cshrPrc;
	}

	public String getCshrVal() {
		return this.cshrVal;
	}

	public void setCshrVal(String cshrVal) {
		this.cshrVal = cshrVal;
	}

	public String getDcCd() {
		return this.dcCd;
	}

	public void setDcCd(String dcCd) {
		this.dcCd = dcCd;
	}

	public Date getDcDt() {
		return this.dcDt;
	}

	public void setDcDt(Date dcDt) {
		this.dcDt = dcDt;
	}

	public String getDeptCd() {
		return this.deptCd;
	}

	public void setDeptCd(String deptCd) {
		this.deptCd = deptCd;
	}

	public String getDes1() {
		return this.des1;
	}

	public void setDes1(String des1) {
		this.des1 = des1;
	}

	public String getDes2() {
		return this.des2;
	}

	public void setDes2(String des2) {
		this.des2 = des2;
	}

	public String getDfltWhsUom() {
		return this.dfltWhsUom;
	}

	public void setDfltWhsUom(String dfltWhsUom) {
		this.dfltWhsUom = dfltWhsUom;
	}

	public String getDisc() {
		return this.disc;
	}

	public void setDisc(String disc) {
		this.disc = disc;
	}

	public String getDivCd() {
		return this.divCd;
	}

	public void setDivCd(String divCd) {
		this.divCd = divCd;
	}

	public String getEligiblePoReview() {
		return this.eligiblePoReview;
	}

	public void setEligiblePoReview(String eligiblePoReview) {
		this.eligiblePoReview = eligiblePoReview;
	}

	public Date getEndPoRevwDt() {
		return this.endPoRevwDt;
	}

	public void setEndPoRevwDt(Date endPoRevwDt) {
		this.endPoRevwDt = endPoRevwDt;
	}

	public Date getEndRbDt() {
		return this.endRbDt;
	}

	public void setEndRbDt(Date endRbDt) {
		this.endRbDt = endRbDt;
	}

	public Date getFirstRcvDt() {
		return this.firstRcvDt;
	}

	public void setFirstRcvDt(Date firstRcvDt) {
		this.firstRcvDt = firstRcvDt;
	}

	public String getGeneric() {
		return this.generic;
	}

	public void setGeneric(String generic) {
		this.generic = generic;
	}

	public BigDecimal getGpCmntSeqNum() {
		return this.gpCmntSeqNum;
	}

	public void setGpCmntSeqNum(BigDecimal gpCmntSeqNum) {
		this.gpCmntSeqNum = gpCmntSeqNum;
	}

	public String getGridFlag() {
		return this.gridFlag;
	}

	public void setGridFlag(String gridFlag) {
		this.gridFlag = gridFlag;
	}

	public String getGridLbl1() {
		return this.gridLbl1;
	}

	public void setGridLbl1(String gridLbl1) {
		this.gridLbl1 = gridLbl1;
	}

	public String getGridLbl2() {
		return this.gridLbl2;
	}

	public void setGridLbl2(String gridLbl2) {
		this.gridLbl2 = gridLbl2;
	}

	public String getGridLbl3() {
		return this.gridLbl3;
	}

	public void setGridLbl3(String gridLbl3) {
		this.gridLbl3 = gridLbl3;
	}

	public String getHstByGridSku() {
		return this.hstByGridSku;
	}

	public void setHstByGridSku(String hstByGridSku) {
		this.hstByGridSku = hstByGridSku;
	}

	public String getIncPlu() {
		return this.incPlu;
	}

	public void setIncPlu(String incPlu) {
		this.incPlu = incPlu;
	}

	public String getInnerPackCd() {
		return this.innerPackCd;
	}

	public void setInnerPackCd(String innerPackCd) {
		this.innerPackCd = innerPackCd;
	}

	public BigDecimal getInnerPackQty() {
		return this.innerPackQty;
	}

	public void setInnerPackQty(BigDecimal innerPackQty) {
		this.innerPackQty = innerPackQty;
	}

	public BigDecimal getInnerPackRuPct() {
		return this.innerPackRuPct;
	}

	public void setInnerPackRuPct(BigDecimal innerPackRuPct) {
		this.innerPackRuPct = innerPackRuPct;
	}

	public String getInventory() {
		return this.inventory;
	}

	public void setInventory(String inventory) {
		this.inventory = inventory;
	}

	public String getItmTpCd() {
		return this.itmTpCd;
	}

	public void setItmTpCd(String itmTpCd) {
		this.itmTpCd = itmTpCd;
	}

	public String getKeyValue() {
		return this.keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public BigDecimal getListPrc() {
		return this.listPrc;
	}

	public void setListPrc(BigDecimal listPrc) {
		this.listPrc = listPrc;
	}

	public BigDecimal getLstBuyCst() {
		return this.lstBuyCst;
	}

	public void setLstBuyCst(BigDecimal lstBuyCst) {
		this.lstBuyCst = lstBuyCst;
	}

	public Date getLstBuyCstChngDt() {
		return this.lstBuyCstChngDt;
	}

	public void setLstBuyCstChngDt(Date lstBuyCstChngDt) {
		this.lstBuyCstChngDt = lstBuyCstChngDt;
	}

	public Date getLstRcvDt() {
		return this.lstRcvDt;
	}

	public void setLstRcvDt(Date lstRcvDt) {
		this.lstRcvDt = lstRcvDt;
	}

	public BigDecimal getLstTermsAmt() {
		return this.lstTermsAmt;
	}

	public void setLstTermsAmt(BigDecimal lstTermsAmt) {
		this.lstTermsAmt = lstTermsAmt;
	}

	public String getMasterPackCd() {
		return this.masterPackCd;
	}

	public void setMasterPackCd(String masterPackCd) {
		this.masterPackCd = masterPackCd;
	}

	public BigDecimal getMasterPackQty() {
		return this.masterPackQty;
	}

	public void setMasterPackQty(BigDecimal masterPackQty) {
		this.masterPackQty = masterPackQty;
	}

	public BigDecimal getMasterPackRuPct() {
		return this.masterPackRuPct;
	}

	public void setMasterPackRuPct(BigDecimal masterPackRuPct) {
		this.masterPackRuPct = masterPackRuPct;
	}

	public String getMgrMkdn() {
		return this.mgrMkdn;
	}

	public void setMgrMkdn(String mgrMkdn) {
		this.mgrMkdn = mgrMkdn;
	}

	public String getMssCd() {
		return this.mssCd;
	}

	public void setMssCd(String mssCd) {
		this.mssCd = mssCd;
	}

	public BigDecimal getMssQty() {
		return this.mssQty;
	}

	public void setMssQty(BigDecimal mssQty) {
		this.mssQty = mssQty;
	}

	public BigDecimal getMssRuPct() {
		return this.mssRuPct;
	}

	public void setMssRuPct(BigDecimal mssRuPct) {
		this.mssRuPct = mssRuPct;
	}

	public String getNegPrc() {
		return this.negPrc;
	}

	public void setNegPrc(String negPrc) {
		this.negPrc = negPrc;
	}

	public String getOriginCd() {
		return this.originCd;
	}

	public void setOriginCd(String originCd) {
		this.originCd = originCd;
	}

	public BigDecimal getPalletLayerQty() {
		return this.palletLayerQty;
	}

	public void setPalletLayerQty(BigDecimal palletLayerQty) {
		this.palletLayerQty = palletLayerQty;
	}

	public BigDecimal getPalletLayerRuPct() {
		return this.palletLayerRuPct;
	}

	public void setPalletLayerRuPct(BigDecimal palletLayerRuPct) {
		this.palletLayerRuPct = palletLayerRuPct;
	}

	public BigDecimal getPalletQty() {
		return this.palletQty;
	}

	public void setPalletQty(BigDecimal palletQty) {
		this.palletQty = palletQty;
	}

	public BigDecimal getPalletRuPct() {
		return this.palletRuPct;
	}

	public void setPalletRuPct(BigDecimal palletRuPct) {
		this.palletRuPct = palletRuPct;
	}

	public String getPoDistMethodCd() {
		return this.poDistMethodCd;
	}

	public void setPoDistMethodCd(String poDistMethodCd) {
		this.poDistMethodCd = poDistMethodCd;
	}

	public String getPrcStat() {
		return this.prcStat;
	}

	public void setPrcStat(String prcStat) {
		this.prcStat = prcStat;
	}

	public String getPrepackCd() {
		return this.prepackCd;
	}

	public void setPrepackCd(String prepackCd) {
		this.prepackCd = prepackCd;
	}

	public String getPrimaryVeCd() {
		return this.primaryVeCd;
	}

	public void setPrimaryVeCd(String primaryVeCd) {
		this.primaryVeCd = primaryVeCd;
	}

	public String getPutCd() {
		return this.putCd;
	}

	public void setPutCd(String putCd) {
		this.putCd = putCd;
	}

	public String getRankingCd() {
		return this.rankingCd;
	}

	public void setRankingCd(String rankingCd) {
		this.rankingCd = rankingCd;
	}

	public String getRegDes() {
		return this.regDes;
	}

	public void setRegDes(String regDes) {
		this.regDes = regDes;
	}

	public String getReplenCd() {
		return this.replenCd;
	}

	public void setReplenCd(String replenCd) {
		this.replenCd = replenCd;
	}

	public BigDecimal getRetPrc() {
		return this.retPrc;
	}

	public void setRetPrc(BigDecimal retPrc) {
		this.retPrc = retPrc;
	}

	public String getReturns() {
		return this.returns;
	}

	public void setReturns(String returns) {
		this.returns = returns;
	}

	public String getRoqCd() {
		return this.roqCd;
	}

	public void setRoqCd(String roqCd) {
		this.roqCd = roqCd;
	}

	public String getRtvDaTp() {
		return this.rtvDaTp;
	}

	public void setRtvDaTp(String rtvDaTp) {
		this.rtvDaTp = rtvDaTp;
	}

	public String getRtvViaCd() {
		return this.rtvViaCd;
	}

	public void setRtvViaCd(String rtvViaCd) {
		this.rtvViaCd = rtvViaCd;
	}

	public String getSeasonCd() {
		return this.seasonCd;
	}

	public void setSeasonCd(String seasonCd) {
		this.seasonCd = seasonCd;
	}

	public String getShelfCd() {
		return this.shelfCd;
	}

	public void setShelfCd(String shelfCd) {
		this.shelfCd = shelfCd;
	}

	public BigDecimal getShelfQty() {
		return this.shelfQty;
	}

	public void setShelfQty(BigDecimal shelfQty) {
		this.shelfQty = shelfQty;
	}

	public String getSpecOrd() {
		return this.specOrd;
	}

	public void setSpecOrd(String specOrd) {
		this.specOrd = specOrd;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getStatCd() {
		return this.statCd;
	}

	public void setStatCd(String statCd) {
		this.statCd = statCd;
	}

	public String getStoreOrd() {
		return this.storeOrd;
	}

	public void setStoreOrd(String storeOrd) {
		this.storeOrd = storeOrd;
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

	public String getTktCd() {
		return this.tktCd;
	}

	public void setTktCd(String tktCd) {
		this.tktCd = tktCd;
	}

	public String getTnetVsnPrefix() {
		return this.tnetVsnPrefix;
	}

	public void setTnetVsnPrefix(String tnetVsnPrefix) {
		this.tnetVsnPrefix = tnetVsnPrefix;
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

	public String getUnitCd() {
		return this.unitCd;
	}

	public void setUnitCd(String unitCd) {
		this.unitCd = unitCd;
	}

	public BigDecimal getUnitQty() {
		return this.unitQty;
	}

	public void setUnitQty(BigDecimal unitQty) {
		this.unitQty = unitQty;
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

	public String getVeUpc() {
		return this.veUpc;
	}

	public void setVeUpc(String veUpc) {
		this.veUpc = veUpc;
	}

	public BigDecimal getVol() {
		return this.vol;
	}

	public void setVol(BigDecimal vol) {
		this.vol = vol;
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

}