package com.pltr.integ.gr.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(schema = "CUSTOM", name = "Sappofile")
@NamedQuery(name = "Sappofile.findAll", query = "SELECT p FROM Sappofile p")
public class Sappofile {

	@Id
	@Column(name = "id")
	private BigDecimal id;
	@Column(name = "filename")
	private String filename;
	@Column(name = "ponum")
	private String ponum;
	@Column(name = "receivedate")
	private Date receivedt;
	@Column(name = "processdate")
	private Date processdate;
	@Column(name = "lastprocessdt")
	private Date lastprocessdt;
	@Column(name = "status")
	private String status;
	@Column(name = "numofline")
	private BigDecimal numofline;
	@Column(name = "numoflineerr")
	private BigDecimal numoflineerr;
	@Column(name = "note")
	private String note;
	@Column(name = "potype")
	private String potype;
	
	
	
	public Date getProcessdate() {
		return processdate;
	}
	public void setProcessdate(Date processdate) {
		this.processdate = processdate;
	}
	public String getPonum() {
		return ponum;
	}
	public void setPonum(String ponum) {
		this.ponum = ponum;
	}
	public BigDecimal getNumofline() {
		return numofline;
	}
	public void setNumofline(BigDecimal numofline) {
		this.numofline = numofline;
	}
	public BigDecimal getNumoflineerr() {
		return numoflineerr;
	}
	public void setNumoflineerr(BigDecimal numoflineerr) {
		this.numoflineerr = numoflineerr;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getPotype() {
		return potype;
	}
	public void setPotype(String potype) {
		this.potype = potype;
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
	public Date getLastprocessdt() {
		return lastprocessdt;
	}
	public void setLastprocessdt(Date lastprocessdt) {
		this.lastprocessdt = lastprocessdt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	

}
