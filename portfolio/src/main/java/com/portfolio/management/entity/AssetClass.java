package com.portfolio.management.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "asset_classes")
@Data

public class AssetClass {

    @Id
    private Long id;

    private String className;
    private String subClassName;
    private String description;
    private String risk;
    private String investmentHorizon;
    private String subAssetDescription;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSubClassName() {
		return subClassName;
	}
	public void setSubClassName(String subClassName) {
		this.subClassName = subClassName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public String getInvestmentHorizon() {
		return investmentHorizon;
	}
	public void setInvestmentHorizon(String investmentHorizon) {
		this.investmentHorizon = investmentHorizon;
	}
	public String getSubAssetDescription() {
		return subAssetDescription;
	}
	public void setSubAssetDescription(String subAssetDescription) {
		this.subAssetDescription = subAssetDescription;
	}
    
}
