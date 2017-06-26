package me.ranjit.spring.id.j2eeannotation;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 */
@Log4j2
public class J2eeAnnotationMain {
    public static void main(String[] args) {
        /*
        ConfigurableApplicationContext.close()将关闭该应用程序的上下文，
        释放所有资源，并销毁所有缓存的单例bean。它是只用于 destroy() 方法的演示目的。
         */
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("j2eeannotation/applicationContextJ2eeAnnotation.xml");
        CustomerService customerService = (CustomerService)context.getBean("customerService");
        log.info(JSON.toJSONString(customerService));
        context.close();//释放资源，销毁bean
    }
}
