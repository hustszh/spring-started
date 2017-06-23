package me.ranjit.spring.dc.local.simple;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.xml.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 * local.simple – 如果基本类型(int, long,double…)和集合类型(map, list..)的任何属性都没有设置，
 * UnsatisfiedDependencyException将被抛出。
 */
@Log4j2
public class SimpleMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("local/simple/applicationContextSimple.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
