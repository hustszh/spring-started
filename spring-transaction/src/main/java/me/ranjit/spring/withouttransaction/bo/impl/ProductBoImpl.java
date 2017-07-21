package me.ranjit.spring.withouttransaction.bo.impl;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.withouttransaction.bo.ProductBo;
import me.ranjit.spring.withouttransaction.bo.ProductQohBo;
import me.ranjit.spring.withouttransaction.dao.ProductDao;
import me.ranjit.spring.withouttransaction.model.Product;
import me.ranjit.spring.withouttransaction.model.ProductQoh;

/**
 * Created by suzh on 7/20/2017.
 */
@Data
@Log4j2
public class ProductBoImpl implements ProductBo {

    ProductDao productDao;
    ProductQohBo productQohBo;

    /*
    this method need to be transactional.
    save() 不具有事务功能，
    如果由productQohBo.save()异常抛出，只插入一条记录到“product”表，没有记录将被插入到“productQoh'表。
    这是一个严重的问题，在数据库中打破数据一致性。
     */
    @Override
    public void save(Product product, int qoh) {
        productDao.save(product);
        log.info("Product Inserted");

        ProductQoh productQoh = new ProductQoh();
        productQoh.setProductId(product.getProductId()+2);//Invalid ProductId
        productQoh.setQty(qoh);

        productQohBo.save(productQoh);
        log.info("ProductQoh Inserted");
    }
}
