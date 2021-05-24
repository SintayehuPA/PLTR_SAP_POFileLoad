package com.pltr.integ.gr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema = "CUSTOM", name = "Sappolinesku")
@NamedQuery(name = "Sappolinesku.findAll", query = "SELECT p FROM Sappolinesku p")
public class Sappolinesku {
	@Id
	@Column(name = "ID")
	private BigDecimal id;
	@Column(name = "sapponum")
	private String sapponum;
	@Column(name = "gersponum")
	private String gersponum;
	@Column(name = "itmcd")
	private String itmcd;
	@Column(name = "skunum")
	private String skunum;
	@Column(name = "seqnum")
	private BigDecimal seqnum;
	@Column(name = "polnseq")
	private BigDecimal polnseq;
	@Column(name = "lprc")
	private BigDecimal lprc;
	
	@Column(name = "SAPPOLINEITEMID")
	private BigDecimal sappolineitemid;
	
	@Column(name = "status")
	private String status;
	@Column(name = "potype")
	private String potype;
	
	@Transient
	private List<Sappolineskudistr> sappolineskudistrs = new ArrayList<Sappolineskudistr>();

	public List<Sappolineskudistr> getSappolineskudistrs() {
		return sappolineskudistrs;
	}

	public void addSappolineskudistrs(Sappolineskudistr sappolineskudistr) {
		this.sappolineskudistrs.add(sappolineskudistr);
	}
	public void setSappolineskudistr(List<Sappolineskudistr> sappolineskudistrs) {
		this.sappolineskudistrs = sappolineskudistrs;
	}
	
	
	
	public BigDecimal getSappolineitemid() {
		return sappolineitemid;
	}
	public void setSappolineitemid(BigDecimal sappolineitemid) {
		this.sappolineitemid = sappolineitemid;
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
	public String getItmcd() {
		return itmcd;
	}
	public void setItmcd(String itmcd) {
		this.itmcd = itmcd;
	}
	public String getSkunum() {
		return skunum;
	}
	public void setSkunum(String skunum) {
		this.skunum = skunum;
	}
	public BigDecimal getSeqnum() {
		return seqnum;
	}
	public void setSeqnum(BigDecimal seqnum) {
		this.seqnum = seqnum;
	}
	public BigDecimal getPolnseq() {
		return polnseq;
	}
	public void setPolnseq(BigDecimal polnseq) {
		this.polnseq = polnseq;
	}
	public BigDecimal getLprc() {
		return lprc;
	}
	public void setLprc(BigDecimal lprc) {
		this.lprc = lprc;
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
