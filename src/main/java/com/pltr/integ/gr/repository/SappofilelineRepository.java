package com.pltr.integ.gr.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappofileline;

public interface SappofilelineRepository extends CrudRepository<Sappofileline, BigDecimal>{
	@Query (value="select * from custom.sappofileline where ponum=?1 order by receivedt desc" , nativeQuery=true)
	List<Sappofileline>   findByPonum(String ponum);
	
	@Query (value="select * from custom.sappofileline where filename=?1 order by receivedt desc" , nativeQuery=true)
	List<Sappofileline>   findByFileName(String fileName);

}
