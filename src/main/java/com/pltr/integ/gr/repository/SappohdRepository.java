package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappohd;

public interface SappohdRepository extends CrudRepository<Sappohd, BigDecimal>{
	
	@Query (value="select * from custom.sappohd where sapponum=?1 and rownum=1" , nativeQuery=true)
	public Sappohd findByPonum(String ponum);

}
