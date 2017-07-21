package me.ranjit.spring.email.template;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.email.template.bean.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/21/2017.
 */
@Log4j2
public class TemplateMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("template/applicationContextTemplate.xml");
        Mail mail = (Mail) context.getBean("mail");

        mail.sendMail("ranjit", "This is the content.");
        log.info("Done.");
    }
}
