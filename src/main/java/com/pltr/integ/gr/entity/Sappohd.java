package com.pltr.integ.gr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema = "CUSTOM", name = "Sappohd")
@NamedQuery(name = "Sappohd.findAll", query = "SELECT p FROM Sappohd p")
public class Sappohd {

	@Id
	@Column(name = "ID")
	private BigDecimal id;
	@Column(name = "sapponum")
	private String sapponum;
	@Column(name = "gersponum")
	private String gersponum;
	@Column(name = "vecd")
	private String vecd;
	@Column(name = "shipdt")
	private Date shipdt;
	@Column(name = "shipcmpltdt")
	private Date shipcmpltdt;
	@Column(name = "canceldt")
	private Date canceldt;

	@Column(name = "TERMSKEY")
	private BigDecimal termskey;
	@Column(name = "TERMSPCT")
	private BigDecimal termspct;

	@Column(name = "TERMSDAYS")
	private BigDecimal termsdays;
	@Column(name = "FOB")
	private String fob;

	@Column(name = "status")
	private String status;
	@Column(name = "potype")
	private String potype;

	@Column(name = "frtterms")
	private String frtterms;

	@Transient
	private List<Sappolineitem> sappolineitems = new ArrayList<Sappolineitem>();

	public List<Sappolineitem> getSappolineitems() {
		return sappolineitems;
	}

	public void addSappolineitems(Sappolineitem sappolineitem) {
		this.sappolineitems.add(sappolineitem);
	}
	public void setSappolineitem(List<Sappolineitem> sappolineitems) {
		this.sappolineitems = sappolineitems;
	}

	public String getFrtterms() {
		return frtterms;
	}

	public void setFrtterms(String frtterms) {
		this.frtterms = frtterms;
	}

	public BigDecimal getTermskey() {
		return termskey;
	}

	public void setTermskey(BigDecimal termskey) {
		this.termskey = termskey;
	}

	public BigDecimal getTermspct() {
		return termspct;
	}

	public void setTermspct(BigDecimal termspct) {
		this.termspct = termspct;
	}

	public BigDecimal getTermsdays() {
		return termsdays;
	}

	public void setTermsdays(BigDecimal termsdays) {
		this.termsdays = termsdays;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getSapponum() {
		return sapponum;
	}

	public void setSapponum(String sapponum) {
		this.sapponum = sapponum;
	}

	public String getGersponum() {
		return gersponum;
	}

	public void setGersponum(String gersponum) {
		this.gersponum = gersponum;
	}

	public String getVecd() {
		return vecd;
	}

	public void setVecd(String vecd) {
		this.vecd = vecd;
	}

	public Date getShipdt() {
		return shipdt;
	}

	public void setShipdt(Date shipdt) {
		this.shipdt = shipdt;
	}

	public Date getShipcmpltdt() {
		return shipcmpltdt;
	}

	public void setShipcmpltdt(Date shipcmpltdt) {
		this.shipcmpltdt = shipcmpltdt;
	}

	public Date getCanceldt() {
		return canceldt;
	}

	public void setCanceldt(Date canceldt) {
		this.canceldt = canceldt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPotype() {
		return potype;
	}

	public void setPotype(String potype) {
		this.potype = potype;
	}

}
