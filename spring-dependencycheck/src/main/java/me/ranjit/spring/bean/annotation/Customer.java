package me.ranjit.spring.bean.annotation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Required;


/**
 * Created by suzh on 6/23/2017.
 * @Required注解，它比依赖检查XML文件中更加灵活，因为它可以适用于只有一个特定属性。
 * 简单地套用@Required注解不会强制执行该属性的检查，
 * 还需要注册一个RequiredAnnotationBeanPostProcessor以了解在bean配置文件@Required注解。
 */
@Data
public class Customer {
    private Person person;
    private int type;
    private String action;

    @Required
    public void setPerson(Person person) {
        this.person = person;
    }
}
