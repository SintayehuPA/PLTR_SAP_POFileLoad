package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 */
@Embeddable
public class GmPrcPK implements Serializable {
	private static final long serialVersionUID = 1L;

	public GmPrcPK() {
	}

	@Column(name = "SKU_NUM", length = 12, nullable = false)
	public String skuNum;

	@Column(name = "PRC_ZONE_CD", length = 4, nullable = false)
	public String prcZoneCd;

	@Column(name = "BEG_DT", nullable = false)
	public Date begDt;

	@Column(name = "PC_TP", length = 3, nullable = false)
	public String pcTp;

	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}

	public String getSkuNum() {
		return this.skuNum;
	}

	public void setPrcZoneCd(String prcZoneCd) {
		this.prcZoneCd = prcZoneCd;
	}

	public String getPrcZoneCd() {
		return this.prcZoneCd;
	}

	public void setBegDt(Date begDt) {
		this.begDt = begDt;
	}

	public Date getBegDt() {
		return this.begDt;
	}

	public void setPcTp(String pcTp) {
		this.pcTp = pcTp;
	}

	public String getPcTp() {
		return this.pcTp;
	}
}
