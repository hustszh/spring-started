package me.ranjit.spring.withouttransaction.bo;

import me.ranjit.spring.withouttransaction.model.Product;

/**
 * Created by suzh on 7/20/2017.
 */
public interface ProductBo {
    void save(Product product, int qoh);
}
