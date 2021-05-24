package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GmPoLnShipKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="PO_LN_SEQ_NUM")
	private BigDecimal poLnSeqNum;

	@Column(name="PO_NUM")
	private BigDecimal poNum;
	
	@Column(name="STORE_CD")
	private String storeCd;

	public BigDecimal getPoLnSeqNum() {
		return poLnSeqNum;
	}

	public void setPoLnSeqNum(BigDecimal poLnSeqNum) {
		this.poLnSeqNum = poLnSeqNum;
	}

	public BigDecimal getPoNum() {
		return poNum;
	}

	public void setPoNum(BigDecimal poNum) {
		this.poNum = poNum;
	}

	public String getStoreCd() {
		return storeCd;
	}

	public void setStoreCd(String storeCd) {
		this.storeCd = storeCd;
	}
	
	

}
