package me.ranjit.spring.di.property.collection.beancollectionprops;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/8/2017.
 */
public class BeanCollectionPropsMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/collection/beancollectionprops/applicationContextCollection.xml");
        CustomerCollection customerCollection = (CustomerCollection)context.getBean("customerCollection");
        System.out.println(JSON.toJSONString(customerCollection));
    }
}
