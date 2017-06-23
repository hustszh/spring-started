package me.ranjit.spring.javaconfig.service.impl;

import me.ranjit.spring.javaconfig.service.DemoService;

/**
 * Created by suzh on 6/6/2017.
 */
public class DemoServiceImpl implements DemoService {

    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
}
