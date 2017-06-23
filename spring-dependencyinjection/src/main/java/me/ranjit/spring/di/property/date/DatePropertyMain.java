package me.ranjit.spring.di.property.date;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/20/2017.
 * 在Spring中，可以通过两种方式注入日期：
 * 1. Factory bean
 * 在spring配置文件中声明一个dateFormat bean，在“customer” Bean，引用 “dateFormat” bean作为一个工厂bean。
 * 该工厂方法将调用SimpleDateFormat.parse()自动转换成字符串Date对象。
 *
 * 2. CustomDateEditor
 * 在spring配置文件中配置CustomDateEditor和CustomEditorConfigurer
 */
@Log4j2
public class DatePropertyMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("property/date/applicationContextDateProperty.xml");
        Customer customer = (Customer)context.getBean("customer");
        log.info(customer.getDate());
    }
}
