package me.ranjit.spring.aop.withoutaop;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.aop.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/17/2017.
 */
@Log4j2
public class WithoutAopMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("withoutaop/applicationContextWithoutAop.xml");
        CustomerService customerService = (CustomerService) context.getBean("customerService");
        customerService.printName();
        customerService.printURL();
        try{
            customerService.printThrowException();
        } catch (Exception e){

        }
    }
}
