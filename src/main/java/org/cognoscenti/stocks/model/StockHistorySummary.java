package org.cognoscenti.stocks.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Entity
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({ 
	"totalVolume", 
	"indicator", 
	"percChangeClose",
	"lastTradedPrice", 
	"securityAlias", 
	"indicatorImg", 
	"securitySymbol" })
public class StockHistorySummary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("totalVolume")
	private String totalVolume;
	
	@JsonProperty("indicator")
	private String indicator;
	
	@JsonProperty("percChangeClose")
	private String percentChangeClose;
	
	@JsonProperty("lastTradedPrice")
	private String lastTradedPrice;
	
	@JsonProperty("securityAlias")
	private String securityAlias;
	
	@JsonProperty("indicatorImg")
	private String indicatorImg;
	
	@JsonProperty("securitySymbol")
	private String securitySymbol;

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

	@JsonProperty("totalVolume")
	public String getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	public void setTotalVolume(String totalVolume) {
		this.totalVolume = totalVolume;
	}

	@JsonProperty("indicator")
	public String getIndicator() {
		return indicator;
	}

	@JsonProperty("indicator")
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	@JsonProperty("percChangeClose")
	public String getPercentChangeClose() {
		return percentChangeClose;
	}

	@JsonProperty("percChangeClose")
	public void setPercentChangeClose(String percentChangeClose) {
		this.percentChangeClose = percentChangeClose;
	}

	@JsonProperty("lastTradedPrice")
	public String getLastTradedPrice() {
		return lastTradedPrice;
	}

	@JsonProperty("lastTradedPrice")
	public void setLastTradedPrice(String lastTradedPrice) {
		this.lastTradedPrice = lastTradedPrice;
	}

	@JsonProperty("securityAlias")
	public String getSecurityAlias() {
		return securityAlias;
	}

	@JsonProperty("securityAlias")
	public void setSecurityAlias(String securityAlias) {
		this.securityAlias = securityAlias;
	}

	@JsonProperty("indicatorImg")
	public String getIndicatorImg() {
		return indicatorImg;
	}

	@JsonProperty("indicatorImg")
	public void setIndicatorImg(String indicatorImg) {
		this.indicatorImg = indicatorImg;
	}

	@JsonProperty("securitySymbol")
	public String getSecuritySymbol() {
		return securitySymbol;
	}

	@JsonProperty("securitySymbol")
	public void setSecuritySymbol(String securitySymbol) {
		this.securitySymbol = securitySymbol;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StockHistorySummary [totalVolume=" + totalVolume + ", indicator="
				+ indicator + ", percentChangeClose=" + percentChangeClose
				+ ", lastTradedPrice=" + lastTradedPrice + ", securityAlias="
				+ securityAlias + ", indicatorImg=" + indicatorImg
				+ ", securitySymbol=" + securitySymbol + "]";
	}

}