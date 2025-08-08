package com.hexa.portfolio.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "securities", uniqueConstraints = {
    @UniqueConstraint(columnNames = "symbol"),
    @UniqueConstraint(columnNames = "isin")
})
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String exchange;
    private String symbol;
    private String name;
    private String isin;
    private String sector;
    private String industry;
    private String currency;
    private String country;
	public Long getId() {
		return id;
	}
	
	public Security() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Security(Long id, String exchange, String symbol, String name, String isin, String sector, String industry,
			String currency, String country) {
		super();
		this.id = id;
		this.exchange = exchange;
		this.symbol = symbol;
		this.name = name;
		this.isin = isin;
		this.sector = sector;
		this.industry = industry;
		this.currency = currency;
		this.country = country;
	}

    
}
