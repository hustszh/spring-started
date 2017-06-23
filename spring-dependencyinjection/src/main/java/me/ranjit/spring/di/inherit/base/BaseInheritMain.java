package me.ranjit.spring.di.inherit.base;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.di.inherit.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/21/2017.
 * 普通继承， 即仅在父类中声明class， 子类则只需要声明parent即可自动继承类型
 */
@Log4j2
public class BaseInheritMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inherit/base/applicationContextBaseInherit.xml");
        Customer customer = (Customer)context.getBean("childCustomer");
        log.info(customer);

        Customer baseCustomer = (Customer)context.getBean("baseCustomer");
        log.info(baseCustomer);
    }
}
