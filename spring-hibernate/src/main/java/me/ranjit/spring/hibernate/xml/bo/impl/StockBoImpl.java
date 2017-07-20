package me.ranjit.spring.hibernate.xml.bo.impl;

import lombok.Data;
import me.ranjit.spring.hibernate.xml.bo.StockBo;
import me.ranjit.spring.hibernate.xml.dao.StockDao;
import me.ranjit.spring.hibernate.xml.model.Stock;

/**
 * Created by suzh on 7/19/2017.
 */
@Data
public class StockBoImpl implements StockBo {

    private StockDao stockDao;

    @Override
    public void save(Stock stock) {
        stockDao.save(stock);
    }

    @Override
    public void update(Stock stock) {
        stockDao.update(stock);
    }

    @Override
    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}
