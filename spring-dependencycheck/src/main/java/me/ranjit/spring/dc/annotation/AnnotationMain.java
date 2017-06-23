package me.ranjit.spring.dc.annotation;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.annotation.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 * @Required注解，它比依赖检查XML文件中更加灵活，因为它可以适用于只有一个特定属性。
 * 简单地套用@Required注解不会强制执行该属性的检查，
 * 还需要注册一个RequiredAnnotationBeanPostProcessor以了解在bean配置文件@Required注解。
 */
@Log4j2
public class AnnotationMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/applicationContextAnnotation.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
