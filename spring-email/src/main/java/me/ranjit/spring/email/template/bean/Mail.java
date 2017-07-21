package me.ranjit.spring.email.template.bean;

import lombok.Data;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 * Created by suzh on 7/21/2017.
 * Java类使用 Spring的MailSender接口发送电子邮件，
 * 并使用 String.Format 传递变量bean配置文件替换电子邮件模板(customMailMessage)中的 '%s'。
 */
@Data
public class Mail {
    private MailSender mailSender;
    private SimpleMailMessage simpleMailMessage;

    public void sendMail(String dear, String content) {

        SimpleMailMessage message = new SimpleMailMessage(simpleMailMessage);

        // 将具体参数替换掉模板中的参数
        message.setText(String.format(
                simpleMailMessage.getText(), dear, content));

        mailSender.send(message);

    }
}
