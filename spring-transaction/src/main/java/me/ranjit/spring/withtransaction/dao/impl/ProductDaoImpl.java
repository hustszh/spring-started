package me.ranjit.spring.withtransaction.dao.impl;

import me.ranjit.spring.withtransaction.dao.ProductDao;
import me.ranjit.spring.withtransaction.model.Product;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by suzh on 7/20/2017.
 */
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {
    @Override
    public void save(Product product) {
        getHibernateTemplate().save(product);
    }
}
