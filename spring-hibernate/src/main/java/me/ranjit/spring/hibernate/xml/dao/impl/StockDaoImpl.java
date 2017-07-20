package me.ranjit.spring.hibernate.xml.dao.impl;

import me.ranjit.spring.hibernate.xml.dao.StockDao;
import me.ranjit.spring.hibernate.xml.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * Created by suzh on 7/19/2017.
 * DAO实现类扩展了 Spring 的“HibernateDaoSupport”，以使Spring框架支持Hibernate。
 * 现在，你可以通过getHibernateTemplate()执行 Hibernate 功能。
 */
public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

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
