package me.ranjit.spring.withtransaction.dao;

import me.ranjit.spring.withtransaction.model.Product;

/**
 * Created by suzh on 7/20/2017.
 */
public interface ProductDao {
    void save(Product product);
}
