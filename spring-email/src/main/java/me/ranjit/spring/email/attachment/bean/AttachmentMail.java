package me.ranjit.spring.email.attachment.bean;

import lombok.Data;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by suzh on 7/21/2017.
 * 为了包含附件的电子邮件，
 * 必须使用 Spring的JavaMailSender及MimeMessage 来代替 MailSender＆SimpleMailMessage。
 */
@Data
public class AttachmentMail {
    private JavaMailSender mailSender;
    private SimpleMailMessage simpleMailMessage;

    public void sendMail(String dear, String content, String attachmentPath) {

        MimeMessage message = mailSender.createMimeMessage();

        try{
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setFrom(simpleMailMessage.getFrom());
            helper.setTo(simpleMailMessage.getTo());
            helper.setSubject(simpleMailMessage.getSubject());
            helper.setText(String.format(
                    simpleMailMessage.getText(), dear, content));

            FileSystemResource file = new FileSystemResource(attachmentPath);
            helper.addAttachment(file.getFilename(), file);

        }catch (MessagingException e) {
            throw new MailParseException(e);
        }
        mailSender.send(message);
    }
}
