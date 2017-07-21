package me.ranjit.spring.withtransaction;

import me.ranjit.spring.withtransaction.bo.ProductBo;
import me.ranjit.spring.withtransaction.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/21/2017.
 */
public class WithTransactionMain {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("withtransaction/spring/BeanLocations.xml");

        Product product = new Product();
        product.setProductCode("ABC");
        product.setProductDesc("This is product ABC");

        //使用具有事务功能的代理类
        ProductBo productBo = (ProductBo)appContext.getBean("productBoProxy");
        productBo.save(product, 100);
    }
}
