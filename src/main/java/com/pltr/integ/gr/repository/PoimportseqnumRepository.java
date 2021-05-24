package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Poimportseqnum;

public interface PoimportseqnumRepository extends CrudRepository<Poimportseqnum, BigDecimal>{
	
	@Query(value="select CUSTOM.poimportseqNum.nextval newseqnum from dual",nativeQuery=true)
	public Poimportseqnum findNewseqnum();

}
