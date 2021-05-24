package com.pltr.integ.gr.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.entity.Sappofile;
import com.pltr.integ.gr.entity.Sappofileline;
import com.pltr.integ.gr.repository.SappofileRepository;
import com.pltr.integ.gr.repository.SappofilelineRepository;

@Service("GetErroredLines")
public class GetErroredLines {
	@Autowired
	private SappofileRepository sappofileRepository;
	
	@Autowired
	private SappofilelineRepository sappofilelineRepository;
	
	private int pageNumber = 0;
	private int pageSize = 1;



	public SapPoFileComposite nextFile() {
		Sappofile sappofile= findNextFile();
		List<Sappofileline> sappofilelines= sappofilelineRepository.findByFileName(sappofile.getFilename());
		SapPoFileComposite sapPoFileComposite= new SapPoFileComposite();
		sapPoFileComposite.setSappofile(sappofile);
		sapPoFileComposite.setSappofilelines(sappofilelines);
		return sapPoFileComposite;
	}

	public Sappofile findNextFile() {

		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		Page<Sappofile> sappofile = sappofileRepository.findAllByStatus("ERROR", pageable);
		long totalPages = sappofile.getTotalPages();
		if(totalPages>pageNumber) {
			pageable = PageRequest.of(pageNumber++, pageSize);
			sappofile = sappofileRepository.findAllByStatus("ERROR", pageable);
			List<Sappofile> sappofileL=sappofile.getContent();
			System.out.println(sappofileL.get(0).getFilename());
			return sappofileL.get(0);
		}

		return null;
	}

	public List<Sappofile> fileatPage(int pageNo, int pageSize) {
		return null;
	}

}
