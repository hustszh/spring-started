package me.ranjit.spring.dc.annotation.requiredstyle;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.annotation.requiredstyle.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 */
@Log4j2
public class RequiredStyleMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/requiredstyle/applicationContextRequiredStyle.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
