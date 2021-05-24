package com.pltr.integ.gr.control;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.model.GetErroredLines;
import com.pltr.integ.gr.model.SapPoFileComposite;
import com.pltr.integ.gr.model.SappoComposite;
import com.pltr.integ.gr.process.GersPoProcessor;
import com.pltr.integ.gr.process.Sapfilepoprocessor;
import com.pltr.integ.gr.process.Sappoprocesser;

@Service("ProcessErrors")
public class ProcessErrors {
	@Autowired
	GetErroredLines getErroredLines;
	@Autowired
	Sapfilepoprocessor sapfilepoprocessor;
	@Autowired
	Sappoprocesser sappoprocesser;
	@Autowired
	GersPoProcessor gersPoProcessor;

	public void sapPo() {
		try {
			SapPoFileComposite sapPoFileComposite = getErroredLines.nextFile();
			while (sapPoFileComposite != null) {
				sapfilepoprocessor.excute(sapPoFileComposite);
				SappoComposite sappoComposite = sappoprocesser.getContentForPo(sapPoFileComposite);
				gersPoProcessor.createNewPo(sappoComposite);
				sapPoFileComposite = getErroredLines.nextFile();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
