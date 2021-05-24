package com.pltr.integ.gr.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappolineitem;

public interface SappolineitemRepository extends CrudRepository<Sappolineitem, BigDecimal>{
	@Query (value="select * from custom.sappolineitem where sapponum=?1  and itmcd=?2 and rownum=1" , nativeQuery=true)
	Sappolineitem findByPoAndItmcd(String ponum, String itmcd);

}
