package me.ranjit.spring.di.property.collection.listfactorybean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/20/2017.
 * ListFactoryBean”类为开发者在Spring的bean配置文件中
 * 创建一个具体的列表集合类(ArrayList和LinkedList)。
 */
@Log4j2
public class ListFactoryBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/collection/listfactorybean/applicationContextListFactoryBean.xml");
        Customer customer = (Customer)context.getBean("customer");
        log.info(customer);
    }
}
