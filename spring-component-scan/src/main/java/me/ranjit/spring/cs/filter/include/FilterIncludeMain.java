package me.ranjit.spring.cs.filter.include;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/29/2017.
 */
@Log4j2
public class FilterIncludeMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("filter/include/applicationContextFilterInclude.xml");
        CustomerService customerService = (CustomerService)context.getBean("customerService");
        log.info(JSON.toJSONString(customerService));
    }
}
