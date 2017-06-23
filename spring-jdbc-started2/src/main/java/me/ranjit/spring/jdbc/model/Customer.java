package me.ranjit.spring.jdbc.model;

import lombok.Data;

/**
 * Created by suzh on 6/2/2017.
 */
@Data
public class Customer {
    int cust_id;
    String name;
    int age;

    public Customer(){}

    public Customer(int cust_id, String name, int age) {
        this.cust_id = cust_id;
        this.name = name;
        this.age = age;
    }
}
