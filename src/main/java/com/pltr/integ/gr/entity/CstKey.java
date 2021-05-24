package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Embeddable
public class CstKey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	@Column(name="EFF_DT")
	private Date effDt;

	@Column(name="ITM_CD")
	private String itmCd;

	@Column(name="VE_CD")
	private String veCd;

	@Column(name="MIN_AMT")
	private BigDecimal minAmt;

	public CstKey() {
	}

	public Date getEffDt() {
		return this.effDt;
	}

	public void setEffDt(Date effDt) {
		this.effDt = effDt;
	}

	public String getItmCd() {
		return this.itmCd;
	}

	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	public BigDecimal getMinAmt() {
		return this.minAmt;
	}

	public void setMinAmt(BigDecimal minAmt) {
		this.minAmt = minAmt;
	}

	public String getVeCd() {
		return this.veCd;
	}

	public void setVeCd(String veCd) {
		this.veCd = veCd;
	}

}