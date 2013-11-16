package org.cognoscenti.stocks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.cognoscenti.stocks.util.CustomJsonDateDeserializer;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
	"headerSqLow",
	"headerFiftyTwoWeekHigh",
	"headerChangeClose",
	"headerChangeClosePercChangeClose",
	"lastTradedDate",
	"headerTotalValue",
	"headerLastTradePrice",
	"headerSqHigh",
	"headerPercChangeClose",
	"headerFiftyTwoWeekLow",
	"headerSqPrevious",
	"securitySymbol",
	"headerCurrentPe",
	"headerSqOpen",
	"headerAvgPrice",
	"headerTotalVolume"
})
public class CompanyStockInfoRecord {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("headerSqLow")
	private String headerSqLow;
	
	@JsonProperty("headerFiftyTwoWeekHigh")
	private String headerFiftyTwoWeekHigh;
	
	@JsonProperty("headerChangeClose")
	private String headerChangeClose;
	
	@JsonProperty("headerChangeClosePercChangeClose")
	private String headerChangeClosePercChangeClose;
	
	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	private Date lastTradedDate;
	
	@JsonProperty("headerTotalValue")
	private String headerTotalValue;
	
	@JsonProperty("headerLastTradePrice")
	private String headerLastTradePrice;
	
	@JsonProperty("headerSqHigh")
	private String headerSqHigh;
	
	@JsonProperty("headerPercChangeClose")
	private String headerPercChangeClose;
	
	@JsonProperty("headerFiftyTwoWeekLow")
	private String headerFiftyTwoWeekLow;
	
	@JsonProperty("headerSqPrevious")
	private String headerSqPrevious;
	
	@JsonProperty("securitySymbol")
	private String securitySymbol;
	
	@JsonProperty("headerCurrentPe")
	private String headerCurrentPe;
	
	@JsonProperty("headerSqOpen")
	private String headerSqOpen;
	
	@JsonProperty("headerAvgPrice")
	private String headerAvgPrice;
	
	@JsonProperty("headerTotalVolume")
	private String headerTotalVolume;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("headerSqLow")
	public String getHeaderSqLow() {
		return headerSqLow;
	}

	@JsonProperty("headerSqLow")
	public void setHeaderSqLow(String headerSqLow) {
		this.headerSqLow = headerSqLow;
	}

	@JsonProperty("headerFiftyTwoWeekHigh")
	public String getHeaderFiftyTwoWeekHigh() {
		return headerFiftyTwoWeekHigh;
	}

	@JsonProperty("headerFiftyTwoWeekHigh")
	public void setHeaderFiftyTwoWeekHigh(String headerFiftyTwoWeekHigh) {
		this.headerFiftyTwoWeekHigh = headerFiftyTwoWeekHigh;
	}

	@JsonProperty("headerChangeClose")
	public String getHeaderChangeClose() {
		return headerChangeClose;
	}

	@JsonProperty("headerChangeClose")
	public void setHeaderChangeClose(String headerChangeClose) {
		this.headerChangeClose = headerChangeClose;
	}

	@JsonProperty("headerChangeClosePercChangeClose")
	public String getHeaderChangeClosePercChangeClose() {
		return headerChangeClosePercChangeClose;
	}

	@JsonProperty("headerChangeClosePercChangeClose")
	public void setHeaderChangeClosePercChangeClose(
			String headerChangeClosePercChangeClose) {
		this.headerChangeClosePercChangeClose = headerChangeClosePercChangeClose;
	}

	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public Date getLastTradedDate() {
		return lastTradedDate;
	}

	@JsonProperty("lastTradedDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setLastTradedDate(Date lastTradedDate) {
		this.lastTradedDate = lastTradedDate;
	}

	@JsonProperty("headerTotalValue")
	public String getHeaderTotalValue() {
		return headerTotalValue;
	}

	@JsonProperty("headerTotalValue")
	public void setHeaderTotalValue(String headerTotalValue) {
		this.headerTotalValue = headerTotalValue;
	}

	@JsonProperty("headerLastTradePrice")
	public String getHeaderLastTradePrice() {
		return headerLastTradePrice;
	}

