package org.cognoscenti.stocks.dao;

import java.util.Date;
import java.util.List;

import org.cognoscenti.stocks.model.StockHistorySummary;

public interface StockHistorySummaryDataAccessObject extends DataAccessObject<StockHistorySummary> {
	
	List<StockHistorySummary> findStockHistorySummaryByDate(Date date);
	
	List<StockHistorySummary> findStockHistorySummaryBySymbolAndDate(String symbol, Date date);
	
}