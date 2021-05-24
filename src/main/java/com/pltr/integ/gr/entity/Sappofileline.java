package com.pltr.integ.gr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(schema = "CUSTOM", name = "Sappofileline")
//@NamedQuery(name = "Sappofileline.findAll", query = "SELECT p FROM Sappofileline p")
public class Sappofileline {
	@Id
	@Column(name = "ID")
	private BigDecimal id;
	@Column(name = "filename")
	private String filename;
	@Column(name = "receivedt")
	private Date receivedt;
	@Column(name = "vecd")
	private String vecd;
	@Column(name = "storecd")
	private String storecd;
	@Column(name = "sapdc")
	private String sapdc;
	@Column(name = "fob")
	private String fob;
	@Column(name = "upccd")
	private String upccd;
	@Column(name = "qty")
	private BigDecimal qty;
	@Column(name = "shipdt")
	private Date shipdt;
	@Column(name = "shipcmpltdt")
	private Date shipcmpltdt;
	@Column(name = "canceldt")
	private Date canceldt;
	@Column(name = "ponum")
	private String ponum;
	@Column(name = "polnitem")
	private String polnitem;
	@Column(name = "empinit")
	private String empinit;
	@Column(name = "status")
	private String status;
	@Column(name = "skunum")
	private String skunum;
	@Column(name = "itmcd")
	private String itmcd;
	@Column(name = "vsnum")
	private String vsnum;
	@Column(name = "lprc")
	private BigDecimal lprc;
	@Column(name = "vcst")
	private BigDecimal vcst;
	@Column(name = "TERMSKEY")
	private BigDecimal termskey;
	@Column(name = "TERMSPCT")
	private BigDecimal termspct;
	@Column(name = "TERMSDAYS")
	private BigDecimal termsdays;
	@Column(name = "DIVCD")
	private String divcd;
	@Column(name = "DEPTCD")
	private String deptcd;
	@Column(name = "SUBCLASSCD")
	private String subclasscd;
	@Column(name = "CLASSCD")
	private String classcd;

	@Column(name = "frtterms")
	private String frtterms;
	
	@Column(name = "SAPPOLINESKUDISTRID")
	private BigDecimal sappolineskudistrid;
	
	public String getFrtterms() {
		return frtterms;
	}

	public void setFrtterms(String frtterms) {
		this.frtterms = frtterms;
	}



	public BigDecimal getSappolineskudistrid() {
		return sappolineskudistrid;
	}

	public void setSappolineskudistrid(BigDecimal sappolineskudistrid) {
		this.sappolineskudistrid = sappolineskudistrid;
	}

	// @OneToMany()
	@Transient
	private List<Sappofilelog> sappofilelogs = new ArrayList<Sappofilelog>();;

	public void addSappofilelogs(Sappofilelog sappofilelog) {
		if (sappofilelogs == null) {
			sappofilelogs = new ArrayList<Sappofilelog>();
		}
		sappofilelogs.add(sappofilelog);
	}

	public String getSkunum() {
		return skunum;
	}

	public void setSkunum(String skunum) {
		this.skunum = skunum;
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

	public BigDecimal getLprc() {
		return lprc;
	}

	public void setLprc(BigDecimal lprc) {
		this.lprc = lprc;
	}

	public BigDecimal getVcst() {
		return vcst;
	}

	public void setVcst(BigDecimal vcst) {
		this.vcst = vcst;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Date getReceivedt() {
		return receivedt;
	}

	public void setReceivedt(Date receivedt) {
		this.receivedt = receivedt;
	}

	public String getVecd() {
		return vecd;
	}

	public void setVecd(String vecd) {
		this.vecd = vecd;
	}

	public String getStorecd() {
		return storecd;
	}

	public void setStorecd(String storecd) {
		this.storecd = storecd;
	}

	public String getSapdc() {
		return sapdc;
	}

	public void setSapdc(String sapdc) {
		this.sapdc = sapdc;
	}

	public String getFob() {
		return fob;
	}

	public void setFob(String fob) {
		this.fob = fob;
	}

	public String getUpccd() {
		return upccd;
	}

	public void setUpccd(String upccd) {
		this.upccd = upccd;
	}

	public BigDecimal getQty() {
		return qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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

	public String getPonum() {
		return ponum;
	}

	public void setPonum(String ponum) {
		this.ponum = ponum;
	}

	public String getPolnitem() {
		return polnitem;
	}

	public void setPolnitem(String polnitem) {
		this.polnitem = polnitem;
	}

	public String getEmpinit() {
		return empinit;
	}

	public void setEmpinit(String empinit) {
		this.empinit = empinit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getSubclasscd() {
		return subclasscd;
	}

	public void setSubclasscd(String subclasscd) {
		this.subclasscd = subclasscd;
	}

	public String getClasscd() {
		return classcd;
	}

	public void setClasscd(String classcd) {
		this.classcd = classcd;
	}

	@Override
	public String toString() {
		return "\nSappofileline [id=" + id + ", filename=" + filename + ", receivedt=" + receivedt + ", vecd=" + vecd
				+ ", storecd=" + storecd + ", sapdc=" + sapdc + ", fob=" + fob + ", upccd=" + upccd + ", qty=" + qty
				+ ", shipdt=" + shipdt + ", shipcmpltdt=" + shipcmpltdt + ", canceldt=" + canceldt + ", ponum=" + ponum
				+ ", polnitem=" + polnitem + ", empinit=" + empinit + ", status=" + status + "]";
	}

}
