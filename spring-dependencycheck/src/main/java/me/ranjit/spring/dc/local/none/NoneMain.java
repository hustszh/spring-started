package me.ranjit.spring.dc.local.none;

import com.alibaba.fastjson.JSON;
import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.bean.xml.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/23/2017.
 * local.none – 没有依赖检查，这是默认的模式。
 */
@Log4j2
public class NoneMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("local/none/applicationContextNone.xml");
        Customer customer = (Customer)context.getBean("CustomerBean");
        log.info(JSON.toJSONString(customer));
    }
}
