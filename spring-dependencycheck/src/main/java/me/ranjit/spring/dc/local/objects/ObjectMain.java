package me.ranjit.spring.dc.local.objects;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.xml.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 * local.objects – 如果对象类型的任何属性都没有设置，UnsatisfiedDependencyException将被抛出。
 */
@Log4j2
public class ObjectMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("local/objects/applicationContextObjects.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
