package me.ranjit.spring.withouttransaction;

import me.ranjit.spring.withouttransaction.bo.ProductBo;
import me.ranjit.spring.withouttransaction.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/20/2017.
 */
public class WithoutTransactionMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("withouttransaction/spring/BeanLocations.xml");

        Product product = new Product();
        product.setProductCode("ABC");
        product.setProductDesc("This is product ABC");

        ProductBo productBo = (ProductBo)appContext.getBean("productBo");
        productBo.save(product, 100);
    }
}
