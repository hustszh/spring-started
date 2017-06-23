package me.ranjit.spring.autowirebean.bytype;

import com.alibaba.fastjson.JSON;
import me.ranjit.spring.autowirebean.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/5/2017.
 * 通过按属性的数据类型自动装配Bean。
 * 在这种情况下，由于“address” bean中的数据类型是与“customer” bean的属性(Address对象)的数据类型一样的，
 * 所以，Spring会自动通过setter方法将其自动装配。– “setAddress(Address address)“.
 */
public class ByTypeMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bytype/applicationContextByType.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(JSON.toJSONString(customer));
    }
}
