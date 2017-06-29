package me.ranjit.spring.cs.base.annotation;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/29/2017.
 */
@Log4j2
public class BaseAnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("base/annotation/applicationContextAnnotation.xml");
        CustomerService customerService = (CustomerService)context.getBean("AAABBC");
        log.info(JSON.toJSONString(customerService));
    }
}
