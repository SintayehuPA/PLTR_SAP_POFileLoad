package com.pltr.integ.gr.repository;


import org.springframework.data.jpa.repository.Query;

public interface MislProcessRepository { //extends CrudRepository<String, String>
	
	@Query(value="INSERT  INTO  CUSTOM.SAPPOFILE " + 
			" ( ID, " + 
			" FILENAME, " + 
			" PONUM, " + 
			" RECEIVEDATE, " + 
			" PROCESSDATE, " + 
			" LASTPROCESSDT, " + 
			" NUMOFLINE, " + 
			" NUMOFLINEERR, " + 
			" NOTE, " + 
			" STATUS, " + 
			" POTYPE ) " + 
			" select rownum, a.* from " + 
			"(select filename,ponum,sysdate RECEIVEDATE,sysdate PROCESSDATE,sysdate LASTPROCESSDT,count(polnitem) numofline,sum(case when status='ERROR' then 1 else 0 end ) numoferr,'' NOTE,'LOAD' STATUS,'NEW' POTYPE " + 
			" from custom.sappofileline " + 
			" group by filename,ponum,'','LOAD','NEW',sysdate) a;", nativeQuery=true)
	public int addFiles2table();
	
	@Query(value=" INSERT  INTO  CUSTOM.SAPPOHD " + 
			" ( ID, " + 
			" SAPPONUM, " + 
			" GERSPONUM, " + 
			" VECD, " + 
			" SHIPDT, " + 
			" SHIPCMPLTDT, " + 
			" CANCELDT, " + 
			" STATUS, " + 
			" POTYPE ) " + 
			" select rownum, a.* from " + 
			"(select ponum,to_number(ponum)-4455000000 GERSPONUM,vecd,SHIPDT,SHIPCMPLTDT,nvl(CANCELDT,trunc(sysdate+21)) CANCELDT, 'LOAD' STATUS,'NEW' POTYPE " + 
			" from custom.sappofileline " + 
			" group by ponum,'LOAD','NEW',vecd,SHIPDT,SHIPCMPLTDT,nvl(CANCELDT,trunc(sysdate+21))) a;", nativeQuery=true)
	public int addHeaders2table();
	
	@Query(value=" INSERT INTO CUSTOM.SAPPOLINEITEM " + 
			" ( ID, " + 
			" SAPPONUM, " + 
			" GERSPONUM, " + 
			" ITMCD, " + 
			" VSNUM, " + 
			" VCST, " + 
			" NUMOFVARIENT, " + 
			" ITEMSEQNUM, " + 
			" POLNSEQSTART, " + 
			" STATUS, " + 
			" POTYPE ) " + 
			" select rownum, a.* from " + 
			"(select ponum,to_number(ponum)-4455000000 GERSPONUM,itmcd,vsnum,vcst,0 NUMOFVARIENT,0 ITEMSEQNUM,0 POLNSEQSTART, 'LOAD' STATUS,'NEW' POTYPE " + 
			" from custom.sappofileline " + 
			" where itmcd is not null " + 
			" group by ponum,'LOAD','NEW',itmcd,vsnum,vcst,0) a;", nativeQuery=true)
	public int addPoItmLn2table();
	
	@Query(value=" INSERT INTO CUSTOM . SAPPOLINESKU " + 
			" ( ID, " + 
			" SAPPONUM, " + 
			" GERSPONUM, " + 
			" ITMCD, " + 
			" SKUNUM, " + 
			" SEQNUM, " + 
			" POLNSEQ, " + 
			" LPRC, " + 
			" STATUS, " + 
			" POTYPE ) " + 
			" select rownum, a.* from " + 
			"(select ponum,to_number(ponum)-4455000000 GERSPONUM,itmcd,skunum,0 SEQNUM,0 POLNSEQ,LPRC, 'LOAD' STATUS,'NEW' POTYPE " + 
			" from custom.sappofileline " + 
			" where itmcd is not null " + 
			" group by ponum,'','LOAD','NEW',itmcd,skunum,LPRC,0) a;", nativeQuery=true)
	public int addPoSkuLn2table();
	
	@Query(value=" INSERT INTO CUSTOM . SAPPOLINESKUDISTR " + 
			" ( ID, " + 
			" SAPPONUM, " + 
			" GERSPONUM, " + 
			" SKUNUM, " + 
			" STORECD, " + 
			" POLNITEM, " + 
			" QTY, " + 
			" STATUS, " + 
			" POTYPE ) " + 
			" select rownum, a.* from " + 
			"(select ponum,to_number(ponum)-4455000000 GERSPONUM,skunum,STORECD,POLNITEM,qty,'LOAD' STATUS,'NEW' POTYPE " + 
			" from custom.sappofileline " + 
			" where skunum is not null " + 
			" group by ponum,ponum,skunum,STORECD,POLNITEM,qty,'LOAD','NEW' ) a;", nativeQuery=true)
	public int addPoDistributionLn2table();
	
	@Query(value=" ",nativeQuery=true)
	public int findMissingLine() ;


}
