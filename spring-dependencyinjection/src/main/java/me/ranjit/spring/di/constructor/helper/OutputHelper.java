package me.ranjit.spring.di.constructor.helper;

import me.ranjit.spring.di.service.IOutputGenerator;

/**
 * Created by suzh on 6/7/2017.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }

    public void generateOutput() {
        outputGenerator.generateOutput();
    }


}
