package me.ranjit.spring.dc.global;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.xml.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 */
@Log4j2
public class GlobalMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("global/applicationContextGlobal.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
