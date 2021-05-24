package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappolinesku;


public interface SappolineskuRepository extends CrudRepository<Sappolinesku, BigDecimal>{
	@Query (value="select * from custom.sappolinesku where sapponum=?1  and skunum=?2 and rownum=1" , nativeQuery=true)
	Sappolinesku findByPonumAndSkunum(String ponum, String skunum);

}
