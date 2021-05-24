package com.pltr.integ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pltr.integ.gr.control.ProcessFile;

@SpringBootApplication
public class PltrSapPoFileLoadApplication {
	@Autowired
	ProcessFile processFile;

	public static void main(String[] args) {
		SpringApplication.run(PltrSapPoFileLoadApplication.class, args);
	}
	

}
