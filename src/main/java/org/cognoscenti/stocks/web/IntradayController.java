package org.cognoscenti.stocks.web;

import org.cognoscenti.stocks.model.StockRecord;
import org.cognoscenti.stocks.model.Stocks;
import org.cognoscenti.stocks.util.StocksUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/intraday")
public class IntradayController {
	
	@RequestMapping(value = { "/home", "/" }, method = RequestMethod.GET)
	public String realtime(@RequestParam(value="symbol", required=false, defaultValue="") String symbol, Model model) {
		
		Stocks stocks = StocksUtil.getInstance().findSecurityOrCompany(symbol);
		
		if(stocks.getStockRecords().size() == 0) {
			model.addAttribute("symbol", "");
			model.addAttribute("stockRecord", new StockRecord());
			return "intraday";
		}
		
		StockRecord stockRecord = stocks.getStockRecords().get(0);
		model.addAttribute("stockRecord", stockRecord);
		model.addAttribute("symbol", symbol);
		
		return "intraday";
	}
	
}