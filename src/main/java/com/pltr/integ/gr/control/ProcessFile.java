package com.pltr.integ.gr.control;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.model.SapPoFileComposite;
import com.pltr.integ.gr.model.SappoComposite;
import com.pltr.integ.gr.process.Csv2Object;
import com.pltr.integ.gr.process.GersPoProcessor;
import com.pltr.integ.gr.process.Sapfilepoprocessor;
import com.pltr.integ.gr.process.Sappoprocesser;

@Service("ProcessFile")
public class ProcessFile {
	@Autowired 
	Csv2Object csv2Object;
	@Autowired
	Sapfilepoprocessor sapfilepoprocessor;
	@Autowired
	Sappoprocesser sappoprocesser;
	@Autowired
	GersPoProcessor gersPoProcessor;
	
	public void sapPo(String fileName) {
		try {
			SapPoFileComposite sapPoFileComposite=csv2Object.transformPoFile(fileName);
			sapfilepoprocessor.excute(sapPoFileComposite);
			SappoComposite sappoComposite =sappoprocesser.getContentForPo(sapPoFileComposite);
			gersPoProcessor.createNewPo(sappoComposite);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
