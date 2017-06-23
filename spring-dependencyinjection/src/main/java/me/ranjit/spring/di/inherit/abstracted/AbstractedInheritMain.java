package me.ranjit.spring.di.inherit.abstracted;

import me.ranjit.spring.di.inherit.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/21/2017.
 * 如果你要让一个 bean 作为一个基础模板，不允许别人来实例化它，
 * 可以在一个<bean>元素中添加一个“abstract”的属性，值为true。
 * 抽象继承：即在父类中声明class和abstract=true ，子类只需要声明Parent。这种情况下父类对象不可以提取
 */
public class AbstractedInheritMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inherit/abstracted/applicationContextAbstractedInherit.xml");
        Customer customer = (Customer)context.getBean("childCustomer");
        System.out.println(customer);

        // 不能实例化
//        Customer baseCustomer = (Customer)context.getBean("baseCustomer");
//        System.out.println(baseCustomer);
    }
}
