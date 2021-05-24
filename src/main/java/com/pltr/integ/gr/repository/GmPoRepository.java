package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmPo;

public interface GmPoRepository extends CrudRepository<GmPo, BigDecimal>{
	GmPo findByPoNum(BigDecimal poNum);
}
