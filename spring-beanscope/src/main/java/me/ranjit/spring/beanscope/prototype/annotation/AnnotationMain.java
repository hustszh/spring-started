package me.ranjit.spring.beanscope.prototype.annotation;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.beanscope.service.prototype.CustomerServicePrototype;
import me.ranjit.spring.beanscope.service.prototype.annotation.CustomerServiceAnnotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 * 原型- 当每次请求时返回一个“新”的bean实例
 */
@Log4j2
public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("prototype/annotation/applicationContextAnnotation.xml");
        CustomerServiceAnnotation customerServiceA = (CustomerServiceAnnotation)context.getBean("customerServiceAnnotation");
        customerServiceA.setMsg("msgA");
        log.info(customerServiceA.getMsg());

        /*
        在原型作用域，必须为每个 getBean()方法中调用返回一个新的实例。
         */
        CustomerServiceAnnotation customerServiceB = (CustomerServiceAnnotation)context.getBean("customerServiceAnnotation");
        log.info(customerServiceB.getMsg());//return null
    }
}
