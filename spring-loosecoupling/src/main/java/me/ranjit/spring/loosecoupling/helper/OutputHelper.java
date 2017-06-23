package me.ranjit.spring.loosecoupling.helper;

import me.ranjit.spring.loosecoupling.CsvOutputGenerator;
import me.ranjit.spring.loosecoupling.IOutputGenerator;

/**
 * Created by suzh on 5/27/2017.
 */
public class OutputHelper {
    IOutputGenerator outputGenerator;

    public OutputHelper(){
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }
}
