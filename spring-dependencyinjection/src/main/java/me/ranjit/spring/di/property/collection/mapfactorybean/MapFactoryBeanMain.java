package me.ranjit.spring.di.property.collection.mapfactorybean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/20/2017.
 * MapFactoryBean类为开发者提供了一种在Spring的bean配置文件中
 * 创建一个具体的Map集合类(HashMap和TreeMap)。
 */
@Log4j2
public class MapFactoryBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/collection/mapfactorybean/applicationContextMapFactoryBean.xml");
        Customer customer = (Customer)context.getBean("customer");
        log.info(customer);
    }
}