	@JsonProperty("headerLastTradePrice")
	public void setHeaderLastTradePrice(String headerLastTradePrice) {
		this.headerLastTradePrice = headerLastTradePrice;
	}

	@JsonProperty("headerSqHigh")
	public String getHeaderSqHigh() {
		return headerSqHigh;
	}

	@JsonProperty("headerSqHigh")
	public void setHeaderSqHigh(String headerSqHigh) {
		this.headerSqHigh = headerSqHigh;
	}

	@JsonProperty("headerPercChangeClose")
	public String getHeaderPercChangeClose() {
		return headerPercChangeClose;
	}

	@JsonProperty("headerPercChangeClose")
	public void setHeaderPercChangeClose(String headerPercChangeClose) {
		this.headerPercChangeClose = headerPercChangeClose;
	}

	@JsonProperty("headerFiftyTwoWeekLow")
	public String getHeaderFiftyTwoWeekLow() {
		return headerFiftyTwoWeekLow;
	}

	@JsonProperty("headerFiftyTwoWeekLow")
	public void setHeaderFiftyTwoWeekLow(String headerFiftyTwoWeekLow) {
		this.headerFiftyTwoWeekLow = headerFiftyTwoWeekLow;
	}

	@JsonProperty("headerSqPrevious")
	public String getHeaderSqPrevious() {
		return headerSqPrevious;
	}

	@JsonProperty("headerSqPrevious")
	public void setHeaderSqPrevious(String headerSqPrevious) {
		this.headerSqPrevious = headerSqPrevious;
	}

	@JsonProperty("securitySymbol")
	public String getSecuritySymbol() {
		return securitySymbol;
	}

	@JsonProperty("securitySymbol")
	public void setSecuritySymbol(String securitySymbol) {
		this.securitySymbol = securitySymbol;
	}

	@JsonProperty("headerCurrentPe")
	public String getHeaderCurrentPe() {
		return headerCurrentPe;
	}

	@JsonProperty("headerCurrentPe")
	public void setHeaderCurrentPe(String headerCurrentPe) {
		this.headerCurrentPe = headerCurrentPe;
	}

	@JsonProperty("headerSqOpen")
	public String getHeaderSqOpen() {
		return headerSqOpen;
	}

	@JsonProperty("headerSqOpen")
	public void setHeaderSqOpen(String headerSqOpen) {
		this.headerSqOpen = headerSqOpen;
	}

	@JsonProperty("headerAvgPrice")
	public String getHeaderAvgPrice() {
		return headerAvgPrice;
	}

	@JsonProperty("headerAvgPrice")
	public void setHeaderAvgPrice(String headerAvgPrice) {
		this.headerAvgPrice = headerAvgPrice;
	}

	@JsonProperty("headerTotalVolume")
	public String getHeaderTotalVolume() {
		return headerTotalVolume;
	}

	@JsonProperty("headerTotalVolume")
	public void setHeaderTotalVolume(String headerTotalVolume) {
		this.headerTotalVolume = headerTotalVolume;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockHistoryRecord [headerSqLow=" + headerSqLow
				+ ", headerFiftyTwoWeekHigh=" + headerFiftyTwoWeekHigh
				+ ", headerChangeClose=" + headerChangeClose
				+ ", headerChangeClosePercChangeClose="
				+ headerChangeClosePercChangeClose + ", lastTradedDate="
				+ lastTradedDate + ", headerTotalValue=" + headerTotalValue
				+ ", headerLastTradePrice=" + headerLastTradePrice
				+ ", headerSqHigh=" + headerSqHigh + ", headerPercChangeClose="
				+ headerPercChangeClose + ", headerFiftyTwoWeekLow="
				+ headerFiftyTwoWeekLow + ", headerSqPrevious="
				+ headerSqPrevious + ", securitySymbol=" + securitySymbol
				+ ", headerCurrentPe=" + headerCurrentPe + ", headerSqOpen="
				+ headerSqOpen + ", headerAvgPrice=" + headerAvgPrice
				+ ", headerTotalVolume=" + headerTotalVolume + "]";
	}

}