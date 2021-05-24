package com.pltr.integ.gr.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GpCmntKey  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "GP_CMNT_SEQ_NUM") private BigDecimal gpCmntSeqNum;
	@Column(name = "GP_CMNT_LN_SEQ_NUM") private BigDecimal gpCmntLnSeqNum;
	public BigDecimal getGpCmntSeqNum() {
		return gpCmntSeqNum;
	}
	public void setGpCmntSeqNum(BigDecimal gpCmntSeqNum) {
		this.gpCmntSeqNum = gpCmntSeqNum;
	}
	public BigDecimal getGpCmntLnSeqNum() {
		return gpCmntLnSeqNum;
	}
	public void setGpCmntLnSeqNum(BigDecimal gpCmntLnSeqNum) {
		this.gpCmntLnSeqNum = gpCmntLnSeqNum;
	}
	
}
