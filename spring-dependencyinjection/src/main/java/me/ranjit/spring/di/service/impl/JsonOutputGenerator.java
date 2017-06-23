package me.ranjit.spring.di.service.impl;

import me.ranjit.spring.di.service.IOutputGenerator;

/**
 * Created by suzh on 6/7/2017.
 */
public class JsonOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        System.out.println("This is Json Output Generator");
    }
}
