package com.pltr.integ.gr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GmItm2veKey implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "ITM_CD")
	private String itmCd;
	
	@Column(name = "VE_CD")
	private String veCd;

	public String getItmCd() {
		return itmCd;
	}

	public void setItmCd(String itmCd) {
		this.itmCd = itmCd;
	}

	public String getVeCd() {
		return veCd;
	}

	public void setVeCd(String veCd) {
		this.veCd = veCd;
	}
	
	

}
