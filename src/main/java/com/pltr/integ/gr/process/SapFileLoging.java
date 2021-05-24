package com.pltr.integ.gr.process;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.entity.Sappofileline;
import com.pltr.integ.gr.entity.Sappofilelog;
import com.pltr.integ.gr.entity.Sappohd;
import com.pltr.integ.gr.repository.PoimportseqnumRepository;
import com.pltr.integ.gr.repository.SappofilelogRepository;
import com.pltr.integ.gr.repository.SappohdRepository;

@Service("SapFileLoging")
public class SapFileLoging {
	@Autowired
	PoimportseqnumRepository poimportseqnumRepository;
	
	@Autowired 
	SappofilelogRepository sappofilelogRepository;
	
	@Autowired
	SappohdRepository sappohdRepository;
	
	public void addLog(Sappofileline sappofileline, String loglevel, String message) {
		Sappofilelog sappofilelog = new Sappofilelog();
		sappofilelog.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
		sappofilelog.setFileid(sappofileline.getId());
		sappofilelog.setNote(message);
		sappofilelog.setLogdate(new Date());
		sappofilelog.setLoglevel(loglevel);
		sappofileline.setStatus("ERROR");
		sappofileline.addSappofilelogs(sappofilelog);
		sappofilelogRepository.save(sappofilelog);
	}
	
	public void addLog(Sappohd sappohd, String loglevel, String message) {
		Sappofilelog sappofilelog = new Sappofilelog();
		sappofilelog.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
		sappofilelog.setFileid(sappohd.getId());
		sappofilelog.setNote(message);
		sappofilelog.setLogdate(new Date());
		sappofilelog.setLoglevel(loglevel);
		sappohd.setStatus("ERROR");
		sappohdRepository.save(sappohd);
		sappofilelogRepository.save(sappofilelog);
	}
	
	public void addLog( String loglevel, String message) {
		Sappofilelog sappofilelog = new Sappofilelog();
		sappofilelog.setId(poimportseqnumRepository.findNewseqnum().getNewseqnum());
		sappofilelog.setNote(message);
		sappofilelog.setLogdate(new Date());
		sappofilelog.setLoglevel(loglevel);
;
	}

}
