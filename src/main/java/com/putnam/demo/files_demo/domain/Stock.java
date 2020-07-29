package com.putnam.demo.files_demo.domain;

import java.time.Instant;
import java.util.Objects;
import java.util.StringJoiner;

public class Stock {
	//exchangeSymbol,companyName,exchangeMarket,marketCap,tradedAt,industrySector
	private long id;

    private String exchangeSymbol;
	private String companyName;
	private String exchangeMarket;
	private String marketCap;
	private float tradedAt;
	private String industrySector;
	
	public Stock() {
		super();
		this.id = Instant.now().getNano();
	}

	public Stock(String exchangeSymbol, String companyName, String exchangeMarket, String marketCap, String tradedAt,
			String industrySector) {
		this();
		this.exchangeSymbol = exchangeSymbol;
		this.companyName = companyName;
		this.exchangeMarket = exchangeMarket;
		this.marketCap = marketCap;
		this.tradedAt = Float.parseFloat(tradedAt);
		this.industrySector = industrySector;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getExchangeSymbol() {
		return exchangeSymbol;
	}

	public void setExchangeSymbol(String exchangeSymbol) {
		this.exchangeSymbol = exchangeSymbol;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getExchangeMarket() {
		return exchangeMarket;
	}

	public void setExchangeMarket(String exchangeMarket) {
		this.exchangeMarket = exchangeMarket;
	}

	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public float getTradedAt() {
		return tradedAt;
	}

	public void setTradedAt(float tradedAt) {
		this.tradedAt = tradedAt;
	}

	public String getIndustrySector() {
		return industrySector;
	}

	public void setIndustrySector(String industrySector) {
		this.industrySector = industrySector;
	}



	@Override
	public int hashCode() {
		return Objects.hash(companyName, exchangeMarket, exchangeSymbol, industrySector, marketCap, tradedAt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Stock))
			return false;
		Stock other = (Stock) obj;
		return Objects.equals(companyName, other.companyName) && Objects.equals(exchangeMarket, other.exchangeMarket)
				&& Objects.equals(exchangeSymbol, other.exchangeSymbol)
				&& Objects.equals(industrySector, other.industrySector) && Objects.equals(marketCap, other.marketCap)
				&& Float.floatToIntBits(tradedAt) == Float.floatToIntBits(other.tradedAt);
	}


	@Override
	public String toString() {
		return new StringJoiner(", ", Stock.class.getSimpleName() + "[", "]")
				.add("id=" + id)
				.add("exchangeSymbol='" + exchangeSymbol + "'")
				.add("companyName='" + companyName + "'")
				.add("exchangeMarket='" + exchangeMarket + "'")
				.add("marketCap='" + marketCap + "'")
				.add("tradedAt=" + tradedAt)
				.add("industrySector='" + industrySector + "'")
				.toString();
	}
}
