package com.stock.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stock.demo.entity.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {

}
