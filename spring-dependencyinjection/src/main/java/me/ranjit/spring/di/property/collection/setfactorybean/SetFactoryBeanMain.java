package me.ranjit.spring.di.property.collection.setfactorybean;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/20/2017.
 * SetFactoryBean 类为开发者在 Spring bean 配置文件
 * 创建一个具体的Set集合(HashSet 和 TreeSet)。
 */
@Log4j2
public class SetFactoryBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/collection/setfactorybean/applicationContextSetFactoryBean.xml");
        Customer customer = (Customer)context.getBean("customer");
        log.info(customer);
    }
}
