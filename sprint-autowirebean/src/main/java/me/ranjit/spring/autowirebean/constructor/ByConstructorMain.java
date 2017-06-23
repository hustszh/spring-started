package me.ranjit.spring.autowirebean.constructor;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.autowirebean.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/5/2017.
 * 通过构造函数参数的数据类型按属性自动装配Bean。
 * 在这种情况下，由于“address” bean的数据类型与“customer” bean的属性(Address对象)的构造函数参数的数据类型是一样的，
 * 所以，Spring通过构造方法自动装配 – “public Customer(Address address)“.
 */
@Log4j2
public class ByConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("byconstructor/applicationContextByConstructor.xml");

        Customer customer = (Customer) context.getBean("customer");
        log.info(JSON.toJSONString(customer));
    }
}
