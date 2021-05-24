package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmItm2ve;
import com.pltr.integ.gr.entity.GmItm2veKey;

public interface GmItm2veRepository extends CrudRepository<GmItm2ve, GmItm2veKey>{
	@Cacheable("GmItm2ve")
	@Query (value="select * from gm_itm2ve where ve_cd=?1 and itm_cd= ?2" , nativeQuery=true)
	public GmItm2ve findByVeItmCd(String vecd,String itmCd); 
}
