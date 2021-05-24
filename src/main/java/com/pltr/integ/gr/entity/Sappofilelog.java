package com.pltr.integ.gr.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="CUSTOM", name="Sappofilelog")
public class Sappofilelog {
/**
 * ID	NUMBER
LOGDATE	DATE
FILEID	NUMBER
LINENUM	NUMBER
NOTE	VARCHAR2
LOGLEVEL	VARCHAR2
 */
	
	@Id
	private BigDecimal id;
	private Date logdate;
	private BigDecimal fileid;
	private BigDecimal linenum;
	private String note;
	private String loglevel;
	public BigDecimal getId() {
		return id;
	}
	public void setId(BigDecimal id) {
		this.id = id;
	}
	public Date getLogdate() {
		return logdate;
	}
	public void setLogdate(Date logdate) {
		this.logdate = logdate;
	}
	public BigDecimal getFileid() {
		return fileid;
	}
	public void setFileid(BigDecimal fileid) {
		this.fileid = fileid;
	}
	public BigDecimal getLinenum() {
		return linenum;
	}
	public void setLinenum(BigDecimal linenum) {
		this.linenum = linenum;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getLoglevel() {
		return loglevel;
	}
	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}
	
	
}
