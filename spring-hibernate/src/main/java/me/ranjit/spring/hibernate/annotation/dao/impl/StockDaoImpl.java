package me.ranjit.spring.hibernate.annotation.dao.impl;


import me.ranjit.spring.hibernate.annotation.dao.StockDao;
import me.ranjit.spring.hibernate.annotation.model.Stock;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by suzh on 7/20/2017.
 * 注释方式不能直接扩展“HibernateDaoSupport“。因为没有办法从DAO类会话到工厂bean自动装配。
 * 解决方法是创建一个自定义类(CustomHibernateDaoSupport)，
 * 并扩展了“HibernateDaoSupport”和自动装配会话工厂，DAO类扩展了这个类。
 */
@Service("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao {
    @Override
    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    @Override
    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    @Override
    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    @Override
    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find("from Stock where stockCode=?", stockCode);
        return (Stock) list.get(0);
    }
}
