package me.ranjit.spring.aspectj.xml;

import me.ranjit.spring.aspectj.service.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/18/2017.
 */
public class XmlMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("xml/applicationContextAspectJXml.xml");
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
