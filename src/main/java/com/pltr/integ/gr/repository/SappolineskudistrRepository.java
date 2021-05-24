package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappolineskudistr;


public interface SappolineskudistrRepository extends CrudRepository<Sappolineskudistr, BigDecimal>{
	@Query (value="select * from custom.sappolineskudistr where sapponum=?1  and skunum=?2 and storecd=?3 and rownum=1" , nativeQuery=true)
	public Sappolineskudistr findByPonumAndSkunumAndStorecd(String ponum, String skunum, String storecd);

}
