package me.ranjit.spring.di.service.impl;

import me.ranjit.spring.di.service.IOutputGenerator;

/**
 * Created by suzh on 6/7/2017.
 */
public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        System.out.println("This is Csv Output Generator");
    }
}
