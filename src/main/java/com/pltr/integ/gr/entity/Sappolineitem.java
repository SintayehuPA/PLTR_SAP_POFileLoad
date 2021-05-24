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
@Table(schema = "CUSTOM", name = "Sappolineitem")
@NamedQuery(name = "Sappofileline.findAll", query = "SELECT p FROM Sappolineitem p")
public class Sappolineitem {
	@Id
	@Column(name = "ID")
	private BigDecimal id;
	@Column(name = "sapponum")
	private String sapponum;
	@Column(name = "gersponum")
	private String gersponum;
	@Column(name = "itmcd")
	private String itmcd;
	@Column(name = "vsnum")
	private String vsnum;
	@Column(name = "vcst")
	private BigDecimal vcst;
	@Column(name = "numofvarient")
	private BigDecimal numofvarient;
	@Column(name = "itemseqnum")
	private BigDecimal itemseqnum;
	@Column(name = "polnseqstart")
	private BigDecimal polnseqstart;
	@Column(name = "polnseqend")
	private BigDecimal polnseqend;
	
	@Column(name = "DIVCD")
	private String divcd;
	@Column(name = "DEPTCD")
	private String deptcd;
	@Column(name = "CLASSCD")
	private String classcd;
	@Column(name = "SUBCLASSCD")
	private String subclasscd;
	@Column(name = "SAPPOHDID")
	private BigDecimal sappohdid;
	
	
	@Column(name = "status")
	private String status;
	@Column(name = "potype")
	private String potype;
	
	@Transient
	private List<Sappolinesku> sappolineskus = new ArrayList<Sappolinesku>();

	public List<Sappolinesku> getSappolineskus() {
		return sappolineskus;
	}

	public void addSappolinesku(Sappolinesku sappolinesku) {
		this.sappolineskus.add(sappolinesku);
	}
	public void setSappolineskus(List<Sappolinesku> sappolineskus) {
		this.sappolineskus = sappolineskus;
	}
	
	public String getDivcd() {
		return divcd;
	}
	public void setDivcd(String divcd) {
		this.divcd = divcd;
	}
	public String getDeptcd() {
		return deptcd;
	}
	public void setDeptcd(String deptcd) {
		this.deptcd = deptcd;
	}
	public String getClasscd() {
		return classcd;
	}
	public void setClasscd(String classcd) {
		this.classcd = classcd;
	}
	public String getSubclasscd() {
		return subclasscd;
	}
	public void setSubclasscd(String subclasscd) {
		this.subclasscd = subclasscd;
	}
	public BigDecimal getSappohdid() {
		return sappohdid;
	}
	public void setSappohdid(BigDecimal sappohdid) {
		this.sappohdid = sappohdid;
	}
	public BigDecimal getPolnseqend() {
		return polnseqend;
	}
	public void setPolnseqend(BigDecimal polnseqend) {
		this.polnseqend = polnseqend;
	}
	public BigDecimal getPolnseqstart() {
		return polnseqstart;
	}
	public void setPolnseqstart(BigDecimal polnseqstart) {
		this.polnseqstart = polnseqstart;
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
	public String getVsnum() {
		return vsnum;
	}
	public void setVsnum(String vsnum) {
		this.vsnum = vsnum;
	}
	public BigDecimal getVcst() {
		return vcst;
	}
	public void setVcst(BigDecimal vcst) {
		this.vcst = vcst;
	}
	public BigDecimal getNumofvarient() {
		return numofvarient;
	}
	public void setNumofvarient(BigDecimal numofvarient) {
		this.numofvarient = numofvarient;
	}
	public BigDecimal getItemseqnum() {
		return itemseqnum;
	}
	public void setItemseqnum(BigDecimal itemseqnum) {
		this.itemseqnum = itemseqnum;
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
