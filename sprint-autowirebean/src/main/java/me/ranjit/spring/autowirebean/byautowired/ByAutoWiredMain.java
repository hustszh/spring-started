package me.ranjit.spring.autowirebean.byautowired;

import com.alibaba.fastjson.JSON;
import me.ranjit.spring.autowirebean.bean.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/5/2017.
 * 要启用@Autowired，必须注册“AutowiredAnnotationBeanPostProcessor'，你可以用两种方式做到这一点（参见applicationContext.xml配置）
 */
public class ByAutoWiredMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("byautowired/applicationContextByAutoWired.xml");

        Customer customer = (Customer) context.getBean("customer");
        System.out.println(JSON.toJSONString(customer));
    }
}
