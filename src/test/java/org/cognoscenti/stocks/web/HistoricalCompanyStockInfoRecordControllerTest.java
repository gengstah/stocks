package org.cognoscenti.stocks.web;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class HistoricalCompanyStockInfoRecordControllerTest {
	
	private final String data = "[[1380643200000, 101], [1380729600000, 100], [1380816000000, 100], [1381075200000, 100], [1381161600000, 100], [1381248000000, 100], [1381334400000, 100], [1381420800000, 101], [1381680000000, 100], [1381852800000, 101], [1381939200000, 103], [1382025600000, 104], [1382284800000, 104], [1382371200000, 105], [1382457600000, 105], [1382544000000, 105], [1382630400000, 100], [1382976000000, 100], [1383062400000, 103], [1383148800000, 100], [1383494400000, 99], [1383580800000, 99], [1383667200000, 100], [1383753600000, 96], [1383840000000, 93], [1384099200000, 90], [1384185600000, 90], [1384272000000, 91], [1384358400000, 91], [1384444800000, 91]]";
	
	@Test
	public void testFetchData() throws ParseException {
		HistoricalCompanyStockInfoRecordController controller = new HistoricalCompanyStockInfoRecordController();
		
		assertEquals(data, controller.fetchBasicLineData("101"));
	}
}