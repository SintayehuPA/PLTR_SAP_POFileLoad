package com.pltr.integ.gr.control;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("PoFileProcessor")
public class PoFileProcessor implements Processor {

	@Autowired 
	ProcessFile processFile;


	@Override
	public void process(Exchange exchange) {
	
		File payload = exchange.getIn().getBody(File.class);
		String fileName = payload.getPath();
		Logger logger = LoggerFactory.getLogger(this.getClass());
		try {
			processFile.sapPo(fileName);
		} catch (Exception e) {			
			logger.info(e.getMessage());
			e.printStackTrace();
		} finally {
			
		}

	}

}
