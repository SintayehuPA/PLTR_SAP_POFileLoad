package com.pltr.integ.gr.process;


import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component("CamelConfigurator")
public class CamelConfigurator {
	private final Logger log = LoggerFactory.getLogger(CamelConfigurator.class);
	@Autowired
	CamelContext camelContext;
	@Autowired
	@Qualifier("PltrFtpClientRouteBuilder")
	RouteBuilder pltrFtpClientRouteBuilder;

	public String startCamel() {
		try {
			log.info("Camle Context start route Po Import");
			((DefaultCamelContext) camelContext).setName("PoImport");
			camelContext.addRoutes(pltrFtpClientRouteBuilder);
			camelContext.start();
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Camle Context start route Po Import Failed " + e.getMessage());
			return "Error :" + e.getMessage();
		}
		log.info("Camle Context exit route Po Import");
		return "Done";
	}

}
