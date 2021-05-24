package com.pltr.integ.gr.model;

import java.util.ArrayList;
import java.util.List;

import com.pltr.integ.gr.entity.GmPo;
import com.pltr.integ.gr.entity.GmPoLn;
import com.pltr.integ.gr.entity.GmPoLnShip;

public class GmPoComposite {
	private GmPo gmPo;
	private List<GmPoLn> gmPoLn = new ArrayList<GmPoLn>();
	private List<GmPoLnShip> gmPoLnShip= new ArrayList<GmPoLnShip>();
	public GmPo getGmPo() {
		return gmPo;
	}
	public void setGmPo(GmPo gmPo) {
		this.gmPo = gmPo;
	}
	public List<GmPoLn> getGmPoLn() {
		return gmPoLn;
	}
	public void setGmPoLn(List<GmPoLn> gmPoLn) {
		this.gmPoLn = gmPoLn;
	}
	public List<GmPoLnShip> getGmPoLnShip() {
		return gmPoLnShip;
	}
	public void setGmPoLnShip(List<GmPoLnShip> gmPoLnShip) {
		this.gmPoLnShip = gmPoLnShip;
	}
	
	

}
