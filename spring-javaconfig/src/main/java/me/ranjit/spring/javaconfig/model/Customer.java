package me.ranjit.spring.javaconfig.model;

import lombok.Data;

/**
 * Created by suzh on 6/6/2017.
 */
@Data
public class Customer {
    private String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
