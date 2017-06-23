package me.ranjit.spring.beanscope.singleton;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.beanscope.service.prototype.CustomerServicePrototype;
import me.ranjit.spring.beanscope.service.singleton.CustomerServiceSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 * 单例 - 每个Spring IoC 容器返回“同”一个bean实例，默认作用域是单例。
 */
@Log4j2
public class SingletonMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("singleton/applicationContextSingleton.xml");
        CustomerServiceSingleton customerServiceA = (CustomerServiceSingleton)context.getBean("customerService");
        customerServiceA.setMsg("msgA");
        log.info(customerServiceA.getMsg());

        /*
        在单例中，每个Spring IoC容器只有一个实例，无论多少次调用 getBean()方法获取它，它总是返回同一个实例。
         */
        CustomerServiceSingleton customerServiceB = (CustomerServiceSingleton)context.getBean("customerService");
        log.info(customerServiceB.getMsg());
    }
}
