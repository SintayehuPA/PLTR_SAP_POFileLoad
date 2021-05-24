package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Cst;
import com.pltr.integ.gr.entity.CstKey;

public interface CstRepository extends CrudRepository<Cst, CstKey>{
	@Cacheable("Cst")
	@Query(value="select * from cst where itm_cd=?2 and ve_cd=?1 and eff_dt<=sysdate and (end_dt is null or end_dt>=sysdate) and rownum=1 order by ent_dt desc", nativeQuery=true)
	public Cst findByVecdItmcd(String vecd, String itmcd);

}
