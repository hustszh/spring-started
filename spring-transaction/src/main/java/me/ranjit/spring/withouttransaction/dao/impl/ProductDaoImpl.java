package me.ranjit.spring.withouttransaction.dao.impl;

import me.ranjit.spring.withouttransaction.dao.ProductDao;
import me.ranjit.spring.withouttransaction.model.Product;
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
