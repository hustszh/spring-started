package me.ranjit.spring.dc.local.all;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.xml.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 * local.all – 如果任何类型的任何属性都没有被设置，UnsatisfiedDependencyException将被抛出。
 */
@Log4j2
public class AllMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("local/all/applicationContextAll.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
