package me.ranjit.spring.di.inherit.pure;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.di.inherit.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/21/2017.
 * 纯粹的模板：父bean没有定义class属性，子bean必须定义class属性
 * 纯模板继承，即父类不声明class，只作为模板出现。这种情况下任何子类都可以继承该模板，引用父类的值，但需要声明自身的class
 */
@Log4j2
public class PureInheritMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inherit/pure/applicationContextPureInherit.xml");
        Customer customer = (Customer)context.getBean("childCustomer");
        log.info(customer);

        // 不能实例化
//        Customer baseCustomer = (Customer)context.getBean("baseCustomer");
//        log.info(baseCustomer);
    }
}
