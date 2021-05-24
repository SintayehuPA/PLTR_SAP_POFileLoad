package com.pltr.integ.gr.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(schema = "CUSTOM", name = "Sappolineskudistr")
@NamedQuery(name = "Sappolineskudistr.findAll", query = "SELECT p FROM Sappolineskudistr p")
public class Sappolineskudistr {
	@Id
	@Column(name = "ID")
	private BigDecimal id;
	@Column(name = "sapponum")
	private String sapponum;
	@Column(name = "gersponum")
	private String gersponum;
	@Column(name = "skunum")
	private String skunum;
	@Column(name = "storecd")
	private String storecd;
	@Column(name = "polnitem")
	private String polnitem;
	@Column(name = "qty")
	private BigDecimal qty;
	
	@Column(name = "SAPPOLINESKUID")
	private BigDecimal sappolineskuid;
	
	@Column(name = "status")
	private String status;
	@Column(name = "potype")
	private String potype;
	
	
	public BigDecimal getSappolineskuid() {
		return sappolineskuid;
	}
	public void setSappolineskuid(BigDecimal sappolineskuid) {
		this.sappolineskuid = sappolineskuid;
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
	public String getSkunum() {
		return skunum;
	}
	public void setSkunum(String skunum) {
		this.skunum = skunum;
	}
	public String getStorecd() {
		return storecd;
	}
	public void setStorecd(String storecd) {
		this.storecd = storecd;
	}

	public String getPolnitem() {
		return polnitem;
	}
	public void setPolnitem(String polnitem) {
		this.polnitem = polnitem;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
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
