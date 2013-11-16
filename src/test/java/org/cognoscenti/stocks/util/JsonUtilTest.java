package org.cognoscenti.stocks.util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.cognoscenti.stocks.model.CompanyStockInfo;
import org.cognoscenti.stocks.model.HistoricalCompanyStockInfo;
import org.cognoscenti.stocks.model.StockHistorySummary;
import org.cognoscenti.stocks.model.Stocks;
import org.jboss.logging.Logger;
import org.junit.Test;

public class JsonUtilTest {
	
	private final Logger logger = Logger.getLogger(getClass());
	
	@Test
	public void testReadValueFromUrl() {
		List<StockHistorySummary> stockRecords = JsonUtil.getInstance().readValueFromUrlToList(
				"http://www.pse.com.ph/stockMarket/home.html?method=getSecuritiesAndIndicesForPublic&ajax=true", 
				StockHistorySummary.class);
		assertNotNull(stockRecords);
	}
	
	@Test
	public void testReadValueFromJsonString() throws IOException {
		
		Stocks stocks = JsonUtil.getInstance().readValueFromJsonString(
				HttpUtil.getInstance().findSecurityOrCompany("BPI"), 
				Stocks.class);
		assertNotNull(stocks);
		assertNotNull(stocks.getStockRecords());
		assertTrue(stocks.getCount() > 0);
		logger.info(stocks);
		
		List<StockHistorySummary> stockRecords = JsonUtil.getInstance().readValueFromJsonStringToList(
				HttpUtil.getInstance().getSecuritiesAndIndicesForPublic(), 
				StockHistorySummary.class);
		assertNotNull(stockRecords);
		
		for(StockHistorySummary stockRecord : stockRecords) {
			logger.info(stockRecord);
		}
		
		CompanyStockInfo stockHistories = StocksUtil.getInstance().getCompanyInfoByCompanyIdAndSecurityId("234", "101");
		assertNotNull(stockHistories);
		assertNotNull(stockHistories.getStockHistoryRecords());
		assertTrue(stockHistories.getCount() > 0);
		logger.info(stockHistories);
		
		HistoricalCompanyStockInfo historicalCompanyStockInfo  = StocksUtil.getInstance().getCompanyInfoHistoricalData("101");
		assertNotNull(historicalCompanyStockInfo);
		assertNotNull(historicalCompanyStockInfo.getRecords());
		assertTrue(historicalCompanyStockInfo.getCount() > 0);
		logger.info(historicalCompanyStockInfo);
	}
}