package me.ranjit.spring.aop;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * Created by suzh on 7/17/2017.
 */
@Data
@Log4j2
public class CustomerService {
    private String name;
    private String url;

    public void printName() {
        log.info("Customer name : " + this.name);
    }

    public void printURL() {
        log.info("Customer website : " + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }
}
