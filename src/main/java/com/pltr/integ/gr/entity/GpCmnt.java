package com.pltr.integ.gr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GP_CMNT" , schema="MISC")
public class GpCmnt {
	@EmbeddedId
	private GpCmntKey gpCmntKey;
	@Column(name = "CONTEXT_CD") private String context_cd;
	@Column(name = "CMNT_TP") private String cmnt_tp;
	@Column(name = "EMP_INIT_OP") private String emp_init_op;
	@Column(name = "CMNT_DT") private Date cmnt_dt;
	@Column(name = "CMNT_TIME") private String cmnt_time;

	@Column(name = "TEXT") private String text;
	
	public GpCmntKey getGpCmntKey() {
		if(gpCmntKey ==null)
			gpCmntKey= new GpCmntKey();
		return gpCmntKey;
	}
	public void setGpCmntKey(GpCmntKey gpCmntKey) {
		this.gpCmntKey = gpCmntKey;
	}
	public String getContext_cd() {
		return context_cd;
	}
	public void setContext_cd(String context_cd) {
		this.context_cd = context_cd;
	}
	public String getCmnt_tp() {
		return cmnt_tp;
	}
	public void setCmnt_tp(String cmnt_tp) {
		this.cmnt_tp = cmnt_tp;
	}
	public String getEmp_init_op() {
		return emp_init_op;
	}
	public void setEmp_init_op(String emp_init_op) {
		this.emp_init_op = emp_init_op;
	}
	public Date getCmnt_dt() {
		return cmnt_dt;
	}
	public void setCmnt_dt(Date cmnt_dt) {
		this.cmnt_dt = cmnt_dt;
	}
	public String getCmnt_time() {
		return cmnt_time;
	}
	public void setCmnt_time(String cmnt_time) {
		this.cmnt_time = cmnt_time;
	}

	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	


}
