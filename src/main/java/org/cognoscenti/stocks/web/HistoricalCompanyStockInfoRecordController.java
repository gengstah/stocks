package org.cognoscenti.stocks.web;

import java.util.Collections;
import java.util.List;

import org.cognoscenti.stocks.model.HistoricalCompanyStockInfo;
import org.cognoscenti.stocks.model.HistoricalCompanyStockInfoRecord;
import org.cognoscenti.stocks.model.StockRecord;
import org.cognoscenti.stocks.model.Stocks;
import org.cognoscenti.stocks.util.StocksUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/historical")
public class HistoricalCompanyStockInfoRecordController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String historical(@RequestParam(value="symbol", required=false, defaultValue="") String symbol, Model model) {
		
		Stocks stocks = StocksUtil.getInstance().findSecurityOrCompany(symbol);
		if(stocks.getStockRecords().size() == 0) { 
			model.addAttribute("symbol", "");
			model.addAttribute("stockRecord", new StockRecord());
			return "historical";
		}
		StockRecord stockRecord = stocks.getStockRecords().size() > 0 ? stocks.getStockRecords().get(0) : new StockRecord();
		
		model.addAttribute("stockRecord", stockRecord);
		model.addAttribute("symbol", symbol);
		return "historical";
	}

	@RequestMapping(value = "/basicLineData", method = RequestMethod.GET)
	public @ResponseBody String fetchBasicLineData(@RequestParam(value="securityId", required=false, defaultValue="101") String securityId) {		
		return StocksUtil.getInstance().createBasicLineData(securityId);
	}
	
	@RequestMapping(value = "/candleStickAndVolumeData", method = RequestMethod.GET)
	public @ResponseBody String fetchCandleStickAndVolumeData(@RequestParam(value="securityId", required=false, defaultValue="101") String securityId) {		
		return StocksUtil.getInstance().createCandleStickAndVolumeData(securityId);
	}
	
}