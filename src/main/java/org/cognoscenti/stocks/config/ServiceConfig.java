package org.cognoscenti.stocks.config;

import org.cognoscenti.stocks.service.StockHistorySummaryService;
import org.cognoscenti.stocks.service.impl.StockHistorySummaryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
	
	@Bean
	public StockHistorySummaryService stockHistorySummaryService() {
		return new StockHistorySummaryServiceImpl();
	}
}