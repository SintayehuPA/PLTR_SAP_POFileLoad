package com.pltr.integ.gr.model;

import java.util.Hashtable;

import com.pltr.integ.gr.entity.Sappohd;
import com.pltr.integ.gr.entity.Sappolineitem;
import com.pltr.integ.gr.entity.Sappolinesku;
import com.pltr.integ.gr.entity.Sappolineskudistr;

public class SappoComposite {
	private Hashtable<String, Sappolineitem> lineitems = null;
	private Hashtable<String, Sappolinesku> linesku = null;
	private Hashtable<String, Sappolineskudistr> lineskudistr = null;
	private Sappohd sappohd = null;
	public Hashtable<String, Sappolineitem> getLineitems() {
		return lineitems;
	}
	public void setLineitems(Hashtable<String, Sappolineitem> lineitems) {
		this.lineitems = lineitems;
	}
	public Hashtable<String, Sappolinesku> getLinesku() {
		return linesku;
	}
	public void setLinesku(Hashtable<String, Sappolinesku> linesku) {
		this.linesku = linesku;
	}
	public Hashtable<String, Sappolineskudistr> getLineskudistr() {
		return lineskudistr;
	}
	public void setLineskudistr(Hashtable<String, Sappolineskudistr> lineskudistr) {
		this.lineskudistr = lineskudistr;
	}
	public Sappohd getSappohd() {
		return sappohd;
	}
	public void setSappohd(Sappohd sappohd) {
		this.sappohd = sappohd;
	}
	
	

}
