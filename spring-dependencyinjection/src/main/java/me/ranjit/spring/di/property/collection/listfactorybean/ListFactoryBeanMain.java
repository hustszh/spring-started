package me.ranjit.spring.di.property.collection.listfactorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/20/2017.
 * ListFactoryBean”类为开发者在Spring的bean配置文件中
 * 创建一个具体的列表集合类(ArrayList和LinkedList)。
 */
public class ListFactoryBeanMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/collection/listfactorybean/applicationContextListFactoryBean.xml");
        Customer customer = (Customer)context.getBean("customer");
        System.out.println(customer);
    }
}
