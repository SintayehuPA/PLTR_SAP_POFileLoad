package com.pltr.integ.gr.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the CST database table.
 * 
 */
@Entity
@NamedQuery(name="Cst.findAll", query="SELECT c FROM Cst c")
@Table(name="CST", schema="GM_MERCH" )
public class Cst implements Serializable {
	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private CstKey cstKey;

	@Column(name="BASE_METHOD")
	private String baseMethod;

	@Column(name="BASE_MHL")
	private BigDecimal baseMhl;

	@Column(name="BUY_CD")
	private String buyCd;

	@Column(name="BUY_QTY")
	private BigDecimal buyQty;

	private BigDecimal cst;

	@Column(name="EMP_INIT_KEY")
	private String empInitKey;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;

	@Temporal(TemporalType.DATE)
	@Column(name="ENT_DT")
	private Date entDt;

	@Column(name="ITM_UPD")
	private String itmUpd;

	@Column(name="MFG_VE_CD")
	private String mfgVeCd;

	@Column(name="MFG_VSN")
	private String mfgVsn;

	public Cst() {
	}

	public String getBaseMethod() {
		return this.baseMethod;
	}

	public void setBaseMethod(String baseMethod) {
		this.baseMethod = baseMethod;
	}

	public BigDecimal getBaseMhl() {
		return this.baseMhl;
	}

	public void setBaseMhl(BigDecimal baseMhl) {
		this.baseMhl = baseMhl;
	}

	public String getBuyCd() {
		return this.buyCd;
	}

	public void setBuyCd(String buyCd) {
		this.buyCd = buyCd;
	}

	public BigDecimal getBuyQty() {
		return this.buyQty;
	}

	public void setBuyQty(BigDecimal buyQty) {
		this.buyQty = buyQty;
	}

	public BigDecimal getCst() {
		return this.cst;
	}

	public void setCst(BigDecimal cst) {
		this.cst = cst;
	}

	
	public String getEmpInitKey() {
		return this.empInitKey;
	}

	public void setEmpInitKey(String empInitKey) {
		this.empInitKey = empInitKey;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public Date getEntDt() {
		return this.entDt;
	}

	public void setEntDt(Date entDt) {
		this.entDt = entDt;
	}

	public String getItmUpd() {
		return this.itmUpd;
	}

	public void setItmUpd(String itmUpd) {
		this.itmUpd = itmUpd;
	}

	public String getMfgVeCd() {
		return this.mfgVeCd;
	}

	public void setMfgVeCd(String mfgVeCd) {
		this.mfgVeCd = mfgVeCd;
	}

	public String getMfgVsn() {
		return this.mfgVsn;
	}

	public void setMfgVsn(String mfgVsn) {
		this.mfgVsn = mfgVsn;
	}

}