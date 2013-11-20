package org.cognoscenti.stocks.service;

import java.util.Date;
import java.util.List;

import org.cognoscenti.stocks.model.StockHistorySummary;

public interface StockHistorySummaryService extends StockService<StockHistorySummary> {
	
	List<StockHistorySummary> findStockHistorySummaryByDate(Date date);
	
	List<StockHistorySummary> findStockHistorySummaryBySymbolAndDate(String symbol, Date date);
	
}