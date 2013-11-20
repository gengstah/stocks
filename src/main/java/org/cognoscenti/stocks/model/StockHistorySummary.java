package org.cognoscenti.stocks.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonDeserialize;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.cognoscenti.stocks.util.CustomJsonDoubleDeserializer;
import org.cognoscenti.stocks.util.CustomJsonLongDeserializer;

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
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	private Long totalVolume;
	
	@JsonProperty("indicator")
	private String indicator;
	
	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double percentChangeClose;
	
	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	private Double lastTradedPrice;
	
	@JsonProperty("securityAlias")
	private String securityAlias;
	
	@JsonProperty("indicatorImg")
	private String indicatorImg;
	
	@JsonProperty("securitySymbol")
	private String securitySymbol;
	
	private Date dateCreated;
	
	public StockHistorySummary() { }
	
	@PrePersist
	public void prePersist() {
		dateCreated = new Date();
	}
	
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
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	public Long getTotalVolume() {
		return totalVolume;
	}

	@JsonProperty("totalVolume")
	@JsonDeserialize(using = CustomJsonLongDeserializer.class)
	public void setTotalVolume(Long totalVolume) {
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
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getPercentChangeClose() {
		return percentChangeClose;
	}

	@JsonProperty("percChangeClose")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setPercentChangeClose(Double percentChangeClose) {
		this.percentChangeClose = percentChangeClose;
	}

	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public Double getLastTradedPrice() {
		return lastTradedPrice;
	}

	@JsonProperty("lastTradedPrice")
	@JsonDeserialize(using = CustomJsonDoubleDeserializer.class)
	public void setLastTradedPrice(Double lastTradedPrice) {
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

	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
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