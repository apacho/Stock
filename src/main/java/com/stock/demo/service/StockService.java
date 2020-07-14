package com.stock.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.demo.entity.Stock;
import com.stock.demo.repository.StockRepository;

@Service
public class StockService {

	private final StockRepository stockRepository;
	private final static Logger logger = LoggerFactory.getLogger(StockService.class);
	
	@Autowired
	public StockService(StockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	public Optional<Stock> getStockById(long id) {
		logger.info("get stock by using Id");
		return stockRepository.findById(id);
	}
	
	public List<Stock> getAllStocks(long id) {
		logger.info("finding All Stocks from table");
		return stockRepository.findAll();
	}

}
