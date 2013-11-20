package org.cognoscenti.stocks.schedule;

import java.util.List;

import javax.inject.Inject;

import org.cognoscenti.stocks.model.StockHistorySummary;
import org.cognoscenti.stocks.service.StockHistorySummaryService;
import org.cognoscenti.stocks.util.HttpUtil;
import org.cognoscenti.stocks.util.JsonUtil;
import org.springframework.scheduling.annotation.Scheduled;

public class StockHistorySummaryServiceSchedule {
	
	@Inject
	private StockHistorySummaryService stockHistorySummaryService;
	
	public StockHistorySummaryServiceSchedule() { }
	
	@Scheduled(cron = "0/10 * 9-11,13-14 ? * MON-FRI", zone = "Asia/Singapore")
	public void captureMarketSnapshot() {
		
		List<StockHistorySummary> stockRecords = JsonUtil.getInstance().readValueFromJsonStringToList(
				HttpUtil.getInstance().getSecuritiesAndIndicesForPublic(), 
				StockHistorySummary.class);
		
		for(StockHistorySummary stockRecord : stockRecords) {
			stockHistorySummaryService.save(stockRecord);
		}
	}
	
}