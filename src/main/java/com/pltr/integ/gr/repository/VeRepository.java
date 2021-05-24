package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Ve;


public interface VeRepository extends CrudRepository<Ve, String>{

	@Cacheable("GmItm")
	@Query (value="select * from ve where ve_cd= ?1" , nativeQuery=true)
	public Ve findByVeCd(String veCd); 
}
