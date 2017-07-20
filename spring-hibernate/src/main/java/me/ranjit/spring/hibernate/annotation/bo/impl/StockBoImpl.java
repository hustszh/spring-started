package me.ranjit.spring.hibernate.annotation.bo.impl;


import me.ranjit.spring.hibernate.annotation.bo.StockBo;
import me.ranjit.spring.hibernate.annotation.dao.StockDao;
import me.ranjit.spring.hibernate.annotation.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by suzh on 7/20/2017.
 */
@Service("stockBo")
public class StockBoImpl implements StockBo {

    @Autowired
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
