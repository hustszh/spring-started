package me.ranjit.spring.javaconfig;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.javaconfig.model.Customer;
import me.ranjit.spring.javaconfig.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by suzh on 6/6/2017.
 * 使用 AnnotationConfigApplicationContext 加载JavaConfig类
 */
@Log4j2
public class JavaConfigMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        DemoService demoService = (DemoService)context.getBean("demoService");
        demoService.sayHello("ranjit");

        Customer customer = (Customer)context.getBean("customer");
        log.info(JSON.toJSONString(customer));
    }

}
