package com.pltr.integ.gr.process;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pltr.integ.gr.entity.Sappofileline;
import com.pltr.integ.gr.model.SapPoFileComposite;

/**
 * 
 * @author ssetargachew Transform csv file to PoFile Object
 *
 */
@Service("Csv2Object")
public class Csv2Object {
	@Autowired 
	SapFileLoging sapFileLoging;
	
	private Date parsDate(String date) {
		String[] patterns = { "M/d/yy", "d-MMM-yy", "M-d-yy", "d/MMM/yy" }; //
		Date d = null;
		for (String pattern : patterns) {
			try {
				SimpleDateFormat format = new SimpleDateFormat(pattern);
				d = format.parse(date.trim());
				return d;
			} catch (ParseException e) {

			}
		}
		return d;
	}

	public SapPoFileComposite transformPoFile(String fileName) throws IOException {
		SapPoFileComposite sapPoFileComposite= new SapPoFileComposite();
		Reader in=null;
		File payload=null;
		try {
			payload = new File(fileName);
			in = new FileReader(payload);
			Iterable<CSVRecord> records;
			records = CSVFormat.DEFAULT.withHeader().parse(in);
			sapPoFileComposite.getSappofile().setFilename(payload.getName());
			sapPoFileComposite.getSappofile().setLastprocessdt(new Date());
			sapPoFileComposite.getSappofile().setPotype(fileName.contains("POCHG")?"UPD":"NEW");
			sapPoFileComposite.getSappofile().setReceivedt(new Date());
			sapPoFileComposite.getSappofile().setStatus("LOAD");
			for (CSVRecord record : records) {
				Sappofileline sappofileline = new Sappofileline();
				try {
					sappofileline.setCanceldt(parsDate(record.get("CANCEL_DT")));
					sappofileline.setFilename(payload.getName());
					sappofileline.setFob(record.get("FOB"));
					sappofileline.setPolnitem(record.get("PO LINE ITEM"));
					sappofileline.setPonum(record.get("PO_NUM"));
					sappofileline.setQty(new BigDecimal(record.get("QTY")));
					sappofileline.setReceivedt(new Date());
					sappofileline.setSapdc(record.get("SAPDC"));
					sappofileline.setShipcmpltdt(parsDate(record.get("SHIP_CMPLT_DT")));
					sappofileline.setShipdt(parsDate(record.get("DO_NOT_SHIP_BEFORE_DT")));
					sappofileline.setStorecd(record.get("DELIV_STORE_CD"));
					sappofileline.setUpccd(record.get("UPC_CD"));
					sappofileline.setVecd(record.get("VE_CD"));
					sapPoFileComposite.addSappofilelines(sappofileline);
				} catch (Exception e) {
					e.printStackTrace();
					sapFileLoging.addLog(sappofileline, "ERROR", e.getMessage());
				} finally {

				}
			}
			
		} catch (IOException e1) {
			e1.printStackTrace();
			sapFileLoging.addLog( "ERROR", e1.getMessage());
		} finally {
			in.close();
		}
		return sapPoFileComposite;
	}

}
