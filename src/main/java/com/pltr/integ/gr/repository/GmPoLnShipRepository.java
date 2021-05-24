package com.pltr.integ.gr.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmPoLnShip;
import com.pltr.integ.gr.entity.GmPoLnShipKey;

public interface GmPoLnShipRepository extends CrudRepository <GmPoLnShip, GmPoLnShipKey>{
	List<GmPoLnShip> findByGmPoLnShipKeyPoNum(BigDecimal poNum);
	@Query(value = " select * from  gm_po_ln_ship where po_num=?1 and po_ln_seq_num=?2 and store_cd=?3 and rownum=1 order by ship_dt desc", nativeQuery = true)
	GmPoLnShip findByPoNumPoLnSeqNumStoreCd(BigDecimal poNum,BigDecimal poLnSeqNum,String storeCd);
	
	@Query(value = " select * from  gm_po_ln_ship where po_num=?1 and po_ln_seq_num=?2 ", nativeQuery = true)
	List<GmPoLnShip> findByPoNumPoLnSeqNum(BigDecimal poNum,BigDecimal poLnSeqNum);
	
}
