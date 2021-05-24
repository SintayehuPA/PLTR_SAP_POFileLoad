package com.pltr.integ.gr.repository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.repository.CrudRepository;

import com.pltr.integ.gr.entity.GmSku2upcCd;

public interface GmSku2upcCdRepository extends CrudRepository<GmSku2upcCd, String> {
	@Cacheable("GmSku2upcCd")
	public GmSku2upcCd findByUpcCd(String upcCd);
}
