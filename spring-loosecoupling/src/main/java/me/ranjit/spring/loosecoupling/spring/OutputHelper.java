package me.ranjit.spring.loosecoupling.spring;

import me.ranjit.spring.loosecoupling.IOutputGenerator;

/**
 * Created by suzh on 5/27/2017.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator){
        this.outputGenerator = outputGenerator;
    }
}
