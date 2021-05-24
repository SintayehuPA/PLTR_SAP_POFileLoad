package com.pltr.integ.gr.process;

import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.control.PoErrorProcessor;
import com.pltr.integ.gr.control.PoFileProcessor;


@Service("PltrFtpClientRouteBuilder")
public class PltrFtpClientRouteBuilder extends RouteBuilder {


	@Autowired
	PoFileProcessor poFileProcessor;
	
	@Autowired
	PoErrorProcessor poErrorProcessor;
	
	private static final Logger log = LoggerFactory.getLogger(PltrFtpClientRouteBuilder.class);
	
//	@Value("${pltr.config.integ.camel}")
//	private String camelProp;

	@Override
	public void configure() throws Exception {
		
		
		log.info("===Apache Camel starts Route===");
		getContext().getShutdownStrategy().setTimeout(30);	
		
		from("file:/tmp/gers/po/IB?moveFailed=../error&move=../gearsloadcomplete")
		.routeId("Po_file_import_process")
		.to("direct:fileProcessor")
		.end();        
		           
		from("direct:fileProcessor")
		.process(poFileProcessor)
		.log("New Po file:- ${file:name} processed")
		.end();
		
		from("quartz://sapPo/errorRerun?cron=0+45+9 bgtbgt5saazqzeee,22+*+*+?")
		.routeId("Po_error_import_process")
		.to("direct:errorProcessor")
		.end(); 
						
		from("direct:errorProcessor")
		.process(poErrorProcessor)
		.log("Error Po file:- ${file:name} processed")
		.end();
		
		from("sftp://SAP_GERS@orion.tpscorp.theparadiesshops.com:22/S4Hana2Gers/PO?move=Archive&password=RAW(f9oroUGwlp-z90fK0h9Kvxr83dgsE3X6gzb)&include=.*\\.csv")
		.to("file:/tmp/gers/po/IB?moveFailed=../error")
		.end();
		
		from("file:/tmp/gers/po/GR?moveFailed=../error&doneFileName=${file:name}.done")
		.routeId("goods_receiving")
		.to("sftp://SAP_GERS@orion.tpscorp.theparadiesshops.com:22/Gers2S4Hana/GR?password=RAW(f9oroUGwlp-z90fK0h9Kvxr83dgsE3X6gzb)")
		.end();

		from("file:/tmp/gers/po/IA?moveFailed=../error&doneFileName=${file:name}.done")
		.routeId("inventory_adjestment")
		.to("sftp://SAP_GERS@orion.tpscorp.theparadiesshops.com:22/Gers2S4Hana/IA?password=RAW(f9oroUGwlp-z90fK0h9Kvxr83dgsE3X6gzb)")
		.end();

		
	}
	
}
