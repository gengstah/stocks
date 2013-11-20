package org.cognoscenti.stocks.dao.impl;

import java.util.Date;
import java.util.List;

import org.cognoscenti.stocks.dao.AbstractDataAccessObject;
import org.cognoscenti.stocks.dao.StockHistorySummaryDataAccessObject;
import org.cognoscenti.stocks.model.StockHistorySummary;

public class StockHistorySummaryDataAccessObjectImpl 
	extends AbstractDataAccessObject<StockHistorySummary> 
	implements StockHistorySummaryDataAccessObject {

	@Override
	public List<StockHistorySummary> findStockHistorySummaryByDate(Date date) {
		
		String jpaQl = "SELECT c FROM StockHistorySummary c WHERE c.dateCreated = :date";
		
		return entityManager.createQuery(jpaQl, StockHistorySummary.class)
				.setParameter("date", date).getResultList();
	}

	@Override
	public List<StockHistorySummary> findStockHistorySummaryBySymbolAndDate(String symbol, Date date) {
		
		String jpaQl = "SELECT c FROM StockHistorySummary c WHERE c.dateCreated = :date AND c.securitySymbol = :symbol";
		
		return entityManager.createQuery(jpaQl, StockHistorySummary.class)
				.setParameter("date", date).setParameter("symbol", symbol).getResultList();
	}
	
}