package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the GM_SKU2UPC_CD database table.
 * 
 */
@Entity
@Table(name = "GM_SKU2UPC_CD",schema="GM_INV")
@NamedQuery(name = "GmSku2upcCd.findAll", query = "SELECT g FROM GmSku2upcCd g")
public class GmSku2upcCd implements Serializable {
	private static final long serialVersionUID = 1L;

	private String des;

	@Column(name = "SKU_NUM")
	private String skuNum;
	@Id
	@Column(name = "UPC_CD")
	private String upcCd;
	
	@Column(name = "UPC_TP")
	private String upcTp;

	public GmSku2upcCd() {
	}

	public String getDes() {
		return this.des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public String getSkuNum() {
		return this.skuNum;
	}

	public void setSkuNum(String skuNum) {
		this.skuNum = skuNum;
	}

	public String getUpcCd() {
		return this.upcCd;
	}

	public void setUpcCd(String upcCd) {
		this.upcCd = upcCd;
	}

	public String getUpcTp() {
		return this.upcTp;
	}

	public void setUpcTp(String upcTp) {
		this.upcTp = upcTp;
	}

}