package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmSku;

public interface GmSkuRepository extends CrudRepository<GmSku, String>{
	@Cacheable("GmSku")
	public GmSku findBySkuNum(String skuNum);
	
	@Query(value="select max(itm_seq) from gm_sku where itm_cd =?1",nativeQuery=true)
	public BigDecimal findMaxItmSeq(String itmCd);
	
	@Query(value=" select itm_seq from gm_sku where sku_num =?1",nativeQuery=true)
	public BigDecimal findItmSeq(String skuNum);

}
