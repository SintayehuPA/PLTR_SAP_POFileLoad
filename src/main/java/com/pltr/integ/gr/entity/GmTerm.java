package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the GM_TERMS database table.
 * 
 */
@Entity
@Table(name = "GM_TERMS" , schema="AP")
@NamedQuery(name = "GmTerm.findAll", query = "SELECT g FROM GmTerm g")
public class GmTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "ADD_MOS")
	private BigDecimal addMos;

	@Column(name = "CUTOFF_DAY")
	private BigDecimal cutoffDay;

	private String des;

	@Column(name = "DISC_DAYS")
	private BigDecimal discDays;

	@Column(name = "DUE_DAYS")
	private BigDecimal dueDays;

	@Column(name = "DUE_DOM")
	private BigDecimal dueDom;

	@Column(name = "OWNERSHIP_TP")
	private String ownershipTp;

	private BigDecimal pct;

	@Column(name = "STAT_CD")
	private String statCd;
	
	@Id
	@Column(name = "TERMS_KEY")
	private BigDecimal termsKey;

	public GmTerm() {
	}

	public BigDecimal getAddMos() {
		return this.addMos;
	}

	public void setAddMos(BigDecimal addMos) {
		this.addMos = addMos;
	}

	public BigDecimal getCutoffDay() {
		return this.cutoffDay;
	}

	public void setCutoffDay(BigDecimal cutoffDay) {
		this.cutoffDay = cutoffDay;
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public BigDecimal getDiscDays() {
		return this.discDays;
	}

	public void setDiscDays(BigDecimal discDays) {
		this.discDays = discDays;
	}

	public BigDecimal getDueDays() {
		return this.dueDays;
	}

	public void setDueDays(BigDecimal dueDays) {
		this.dueDays = dueDays;
	}

	public BigDecimal getDueDom() {
		return this.dueDom;
	}

	public void setDueDom(BigDecimal dueDom) {
		this.dueDom = dueDom;
	}

	public String getOwnershipTp() {
		return this.ownershipTp;
	}

	public void setOwnershipTp(String ownershipTp) {
		this.ownershipTp = ownershipTp;
	}

	public BigDecimal getPct() {
		return this.pct;
	}

	public void setPct(BigDecimal pct) {
		this.pct = pct;
	}

	public String getStatCd() {
		return this.statCd;
	}

	public void setStatCd(String statCd) {
		this.statCd = statCd;
	}

	public BigDecimal getTermsKey() {
		return this.termsKey;
	}

	public void setTermsKey(BigDecimal termsKey) {
		this.termsKey = termsKey;
	}

}