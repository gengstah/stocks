package org.cognoscenti.stocks.schedule;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.scheduling.support.CronSequenceGenerator;

public class StockHistorySummaryServiceScheduleTest {
	
	@Test
	public void testMarketSnapshotCron() throws ParseException {
		
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(new Date()));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 09:30:00")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 09:30:10")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 09:31:00")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 11:50:00")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 12:00:00")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 12:21:00")));		
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 12:30:00")));
		System.out.println(new CronSequenceGenerator("0/10 * 9-11,13-14 ? * MON-FRI").next(df.parse("11-20-2013 12:40:00")));
		
	}
	
}