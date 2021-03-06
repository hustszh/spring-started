package me.ranjit.spring.aop.withaop.interceptall;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.aop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/17/2017.
 * 默认情况下，一个类的整个方法都会被自动拦截。
 */
@Log4j2
public class InterceptAllMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("withaop/interceptall/applicationContextInterceptAll.xml");
        /*
        获取新的 customerServiceProxy bean，而不是原来的CustomerService bean。
         */
        CustomerService customerService = (CustomerService) context.getBean("customerServiceProxy");
        customerService.printName();
        log.info("-----------------------------------");
        customerService.printURL();
        log.info("-----------------------------------");
        try{
            customerService.printThrowException();
        } catch (Exception e){

        }
    }
}
