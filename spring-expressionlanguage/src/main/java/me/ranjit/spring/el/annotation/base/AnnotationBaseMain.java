package me.ranjit.spring.el.annotation.base;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/26/2017.
 */
@Log4j2
public class AnnotationBaseMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/base/applicationContextAnnotationBase.xml");
        Customer customer = (Customer)context.getBean("customerBean");
        log.info(JSON.toJSONString(customer));
    }
}
