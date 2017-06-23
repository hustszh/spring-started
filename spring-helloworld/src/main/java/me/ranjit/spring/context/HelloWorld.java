package me.ranjit.spring.context;

import lombok.extern.log4j.Log4j2;

/**
 * Created by suzh on 5/27/2017.
 */
@Log4j2
public class HelloWorld {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello() {
        log.info("Spring 3 : Hello ! " + name);
    }
}
