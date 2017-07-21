package me.ranjit.spring.withouttransaction.dao;

import me.ranjit.spring.withouttransaction.model.Product;

/**
 * Created by suzh on 7/20/2017.
 */
public interface ProductDao {
    void save(Product product);
}
