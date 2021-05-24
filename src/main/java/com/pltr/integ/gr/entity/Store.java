package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the STORE database table.
 * 
 */
@Entity
@Table (name="Store", schema="MISC")
@NamedQuery(name="Store.findAll", query="SELECT s FROM Store s")
public class Store implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STORE_CD")
	private String storeCd;

	private String addr1;

	private String addr2;

	@Column(name="ALT_RCV_LOC_CD")
	private String altRcvLocCd;

	@Temporal(TemporalType.DATE)
	@Column(name="ARTR_THRU")
	private Date artrThru;

	@Column(name="AUDIT_WATCH_CD")
	private String auditWatchCd;

	@Column(name="BILL_TO_STORE_CD")
	private String billToStoreCd;

	@Temporal(TemporalType.DATE)
	@Column(name="BILLED_THRU_DT")
	private Date billedThruDt;

	@Column(name="BLIND_RCV")
	private String blindRcv;

	@Column(name="CCSOE_SLSP_CD")
	private String ccsoeSlspCd;

	private String city;

	@Temporal(TemporalType.DATE)
	@Column(name="CLOSE_DT")
	private Date closeDt;

	@Column(name="CO_CD")
	private String coCd;

	@Column(name="CORE_RTV_LOC_CD")
	private String coreRtvLocCd;

	@Column(name="CORE_STAGE_LOC_CD")
	private String coreStageLocCd;

	@Column(name="DEFAULT_CRM_LOC")
	private String defaultCrmLoc;

	@Column(name="DEFAULT_LOC")
	private String defaultLoc;

	@Column(name="DEL_BY_STORE_CD")
	private String delByStoreCd;

	@Column(name="DFCT_RTV_LOC_CD")
	private String dfctRtvLocCd;

	@Column(name="DFCT_STAGE_LOC_CD")
	private String dfctStageLocCd;

	@Column(name="DFLT_HOLD_LOC_CD")
	private String dfltHoldLocCd;

	@Column(name="DFLT_STAGE_LOC_CD")
	private String dfltStageLocCd;

	@Column(name="DFLT_WHS_STORE_CD")
	private String dfltWhsStoreCd;

	@Column(name="DIV_CD")
	private String divCd;

	@Column(name="DMG_LOC_CD")
	private String dmgLocCd;

	@Column(name="EDI_ID_CD")
	private String ediIdCd;

	@Column(name="EST_SLS_VOL")
	private BigDecimal estSlsVol;

	@Column(name="FRAN_CUST_CD")
	private String franCustCd;

	@Column(name="INV_WHS")
	private String invWhs;

	@Temporal(TemporalType.DATE)
	@Column(name="LST_BAL_DT")
	private Date lstBalDt;

	@Column(name="MAX_CHANGE_OUT")
	private BigDecimal maxChangeOut;

	@Column(name="OP_DIST_CD")
	private String opDistCd;

	@Column(name="OP_RGN_CD")
	private String opRgnCd;

	@Temporal(TemporalType.DATE)
	@Column(name="OPEN_DT")
	private Date openDt;

	@Column(name="PICKUP_STORE_CD")
	private String pickupStoreCd;

	private String pollable;

	@Column(name="POS_REV")
	private String posRev;

	@Temporal(TemporalType.DATE)
	@Column(name="POS_REV_DT")
	private Date posRevDt;

	@Column(name="PRC_GRP_CD")
	private String prcGrpCd;

	@Column(name="PRC_ZONE_CD")
	private String prcZoneCd;

	@Column(name="RCV_COUNT")
	private BigDecimal rcvCount;

	@Column(name="RCV_COUNT_INCR")
	private BigDecimal rcvCountIncr;

	@Column(name="RCV_LOC_CD")
	private String rcvLocCd;

	@Column(name="RTS_STAGE_LOC_CD")
	private String rtsStageLocCd;

	@Column(name="SE_ZONE_CD")
	private String seZoneCd;

	@Column(name="SHIP_TO_STORE_CD")
	private String shipToStoreCd;

	@Column(name="SQ_FT")
	private BigDecimal sqFt;

	private String st;

	@Column(name="STORE_NAME")
	private String storeName;

	@Column(name="STORE_TP_CD")
	private String storeTpCd;

	@Column(name="TAX_AREA_CD")
	private String taxAreaCd;

	@Column(name="TAX_CD")
	private String taxCd;

	@Column(name="ZIP_CD")
	private String zipCd;

	@Column(name="ZONE_CD")
	private String zoneCd;

	public Store() {
	}

	public String getStoreCd() {
		return this.storeCd;
	}

	public void setStoreCd(String storeCd) {
		this.storeCd = storeCd;
	}

	public String getAddr1() {
		return this.addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return this.addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAltRcvLocCd() {
		return this.altRcvLocCd;
	}

	public void setAltRcvLocCd(String altRcvLocCd) {
		this.altRcvLocCd = altRcvLocCd;
	}

	public Date getArtrThru() {
		return this.artrThru;
	}

	public void setArtrThru(Date artrThru) {
		this.artrThru = artrThru;
	}

	public String getAuditWatchCd() {
		return this.auditWatchCd;
	}

	public void setAuditWatchCd(String auditWatchCd) {
		this.auditWatchCd = auditWatchCd;
	}

	public String getBillToStoreCd() {
		return this.billToStoreCd;
	}

	public void setBillToStoreCd(String billToStoreCd) {
		this.billToStoreCd = billToStoreCd;
	}

	public Date getBilledThruDt() {
		return this.billedThruDt;
	}

	public void setBilledThruDt(Date billedThruDt) {
		this.billedThruDt = billedThruDt;
	}

	public String getBlindRcv() {
		return this.blindRcv;
	}

	public void setBlindRcv(String blindRcv) {
		this.blindRcv = blindRcv;
	}

	public String getCcsoeSlspCd() {
		return this.ccsoeSlspCd;
	}

	public void setCcsoeSlspCd(String ccsoeSlspCd) {
		this.ccsoeSlspCd = ccsoeSlspCd;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getCloseDt() {
		return this.closeDt;
	}

	public void setCloseDt(Date closeDt) {
		this.closeDt = closeDt;
	}

	public String getCoCd() {
		return this.coCd;
	}

	public void setCoCd(String coCd) {
		this.coCd = coCd;
	}

	public String getCoreRtvLocCd() {
		return this.coreRtvLocCd;
	}

	public void setCoreRtvLocCd(String coreRtvLocCd) {
		this.coreRtvLocCd = coreRtvLocCd;
	}

	public String getCoreStageLocCd() {
		return this.coreStageLocCd;
	}

	public void setCoreStageLocCd(String coreStageLocCd) {
		this.coreStageLocCd = coreStageLocCd;
	}

	public String getDefaultCrmLoc() {
		return this.defaultCrmLoc;
	}

	public void setDefaultCrmLoc(String defaultCrmLoc) {
		this.defaultCrmLoc = defaultCrmLoc;
	}

	public String getDefaultLoc() {
		return this.defaultLoc;
	}

	public void setDefaultLoc(String defaultLoc) {
		this.defaultLoc = defaultLoc;
	}

	public String getDelByStoreCd() {
		return this.delByStoreCd;
	}

	public void setDelByStoreCd(String delByStoreCd) {
		this.delByStoreCd = delByStoreCd;
	}

	public String getDfctRtvLocCd() {
		return this.dfctRtvLocCd;
	}

	public void setDfctRtvLocCd(String dfctRtvLocCd) {
		this.dfctRtvLocCd = dfctRtvLocCd;
	}

	public String getDfctStageLocCd() {
		return this.dfctStageLocCd;
	}

	public void setDfctStageLocCd(String dfctStageLocCd) {
		this.dfctStageLocCd = dfctStageLocCd;
	}

	public String getDfltHoldLocCd() {
		return this.dfltHoldLocCd;
	}

	public void setDfltHoldLocCd(String dfltHoldLocCd) {
		this.dfltHoldLocCd = dfltHoldLocCd;
	}

	public String getDfltStageLocCd() {
		return this.dfltStageLocCd;
	}

	public void setDfltStageLocCd(String dfltStageLocCd) {
		this.dfltStageLocCd = dfltStageLocCd;
	}

	public String getDfltWhsStoreCd() {
		return this.dfltWhsStoreCd;
	}

	public void setDfltWhsStoreCd(String dfltWhsStoreCd) {
		this.dfltWhsStoreCd = dfltWhsStoreCd;
	}

	public String getDivCd() {
		return this.divCd;
	}

	public void setDivCd(String divCd) {
		this.divCd = divCd;
	}

	public String getDmgLocCd() {
		return this.dmgLocCd;
	}

	public void setDmgLocCd(String dmgLocCd) {
		this.dmgLocCd = dmgLocCd;
	}

	public String getEdiIdCd() {
		return this.ediIdCd;
	}

	public void setEdiIdCd(String ediIdCd) {
		this.ediIdCd = ediIdCd;
	}

	public BigDecimal getEstSlsVol() {
		return this.estSlsVol;
	}

	public void setEstSlsVol(BigDecimal estSlsVol) {
		this.estSlsVol = estSlsVol;
	}

	public String getFranCustCd() {
		return this.franCustCd;
	}

	public void setFranCustCd(String franCustCd) {
		this.franCustCd = franCustCd;
	}

	public String getInvWhs() {
		return this.invWhs;
	}

	public void setInvWhs(String invWhs) {
		this.invWhs = invWhs;
	}

	public Date getLstBalDt() {
		return this.lstBalDt;
	}

	public void setLstBalDt(Date lstBalDt) {
		this.lstBalDt = lstBalDt;
	}

	public BigDecimal getMaxChangeOut() {
		return this.maxChangeOut;
	}

	public void setMaxChangeOut(BigDecimal maxChangeOut) {
		this.maxChangeOut = maxChangeOut;
	}

	public String getOpDistCd() {
		return this.opDistCd;
	}

	public void setOpDistCd(String opDistCd) {
		this.opDistCd = opDistCd;
	}

	public String getOpRgnCd() {
		return this.opRgnCd;
	}

	public void setOpRgnCd(String opRgnCd) {
		this.opRgnCd = opRgnCd;
	}

	public Date getOpenDt() {
		return this.openDt;
	}

	public void setOpenDt(Date openDt) {
		this.openDt = openDt;
	}

	public String getPickupStoreCd() {
		return this.pickupStoreCd;
	}

	public void setPickupStoreCd(String pickupStoreCd) {
		this.pickupStoreCd = pickupStoreCd;
	}

	public String getPollable() {
		return this.pollable;
	}

	public void setPollable(String pollable) {
		this.pollable = pollable;
	}

	public String getPosRev() {
		return this.posRev;
	}

	public void setPosRev(String posRev) {
		this.posRev = posRev;
	}

	public Date getPosRevDt() {
		return this.posRevDt;
	}

	public void setPosRevDt(Date posRevDt) {
		this.posRevDt = posRevDt;
	}

	public String getPrcGrpCd() {
		return this.prcGrpCd;
	}

	public void setPrcGrpCd(String prcGrpCd) {
		this.prcGrpCd = prcGrpCd;
	}

	public String getPrcZoneCd() {
		return this.prcZoneCd;
	}

	public void setPrcZoneCd(String prcZoneCd) {
		this.prcZoneCd = prcZoneCd;
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

	public String getRcvLocCd() {
		return this.rcvLocCd;
	}

	public void setRcvLocCd(String rcvLocCd) {
		this.rcvLocCd = rcvLocCd;
	}

	public String getRtsStageLocCd() {
		return this.rtsStageLocCd;
	}

	public void setRtsStageLocCd(String rtsStageLocCd) {
		this.rtsStageLocCd = rtsStageLocCd;
	}

	public String getSeZoneCd() {
		return this.seZoneCd;
	}

	public void setSeZoneCd(String seZoneCd) {
		this.seZoneCd = seZoneCd;
	}

	public String getShipToStoreCd() {
		return this.shipToStoreCd;
	}

	public void setShipToStoreCd(String shipToStoreCd) {
		this.shipToStoreCd = shipToStoreCd;
	}

	public BigDecimal getSqFt() {
		return this.sqFt;
	}

	public void setSqFt(BigDecimal sqFt) {
		this.sqFt = sqFt;
	}

	public String getSt() {
		return this.st;
	}

	public void setSt(String st) {
		this.st = st;
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreTpCd() {
		return this.storeTpCd;
	}

	public void setStoreTpCd(String storeTpCd) {
		this.storeTpCd = storeTpCd;
	}

	public String getTaxAreaCd() {
		return this.taxAreaCd;
	}

	public void setTaxAreaCd(String taxAreaCd) {
		this.taxAreaCd = taxAreaCd;
	}

	public String getTaxCd() {
		return this.taxCd;
	}

	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}

	public String getZipCd() {
		return this.zipCd;
	}

	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}

	public String getZoneCd() {
		return this.zoneCd;
	}

	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}

}