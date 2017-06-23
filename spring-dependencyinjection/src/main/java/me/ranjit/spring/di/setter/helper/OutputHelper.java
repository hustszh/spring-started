package me.ranjit.spring.di.setter.helper;

import me.ranjit.spring.di.service.IOutputGenerator;

/**
 * Created by suzh on 6/7/2017.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    //DI via setter method
    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}
