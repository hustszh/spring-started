package me.ranjit.spring.autowirebean.byref;

import com.alibaba.fastjson.JSON;
import me.ranjit.spring.autowirebean.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/5/2017.
 * 默认的模式，你需要通过 'ref' 属性来连接 property.base。
 */
public class ByRefMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("byref/applicationContextByRef.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(JSON.toJSONString(customer));
    }
}
