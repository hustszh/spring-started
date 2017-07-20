package me.ranjit.spring.hibernate.xml;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.hibernate.xml.bo.StockBo;
import me.ranjit.spring.hibernate.xml.model.Stock;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/19/2017.
 */
@Log4j2
public class XmlMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/spring/BeanLocations.xml");
        StockBo stockBo = (StockBo)context.getBean("stockBo");
        /** insert **/
        Stock stock = new Stock();
        stock.setStockCode("7668");
        stock.setStockName("HAIO");
        stockBo.save(stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("7668");
        log.info(stock2);

        /** update **/
        stock2.setStockName("HAIO-1");
        stockBo.update(stock2);

        /** delete **/
        stockBo.delete(stock2);

        log.info("Done");
    }
}
