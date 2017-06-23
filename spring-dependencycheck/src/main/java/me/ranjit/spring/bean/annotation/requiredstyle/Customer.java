package me.ranjit.spring.bean.annotation.requiredstyle;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;


/**
 * Created by suzh on 6/23/2017.
 * @Mandatory注解 - 自定义注解，需要在Spring配置文件中，注入到“RequiredAnnotationBeanPostProcessor”类
 */
@Data
public class Customer {
    private Person person;
    private int type;
    private String action;

    @Mandatory
    public void setPerson(Person person) {
        this.person = person;
    }
}
