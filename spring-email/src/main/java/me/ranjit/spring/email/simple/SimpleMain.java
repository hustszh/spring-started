package me.ranjit.spring.email.simple;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.email.simple.bean.Mail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/21/2017.
 */
@Log4j2
public class SimpleMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("simple/applicationContextSimple.xml");

        Mail mail = (Mail) context.getBean("mail");

        String from = "xxx@163.com";
        String to = "xxx@126.com";
        String subject = "spring自带javamail发送的邮件";
        String msg = "Hello, this mail is from spring javaMail";
        mail.sendMail(from, to, subject, msg);

        log.info("Done.");
    }
}
