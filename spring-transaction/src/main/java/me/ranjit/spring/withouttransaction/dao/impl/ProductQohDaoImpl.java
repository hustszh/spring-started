package me.ranjit.spring.withouttransaction.dao.impl;

import me.ranjit.spring.withouttransaction.dao.ProductQohDao;
import me.ranjit.spring.withouttransaction.model.ProductQoh;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by suzh on 7/20/2017.
 */
public class ProductQohDaoImpl extends HibernateDaoSupport implements ProductQohDao {
    @Override
    public void save(ProductQoh productQoh) {
        getHibernateTemplate().save(productQoh);
    }
}
