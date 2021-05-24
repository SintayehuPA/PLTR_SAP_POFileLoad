
package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;

/**
 */

@Entity
@Table(schema = "PRC", name = "GM_PRC")
public class GmPrc implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */
	@EmbeddedId
	private GmPrcPK gmPrcPK;
	


	public GmPrcPK getGmPrcPK() {
		return gmPrcPK;
	}

	public void setGmPrcPK(GmPrcPK gmPrcPK) {
		this.gmPrcPK = gmPrcPK;
	}

	@Column(name = "ITM_CD", length = 12, nullable = false)
	@Basic(fetch = FetchType.EAGER)

	@XmlElement
	String itmCd;


	@Column(name = "PRC_GRP_CD", length = 4, nullable = false)
	String prcGrpCd;
	
	@Column(name = "PC_NUM", length = 5, nullable = false)
	@XmlElement
	String pcNum;
	
	@Column(name = "RET_PRC", scale = 2, precision = 10, nullable = false)
	BigDecimal retPrc;
	
	@Column(name = "ENT_DT", nullable = false)
	Date entDt;
	/**
	 */

	@Column(name = "ENT_TIME", length = 5, nullable = false)
	String entTime;
	
	@Column(name = "PLUC_DT", nullable = false)
	Date plucDt;

	@Column(name = "END_DT")
	Date endDt;

	@Column(name = "END_TIME", length = 5)
	String endTime;
	
	@Column(name = "PROMO_KEY_VALUE", length = 1)
	String promoKeyValue;
	
	@Column(name = "AD_LMT")
	Integer adLmt;

	@Column(name = "PREV_PERM_RET", scale = 2, precision = 10)
	BigDecimal prevPermRet;
	
	@Column(name = "DEAL", length = 1, nullable = false)
	String deal;
	
	@Column(name = "CST_RMA", scale = 2, precision = 10)
	BigDecimal cstRma;
	
	@Column(name = "BEG_TIME", length = 5, nullable = false)
	String begTime;

