package com.pltr.integ.gr.control;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("PoErrorProcessor")
public class PoErrorProcessor implements Processor {

	@Autowired 
	ProcessErrors processErrors;


	@Override
	public void process(Exchange exchange) {
	
		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			processErrors.sapPo();
		} catch (Exception e) {			
			logger.info(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}

	}

}
