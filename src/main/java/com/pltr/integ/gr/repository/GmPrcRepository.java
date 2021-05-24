package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmPrc;
import com.pltr.integ.gr.entity.GmPrcPK;

public interface GmPrcRepository extends CrudRepository<GmPrc, GmPrcPK> {
	@Cacheable("GmPrc")
	@Query(value = "select p.* from gm_prc p, store s where p.sku_num=?2 and s.store_cd=?1 and p.prc_grp_cd=s.prc_grp_cd and p.beg_dt<=sysdate and (p.end_dt is null or p.end_dt>=sysdate) and rownum=1 order by p.beg_dt,p.beg_time desc", nativeQuery = true)
	public GmPrc findByStoreCdSkunum(String storecd, String skunum);

}