//	/**
//	 */
//	public void setSkuNum(String skuNum) {
//		this.gmPrcPK.setSkuNum(skuNum);
//	}
//
//	/**
//	 */
//	public String getSkuNum() {
//		return this.gmPrcPK.getSkuNum();
//	}

	/**
	 */
	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	/**
	 */
	public String getItmCd() {
		return this.itmCd;
	}

	/**
	 */
	public void setPrcZoneCd(String prcZoneCd) {
		this.gmPrcPK.setPrcZoneCd(prcZoneCd);
	}

	/**
	 */
	public String getPrcZoneCd() {
		return this.gmPrcPK.getPrcZoneCd();
	}

	/**
	 */
	public void setPrcGrpCd(String prcGrpCd) {
		this.prcGrpCd = prcGrpCd;
	}

	/**
	 */
	public String getPrcGrpCd() {
		return this.prcGrpCd;
	}

	/**
	 */
	public void setBegDt(Date begDt) {
		this.gmPrcPK.setBegDt(begDt);
	}

	/**
	 */
	public Date getBegDt() {
		return this.gmPrcPK.getBegDt();
	}

	/**
	 */
	public void setBegTime(String begTime) {
		this.begTime = begTime;
	}

	/**
	 */
	public String getBegTime() {
		return this.begTime;
	}

	/**
	 */
	public void setPcNum(String pcNum) {
		this.pcNum = pcNum;
	}

	/**
	 */
	public String getPcNum() {
		return this.pcNum;
	}

	/**
	 */
	public void setRetPrc(BigDecimal retPrc) {
		this.retPrc = retPrc;
	}

	/**
	 */
	public BigDecimal getRetPrc() {
		return this.retPrc;
	}

	/**
	 */
	public void setEntDt(Date entDt) {
		this.entDt = entDt;
	}

	/**
	 */
	public Date getEntDt() {
		return this.entDt;
	}

	/**
	 */
	public void setEntTime(String entTime) {
		this.entTime = entTime;
	}

	/**
	 */
	public String getEntTime() {
		return this.entTime;
	}

	/**
	 */
	public void setPlucDt(Date plucDt) {
		this.plucDt = plucDt;
	}

	/**
	 */
	public Date getPlucDt() {
		return this.plucDt;
	}

	/**
	 */
	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	/**
	 */
	public Date getEndDt() {
		return this.endDt;
	}

	/**
	 */
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	/**
	 */
	public String getEndTime() {
		return this.endTime;
	}

	/**
	 */
	public void setPromoKeyValue(String promoKeyValue) {
		this.promoKeyValue = promoKeyValue;
	}

	/**
	 */
	public String getPromoKeyValue() {
		return this.promoKeyValue;
	}

	/**
	 */
	public void setAdLmt(Integer adLmt) {
		this.adLmt = adLmt;
	}

	/**
	 */
	public Integer getAdLmt() {
		return this.adLmt;
	}

	/**
	 */
	public void setPcTp(String pcTp) {
		this.gmPrcPK.setPcTp(pcTp);
	}

	/**
	 */
	public String getPcTp() {
		return this.gmPrcPK.getPcTp();
	}

	/**
	 */
	public void setPrevPermRet(BigDecimal prevPermRet) {
		this.prevPermRet = prevPermRet;
	}

	/**
	 */
	public BigDecimal getPrevPermRet() {
		return this.prevPermRet;
	}

	/**
	 */
	public void setDeal(String deal) {
		this.deal = deal;
	}

	/**
	 */
	public String getDeal() {
		return this.deal;
	}

	/**
	 */
	public void setCstRma(BigDecimal cstRma) {
		this.cstRma = cstRma;
	}

	/**
	 */
	public BigDecimal getCstRma() {
		return this.cstRma;
	}

	/**
	 */
	public GmPrc() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(GmPrc that) {
//		setSkuNum(that.getSkuNum());
		setItmCd(that.getItmCd());
		setPrcZoneCd(that.getPrcZoneCd());
		setPrcGrpCd(that.getPrcGrpCd());
		setBegDt(that.getBegDt());
		setBegTime(that.getBegTime());
		setPcNum(that.getPcNum());
		setRetPrc(that.getRetPrc());
		setEntDt(that.getEntDt());
		setEntTime(that.getEntTime());
		setPlucDt(that.getPlucDt());
		setEndDt(that.getEndDt());
		setEndTime(that.getEndTime());
		setPromoKeyValue(that.getPromoKeyValue());
		setAdLmt(that.getAdLmt());
		setPcTp(that.getPcTp());
		setPrevPermRet(that.getPrevPermRet());
		setDeal(that.getDeal());
		setCstRma(that.getCstRma());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("skuNum=[").append(this.gmPrcPK.getSkuNum()).append("] ");
		buffer.append("itmCd=[").append(itmCd).append("] ");
		buffer.append("prcZoneCd=[").append(this.gmPrcPK.getPrcZoneCd()).append("] ");
		buffer.append("prcGrpCd=[").append(prcGrpCd).append("] ");
		buffer.append("begDt=[").append(this.gmPrcPK.getBegDt()).append("] ");
		buffer.append("begTime=[").append(begTime).append("] ");
		buffer.append("pcNum=[").append(pcNum).append("] ");
		buffer.append("retPrc=[").append(retPrc).append("] ");
		buffer.append("entDt=[").append(entDt).append("] ");
		buffer.append("entTime=[").append(entTime).append("] ");
		buffer.append("plucDt=[").append(plucDt).append("] ");
		buffer.append("endDt=[").append(endDt).append("] ");
		buffer.append("endTime=[").append(endTime).append("] ");
		buffer.append("promoKeyValue=[").append(promoKeyValue).append("] ");
		buffer.append("adLmt=[").append(adLmt).append("] ");
		buffer.append("pcTp=[").append(this.gmPrcPK.getPcTp()).append("] ");
		buffer.append("prevPermRet=[").append(prevPermRet).append("] ");
		buffer.append("deal=[").append(deal).append("] ");
		buffer.append("cstRma=[").append(cstRma).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((this.gmPrcPK.getSkuNum() == null) ? 0 : this.gmPrcPK.getSkuNum().hashCode()));
		result = (int) (prime * result + ((this.gmPrcPK.getPrcZoneCd() == null) ? 0 : this.gmPrcPK.getPrcZoneCd().hashCode()));
		result = (int) (prime * result + ((this.gmPrcPK.getBegDt() == null) ? 0 : this.gmPrcPK.getBegDt().hashCode()));
		result = (int) (prime * result + ((this.gmPrcPK.getPcTp() == null) ? 0 : this.gmPrcPK.getPcTp().hashCode()));
		return result;
	}

}
