package me.ranjit.spring.bean.xml;

import lombok.Data;

/**
 * Created by suzh on 6/23/2017.
 */
@Data
public class Customer {
    private Person person;
    private int type;
    private String action;
}
