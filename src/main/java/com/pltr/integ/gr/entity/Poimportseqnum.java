package com.pltr.integ.gr.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Poimportseqnum {
	@Id
	private BigDecimal newseqnum;

	public BigDecimal getNewseqnum() {
		return newseqnum;
	}

	public void setNewseqnum(BigDecimal newseqnum) {
		this.newseqnum = newseqnum;
	}
	

}
