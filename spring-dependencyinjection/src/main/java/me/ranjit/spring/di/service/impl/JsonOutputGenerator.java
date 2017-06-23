package me.ranjit.spring.di.service.impl;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.di.service.IOutputGenerator;

/**
 * Created by suzh on 6/7/2017.
 */
@Log4j2
public class JsonOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        log.info("This is Json Output Generator");
    }
}
