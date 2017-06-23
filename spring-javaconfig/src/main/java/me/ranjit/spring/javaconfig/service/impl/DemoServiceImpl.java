package me.ranjit.spring.javaconfig.service.impl;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.javaconfig.service.DemoService;

/**
 * Created by suzh on 6/6/2017.
 */
@Log4j2
public class DemoServiceImpl implements DemoService {

    public void sayHello(String name) {
        log.info("Hello, " + name);
    }
}
