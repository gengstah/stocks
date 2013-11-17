package org.cognoscenti.stocks.util;

import java.util.Collections;
import java.util.List;

import org.cognoscenti.stocks.model.CompanyStockInfo;
import org.cognoscenti.stocks.model.HistoricalCompanyStockInfo;
import org.cognoscenti.stocks.model.HistoricalCompanyStockInfoRecord;
import org.cognoscenti.stocks.model.StockHistorySummary;
import org.cognoscenti.stocks.model.Stocks;

public class StocksUtil {
	
	private static final StocksUtil INSTANCE = new StocksUtil();
	
	private static final HttpUtil HTTP_UTIL = HttpUtil.getInstance();
	
	private static final JsonUtil JSON_UTIL = JsonUtil.getInstance();
	
	private StocksUtil() { }
	
	public static StocksUtil getInstance() { return INSTANCE; }
	
	public List<StockHistorySummary> getSecuritiesAndIndicesForPublic() {
		return JSON_UTIL.readValueFromJsonStringToList(
				HTTP_UTIL.getSecuritiesAndIndicesForPublic(), 
				StockHistorySummary.class);
	}
	
	public Stocks findSecurityOrCompany(String symbol) {
		return JSON_UTIL.readValueFromJsonString(
				HTTP_UTIL.findSecurityOrCompany(symbol), 
				Stocks.class);
	}

	public CompanyStockInfo getCompanyInfoByCompanyIdAndSecurityId(String companyId, String securityId) {
		return JSON_UTIL.readValueFromJsonString(
				HTTP_UTIL.getCompanyInfoByCompanyIdAndSecurityId(companyId, securityId), 
				CompanyStockInfo.class);
	}
	
	public HistoricalCompanyStockInfo getCompanyInfoHistoricalData(String securityId) {
		return JSON_UTIL.readValueFromJsonString(
				HTTP_UTIL.getCompanyInfoHistoricalData(securityId), 
				HistoricalCompanyStockInfo.class);
	}
	
	public String createBasicLineData(String securityId) {
		
		if("null".equals(securityId)) return "[]";
		
		HistoricalCompanyStockInfo historicalStockInfo = getCompanyInfoHistoricalData(securityId);
		List<HistoricalCompanyStockInfoRecord> records = historicalStockInfo.getRecords();
		Collections.reverse(records);
		
		StringBuilder sb = new StringBuilder("[");
		for(HistoricalCompanyStockInfoRecord record : records) {
			sb.append("[").append(record.getTradingDate().getTime())
				.append(", ").append(record.getLastTradePrice()).append("], ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		
		return sb.toString();
	}
	
	public String createCandleStickAndVolumeData(String securityId) {
		
		if("null".equals(securityId)) return "[]";
		
		HistoricalCompanyStockInfo historicalStockInfo = getCompanyInfoHistoricalData(securityId);
		List<HistoricalCompanyStockInfoRecord> records = historicalStockInfo.getRecords();
		Collections.reverse(records);
		
		StringBuilder sb = new StringBuilder("[");
		for(HistoricalCompanyStockInfoRecord record : records) {
			sb.append("[").append(record.getTradingDate().getTime())
				.append(", ").append(record.getSqOpen())
				.append(", ").append(record.getSqHigh())
				.append(", ").append(record.getSqLow())
				.append(", ").append(record.getSqClose())
				.append(", ").append(record.getTotalVolume())
				.append("], ");
		}
		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		
		return sb.toString();
	}
	
	public String createRealTimeData(String symbol) {
		
		if("null".equals(symbol)) return "0";
		
		List<StockHistorySummary> records =  getSecuritiesAndIndicesForPublic();
		
		for(StockHistorySummary record : records) {
			if(record.getSecuritySymbol().equalsIgnoreCase(symbol)) return record.getLastTradedPrice();
		}
		
		return "0";
	}
	
}