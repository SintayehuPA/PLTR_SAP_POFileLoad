package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GmPoLnKey implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="PO_LN_SEQ_NUM")
	private BigDecimal poLnSeqNum;

	@Column(name="PO_NUM")
	private BigDecimal poNum;

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
	
	

}
