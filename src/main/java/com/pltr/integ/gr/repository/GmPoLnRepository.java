package com.pltr.integ.gr.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmPoLn;
import com.pltr.integ.gr.entity.GmPoLnKey;

public interface GmPoLnRepository extends  CrudRepository<GmPoLn, GmPoLnKey>{

	@Query(value = "select p.* from  gm_merch.gm_po_ln p where p.po_num=?1 and p.sku_num=?2 and rownum=1 order by p.eta_dt_ins_upd desc", nativeQuery = true)
	GmPoLn findByPoNumSkuNum(BigDecimal poNum,String skuNum) ;
	
	@Query(value = "select p.* from  gm_merch.gm_po_ln p where p.po_num=?1 ", nativeQuery = true)
	List<GmPoLn> findByPoNum(BigDecimal poNum) ;


}
