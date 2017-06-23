package me.ranjit.spring.beanscope.prototype;

import me.ranjit.spring.beanscope.service.prototype.CustomerServicePrototype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 * 原型- 当每次请求时返回一个“新”的bean实例
 */
public class PrototypeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype/applicationContextPrototype.xml");
        CustomerServicePrototype customerServiceA = (CustomerServicePrototype)context.getBean("customerService");
        customerServiceA.setMsg("msgA");
        System.out.println(customerServiceA.getMsg());

        /*
        在原型作用域，必须为每个 getBean()方法中调用返回一个新的实例。
         */
        CustomerServicePrototype customerServiceB = (CustomerServicePrototype)context.getBean("customerService");
        System.out.println(customerServiceB.getMsg());//return null
    }
}
