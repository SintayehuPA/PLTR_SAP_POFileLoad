package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GM_SKU database table.
 * 
 */
@Entity
@Table(name="GM_SKU", schema="GM_MERCH")
@NamedQuery(name="GmSku.findAll", query="SELECT g FROM GmSku g")
public class GmSku implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="SKU_NUM")
	private String skuNum;

	@Column(name="CK_DIGIT")
	private String ckDigit;

	@Column(name="COLOR_CD")
	private String colorCd;

	@Column(name="COLOR_DES")
	private String colorDes;

	@Column(name="COLOR_SEQ_NUM")
	private BigDecimal colorSeqNum;

	@Column(name="DFLT_UPC_CD")
	private String dfltUpcCd;

	@Temporal(TemporalType.DATE)
	@Column(name="FIRST_RCV_DT")
	private Date firstRcvDt;

	@Column(name="GRID_FLD_1")
	private String gridFld1;

	@Column(name="GRID_FLD_2")
	private String gridFld2;

	@Column(name="GRID_FLD_3")
	private String gridFld3;

	@Column(name="GRID_SEQ")
	private BigDecimal gridSeq;

	@Column(name="ITM_CD")
	private String itmCd;

	@Column(name="ITM_SEQ")
	private String itmSeq;

	@Column(name="LST_NET_BUY_CST")
	private BigDecimal lstNetBuyCst;

	@Column(name="PRC_STAT")
	private String prcStat;

	@Column(name="PREPACK_CD")
	private String prepackCd;

	@Temporal(TemporalType.DATE)
	@Column(name="REPLEN_REF_END_DT")
	private Date replenRefEndDt;

	@Column(name="REPLEN_REF_SKU_NUM")
	private String replenRefSkuNum;

	@Column(name="SIZE_CD")
	private String sizeCd;

	@Column(name="SIZE_SEQ_NUM")
	private BigDecimal sizeSeqNum;

	@Column(name="SKU_TP")
	private String skuTp;

	public GmSku() {
	}

	public String getSkuNum() {
		return this.skuNum;
	}

	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}

	public String getCkDigit() {
		return this.ckDigit;
	}

	public void setCkDigit(String ckDigit) {
		this.ckDigit = ckDigit;
	}

	public String getColorCd() {
		return this.colorCd;
	}

	public void setColorCd(String colorCd) {
		this.colorCd = colorCd;
	}

	public String getColorDes() {
		return this.colorDes;
	}

	public void setColorDes(String colorDes) {
		this.colorDes = colorDes;
	}

	public BigDecimal getColorSeqNum() {
		return this.colorSeqNum;
	}

	public void setColorSeqNum(BigDecimal colorSeqNum) {
		this.colorSeqNum = colorSeqNum;
	}

	public String getDfltUpcCd() {
		return this.dfltUpcCd;
	}

	public void setDfltUpcCd(String dfltUpcCd) {
		this.dfltUpcCd = dfltUpcCd;
	}

	public Date getFirstRcvDt() {
		return this.firstRcvDt;
	}

	public void setFirstRcvDt(Date firstRcvDt) {
		this.firstRcvDt = firstRcvDt;
	}

	public String getGridFld1() {
		return this.gridFld1;
	}

	public void setGridFld1(String gridFld1) {
		this.gridFld1 = gridFld1;
	}

	public String getGridFld2() {
		return this.gridFld2;
	}

	public void setGridFld2(String gridFld2) {
		this.gridFld2 = gridFld2;
	}

	public String getGridFld3() {
		return this.gridFld3;
	}

	public void setGridFld3(String gridFld3) {
		this.gridFld3 = gridFld3;
	}

	public BigDecimal getGridSeq() {
		return this.gridSeq;
	}

	public void setGridSeq(BigDecimal gridSeq) {
		this.gridSeq = gridSeq;
	}

	public String getItmCd() {
		return this.itmCd;
	}

	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	public String getItmSeq() {
		return this.itmSeq;
	}

	public void setItmSeq(String itmSeq) {
		this.itmSeq = itmSeq;
	}

	public BigDecimal getLstNetBuyCst() {
		return this.lstNetBuyCst;
	}

	public void setLstNetBuyCst(BigDecimal lstNetBuyCst) {
		this.lstNetBuyCst = lstNetBuyCst;
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

	public Date getReplenRefEndDt() {
		return this.replenRefEndDt;
	}

	public void setReplenRefEndDt(Date replenRefEndDt) {
		this.replenRefEndDt = replenRefEndDt;
	}

	public String getReplenRefSkuNum() {
		return this.replenRefSkuNum;
	}

	public void setReplenRefSkuNum(String replenRefSkuNum) {
		this.replenRefSkuNum = replenRefSkuNum;
	}

	public String getSizeCd() {
		return this.sizeCd;
	}

	public void setSizeCd(String sizeCd) {
		this.sizeCd = sizeCd;
	}

	public BigDecimal getSizeSeqNum() {
		return this.sizeSeqNum;
	}

	public void setSizeSeqNum(BigDecimal sizeSeqNum) {
		this.sizeSeqNum = sizeSeqNum;
	}

	public String getSkuTp() {
		return this.skuTp;
	}

	public void setSkuTp(String skuTp) {
		this.skuTp = skuTp;
	}

}