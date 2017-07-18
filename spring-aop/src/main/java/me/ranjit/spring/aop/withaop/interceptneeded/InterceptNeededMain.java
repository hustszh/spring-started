package me.ranjit.spring.aop.withaop.interceptneeded;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.aop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/17/2017.
 * 如果需要对一个类的某些方法进行拦截，需要使用pointcut和advisor。
 */
@Log4j2
public class InterceptNeededMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("withaop/interceptneeded/applicationContextInterceptNeeded.xml");
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
