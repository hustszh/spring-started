package me.ranjit.spring.hibernate.xml.dao;

import me.ranjit.spring.hibernate.xml.model.Stock;

/**
 * Created by suzh on 7/19/2017.
 */
public interface StockDao {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}
