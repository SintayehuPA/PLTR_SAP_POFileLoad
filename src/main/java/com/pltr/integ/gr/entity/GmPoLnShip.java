package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the GM_PO_LN_SHIP database table.
 * 
 */
@Entity
@Table(schema = "GM_MERCH",name="GM_PO_LN_SHIP")
@NamedQuery(name="GmPoLnShip.findAll", query="SELECT g FROM GmPoLnShip g")
public class GmPoLnShip implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private GmPoLnShipKey gmPoLnShipKey;

	private BigDecimal qty;

	@Column(name="RTD_QTY")
	private BigDecimal rtdQty;

	@Temporal(TemporalType.DATE)
	@Column(name="SHIP_DT")
	private Date shipDt;


	public GmPoLnShip() {
	}



	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

	public BigDecimal getRtdQty() {
		return this.rtdQty;
	}

	public void setRtdQty(BigDecimal rtdQty) {
		this.rtdQty = rtdQty;
	}

	public Date getShipDt() {
		return this.shipDt;
	}

	public void setShipDt(Date shipDt) {
		this.shipDt = shipDt;
	}



	public GmPoLnShipKey getGmPoLnShipKey() {
		return gmPoLnShipKey;
	}



	public void setGmPoLnShipKey(GmPoLnShipKey gmPoLnShipKey) {
		this.gmPoLnShipKey = gmPoLnShipKey;
	}



	@Override
	public String toString() {
		return "\nGmPoLnShip [gmPnLnShipPk=" + gmPoLnShipKey + ", qty=" + qty + ", rtdQty=" + rtdQty + ", shipDt=" + shipDt
				+ "]";
	}
	
	

}