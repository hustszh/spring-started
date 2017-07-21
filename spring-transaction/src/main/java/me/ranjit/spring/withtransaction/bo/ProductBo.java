package me.ranjit.spring.withtransaction.bo;

import me.ranjit.spring.withtransaction.model.Product;

/**
 * Created by suzh on 7/20/2017.
 */
public interface ProductBo {
    void save(Product product, int qoh);
}
