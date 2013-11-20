package org.cognoscenti.stocks.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.cognoscenti.stocks.dao.DataAccessObject;
import org.cognoscenti.stocks.dao.StockHistorySummaryDataAccessObject;
import org.cognoscenti.stocks.model.StockHistorySummary;
import org.cognoscenti.stocks.service.AbstractStockService;
import org.cognoscenti.stocks.service.StockHistorySummaryService;

public class StockHistorySummaryServiceImpl
	extends AbstractStockService<StockHistorySummary> 
	implements StockHistorySummaryService {
	
	@Inject
	private StockHistorySummaryDataAccessObject stockHistorySummaryDataAccessObject;
	
	@Override
	public List<StockHistorySummary> findStockHistorySummaryByDate(Date date) {
		return stockHistorySummaryDataAccessObject.findStockHistorySummaryByDate(date);
	}

	@Override
	public List<StockHistorySummary> findStockHistorySummaryBySymbolAndDate(String symbol, Date date) {
		return stockHistorySummaryDataAccessObject.findStockHistorySummaryBySymbolAndDate(symbol, date);
	}

	@Override
	public DataAccessObject<StockHistorySummary> getDataAccessObject() {
		return stockHistorySummaryDataAccessObject;
	}

}