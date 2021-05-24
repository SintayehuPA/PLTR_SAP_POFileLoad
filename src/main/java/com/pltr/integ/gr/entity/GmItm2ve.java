package com.pltr.integ.gr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the GM_ITM2VE database table.
 * 
 */
@Entity
@Table(name = "GM_ITM2VE", schema = "GM_MERCH")
@NamedQuery(name = "GmItm2ve.findAll", query = "SELECT g FROM GmItm2ve g")
public class GmItm2ve implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GmItm2veKey gmItm2veKey;
	

	public GmItm2veKey getGmItm2veKey() {
		return gmItm2veKey;
	}

	public void setGmItm2veKey(GmItm2veKey gmItm2veKey) {
		this.gmItm2veKey = gmItm2veKey;
	}

	@Column(name = "TNET_VSN_PREFIX")
	private String tnetVsnPrefix;
	@Column(name = "VSN")
	private String vsn;

	public GmItm2ve() {
	}

	public String getTnetVsnPrefix() {
		return this.tnetVsnPrefix;
	}

	public void setTnetVsnPrefix(String tnetVsnPrefix) {
		this.tnetVsnPrefix = tnetVsnPrefix;
	}

	public String getVsn() {
		return this.vsn;
	}

	public void setVsn(String vsn) {
		this.vsn = vsn;
	}

	
	

}