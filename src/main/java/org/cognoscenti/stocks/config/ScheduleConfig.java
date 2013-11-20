package org.cognoscenti.stocks.config;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.cognoscenti.stocks.schedule.StockHistorySummaryServiceSchedule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class ScheduleConfig {
	
	@Bean
	public StockHistorySummaryServiceSchedule marketSnapshotServiceSchedule() {
		return new StockHistorySummaryServiceSchedule();
	}
	
	@Bean
	public DateFormat schedulesDateFormat() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm");
		dateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
		
		return dateFormat;
	}
	
}