package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmItm;

public interface GmItmRepository extends CrudRepository<GmItm, String>{
	@Cacheable("GmItm")
	@Query (value="select * from gm_itm where itm_cd= ?1" , nativeQuery=true)
	public GmItm findByItmCd(String itmCd); 
}
