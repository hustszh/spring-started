package me.ranjit.spring.autowirebean.byname;

import com.alibaba.fastjson.JSON;
import me.ranjit.spring.autowirebean.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/5/2017.
 * 按属性名称自动装配。在这种情况下，由于对“address” bean的名称是相同于“customer” property.base 的属性(“address”)名称，
 * 所以，Spring会自动通过setter方法将其装配 – "setAddress(Address address)".
 */
public class ByNameMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("byname/applicationContextByName.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(JSON.toJSONString(customer));
    }
}
