package me.ranjit.spring.aspectj.annotation;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.aspectj.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/18/2017.
 */
@Log4j2
public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/applicationContextAspectJAnnotation.xml");
        ICustomerService iCustomerService = (ICustomerService)context.getBean("customerService");
        iCustomerService.addCustomer();
        iCustomerService.addCustomerAround("suzh");
        iCustomerService.addCustomerReturnValue();
        try {
            iCustomerService.addCustomerThrowException();
        } catch (Exception e) {
//            log.error(e);
        }
    }
}
