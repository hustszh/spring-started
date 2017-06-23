package me.ranjit.spring.di.property.base;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/7/2017.
 */
@Log4j2
public class BasePropertyMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/base/applicationContextBean.xml");
        Customer customer = (Customer)context.getBean("customer");
        log.info(JSON.toJSONString(customer));
    }
}
