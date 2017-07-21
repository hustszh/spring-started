package me.ranjit.spring.email.attachment;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.email.attachment.bean.AttachmentMail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 7/21/2017.
 */
@Log4j2
public class AttachmentMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("attachment/applicationContextAttachment.xml");
        AttachmentMail mail = (AttachmentMail) context.getBean("mail");

        mail.sendMail("ranjit", "This is the content.", "c:/tmp/aa.log");
        log.info("Done.");
    }
}
