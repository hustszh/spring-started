package me.ranjit.spring.bean.annotation.requiredstyle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by suzh on 6/23/2017.
 * 需要在Spring配置文件中，注入到“RequiredAnnotationBeanPostProcessor”类
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Mandatory {
}