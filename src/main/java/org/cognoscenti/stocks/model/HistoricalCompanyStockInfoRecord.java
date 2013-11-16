package org.cognoscenti.stocks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.cognoscenti.stocks.util.CustomJsonDateDeserializer;

@Entity
@JsonPropertyOrder({
	"sqLow",
	"sqOpen",
	"sqHigh",
	"percChangeClose",
	"sqClose",
	"secQid",
	"changeClose",
	"totalValue",
	"totalVolume",
	"lastTradePrice",
	"avgPrice",
	"tradingDate",
	"sqPrevious"
})
public class HistoricalCompanyStockInfoRecord {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("sqLow")
	private Double sqLow;
	
	@JsonProperty("sqOpen")
	private Double sqOpen;
	
	@JsonProperty("sqHigh")
	private Double sqHigh;
	
	@JsonProperty("percChangeClose")
	private Double percChangeClose;
	
	@JsonProperty("sqClose")
	private Double sqClose;
	
	@JsonProperty("secQid")
	private String secQid;
	
	@JsonProperty("changeClose")
	private Double changeClose;
	
	@JsonProperty("totalValue")
	private Double totalValue;
	
	@JsonProperty("totalVolume")
	private Long totalVolume;
	
	@JsonProperty("lastTradePrice")
	private Double lastTradePrice;
	
	@JsonProperty("avgPrice")
	private Double avgPrice;
	
	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	private Date tradingDate;
	
	@JsonProperty("sqPrevious")
	private Double sqPrevious;

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

	@JsonProperty("sqLow")
	public Double getSqLow() {
		return sqLow;
	}

	@JsonProperty("sqLow")
	public void setSqLow(Double sqLow) {
		this.sqLow = sqLow;
	}

	@JsonProperty("sqOpen")
	public Double getSqOpen() {
		return sqOpen;
	}

	@JsonProperty("sqOpen")
	public void setSqOpen(Double sqOpen) {
		this.sqOpen = sqOpen;
	}

	@JsonProperty("sqHigh")
	public Double getSqHigh() {
		return sqHigh;
	}

	@JsonProperty("sqHigh")
	public void setSqHigh(Double sqHigh) {
		this.sqHigh = sqHigh;
	}

	@JsonProperty("percChangeClose")
	public Double getPercChangeClose() {
		return percChangeClose;
	}

	@JsonProperty("percChangeClose")
	public void setPercChangeClose(Double percChangeClose) {
		this.percChangeClose = percChangeClose;
	}

	@JsonProperty("sqClose")
	public Double getSqClose() {
		return sqClose;
	}

	@JsonProperty("sqClose")
	public void setSqClose(Double sqClose) {
		this.sqClose = sqClose;
	}

	@JsonProperty("secQid")
	public String getSecQid() {
		return secQid;
	}

	@JsonProperty("secQid")
	public void setSecQid(String secQid) {
		this.secQid = secQid;
	}

	@JsonProperty("changeClose")
	public Double getChangeClose() {
		return changeClose;
	}

	@JsonProperty("changeClose")
	public void setChangeClose(Double changeClose) {
		this.changeClose = changeClose;
	}

	@JsonProperty("totalValue")
	public Double getTotalValue() {
		return totalValue;
	}

	@JsonProperty("totalValue")
	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	@JsonProperty("totalVolume")
	public Long getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	public void setTotalVolume(Long totalVolume) {
		this.totalVolume = totalVolume;
	}

	@JsonProperty("lastTradePrice")
	public Double getLastTradePrice() {
		return lastTradePrice;
	}

	@JsonProperty("lastTradePrice")
	public void setLastTradePrice(Double lastTradePrice) {
		this.lastTradePrice = lastTradePrice;
	}

	@JsonProperty("avgPrice")
	public Double getAvgPrice() {
		return avgPrice;
	}

	@JsonProperty("avgPrice")
	public void setAvgPrice(Double avgPrice) {
		this.avgPrice = avgPrice;
	}

	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public Date getTradingDate() {
		return tradingDate;
	}

	@JsonProperty("tradingDate")
	@JsonDeserialize(using = CustomJsonDateDeserializer.class)
	public void setTradingDate(Date tradingDate) {
		this.tradingDate = tradingDate;
	}

	@JsonProperty("sqPrevious")
	public Double getSqPrevious() {
		return sqPrevious;
	}

	@JsonProperty("sqPrevious")
	public void setSqPrevious(Double sqPrevious) {
		this.sqPrevious = sqPrevious;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "HistoricalCompanyStockInfoRecord [sqLow=" + sqLow + ", sqOpen="
				+ sqOpen + ", sqHigh=" + sqHigh + ", percChangeClose="
				+ percChangeClose + ", sqClose=" + sqClose + ", secQid="
				+ secQid + ", changeClose=" + changeClose + ", totalValue="
				+ totalValue + ", totalVolume=" + totalVolume
				+ ", lastTradePrice=" + lastTradePrice + ", avgPrice="
				+ avgPrice + ", tradingDate=" + tradingDate + ", sqPrevious="
				+ sqPrevious + "]";
	}

}