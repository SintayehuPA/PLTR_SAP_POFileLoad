package com.pltr.integ.gr.model;

import java.util.ArrayList;
import java.util.List;

import com.pltr.integ.gr.entity.Sappofile;
import com.pltr.integ.gr.entity.Sappofileline;

public class SapPoFileComposite {
	private Sappofile sappofile= new Sappofile();
	List<Sappofileline> sappofilelines=new ArrayList<Sappofileline>();
	public Sappofile getSappofile() {
		return sappofile;
	}
	public void setSappofile(Sappofile sappofile) {
		this.sappofile = sappofile;
	}
	public List<Sappofileline> getSappofilelines() {
		
		return sappofilelines;
	}
	public void setSappofilelines(List<Sappofileline> sappofilelines) {
		this.sappofilelines = sappofilelines;
	}
	public void addSappofilelines(Sappofileline sappofileline) {
		this.sappofilelines.add(sappofileline);
	}
}
