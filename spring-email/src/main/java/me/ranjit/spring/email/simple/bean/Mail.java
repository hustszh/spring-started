package me.ranjit.spring.email.simple.bean;

import lombok.Data;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by suzh on 7/21/2017.
 * 注意SimpleMailMessage只能用来发送text格式的邮件
 */
@Data
public class Mail {

//    @Autowired
    private MailSender mailSender;

    public void sendMail(String from, String to, String subject, String msg) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(msg);

        mailSender.send(message);
    }
}
