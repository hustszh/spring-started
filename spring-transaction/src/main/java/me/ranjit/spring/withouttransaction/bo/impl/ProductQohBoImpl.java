package me.ranjit.spring.withouttransaction.bo.impl;

import lombok.Data;
import me.ranjit.spring.withouttransaction.bo.ProductQohBo;
import me.ranjit.spring.withouttransaction.dao.ProductQohDao;
import me.ranjit.spring.withouttransaction.model.ProductQoh;

/**
 * Created by suzh on 7/20/2017.
 */
@Data
public class ProductQohBoImpl implements ProductQohBo {

    ProductQohDao productQohDao;

    @Override
    public void save(ProductQoh productQoh) {
        productQohDao.save(productQoh);
    }
}
