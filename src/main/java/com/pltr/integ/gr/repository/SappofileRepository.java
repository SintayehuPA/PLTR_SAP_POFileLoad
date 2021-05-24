package com.pltr.integ.gr.repository;


import java.math.BigDecimal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.Sappofile;

public interface SappofileRepository extends CrudRepository<Sappofile, BigDecimal> {
	@Query (value="select * from custom.Sappofile where status=?1 and receivedate > sysdate-7 " , nativeQuery=true)
	Page<Sappofile> findAllByStatus(String status, Pageable pageable);
}
