package me.ranjit.spring.hibernate.annotation.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by suzh on 7/20/2017.
 */
public class CustomHibernateDaoSupport extends HibernateDaoSupport{
    @Autowired
    public void anyMethodName(SessionFactory sessionFactory)
    {
        setSessionFactory(sessionFactory);
    }
}
