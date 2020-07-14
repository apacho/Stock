package com.stock.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Stock")
//@Getter
public class Stock {
	@Id
	@NotNull(message = "ID is required")
	@Column(name = "stock_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long stockId;
	@Column(name = "stock_code")
	@NotEmpty(message = "stock code is required")
	private String stockCode;
	@Column(name = "stock_desc")
	@NotNull(message = "stock desc is required")
	private String stockDesc;
	@Column(name = "quantity")
	@NotNull(message = "quantity is required")
	private Integer quantity;
	@Column(name = "trend")
	@NotNull(message = "trend column is required")
	private String trend;
	
	@Column(name = "price_differ_from_preday")
	@NotNull(message = "price differ column is required")
	private Double priceDiffPreDay;
	
	@Column(name = "stock_price")
	@NotNull(message = "stock price is required")
	private Double stockPrice;
	
	@Column(name = "stock_date")
	@NotNull(message = "date is required")
	private Timestamp stockDate;
	
	public Long getStockId() {
		return stockId;
	}

	public void setStockId(Long stockId) {
		this.stockId = stockId;
	}

	public String getStockCode() {
		return stockCode;
	}

	public void setStockCode(String stockCode) {
		this.stockCode = stockCode;
	}

	public String getStockDesc() {
		return stockDesc;
	}

	public void setStockDesc(String stockDesc) {
		this.stockDesc = stockDesc;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getTrend() {
		return trend;
	}

	public void setTrend(String trend) {
		this.trend = trend;
	}

}
