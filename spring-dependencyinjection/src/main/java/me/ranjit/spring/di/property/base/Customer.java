package me.ranjit.spring.di.property.base;

import lombok.Data;

/**
 * Created by suzh on 6/7/2017.
 * 在Spring中，有三种方式注入值到 property.base 属性。
 * 1.正常方式
 * 2.快捷方式
 * 3.“p” 模式
 */
@Data
public class Customer {
    private String name;
    private int age;
    private String sex;
}
