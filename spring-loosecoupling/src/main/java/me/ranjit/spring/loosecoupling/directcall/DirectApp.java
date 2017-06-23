package me.ranjit.spring.loosecoupling.directcall;

import me.ranjit.spring.loosecoupling.CsvOutputGenerator;
import me.ranjit.spring.loosecoupling.IOutputGenerator;

/**
 * Created by suzh on 5/27/2017.
 */
public class DirectApp {
    public static void main( String[] args )
    {
        IOutputGenerator output = new CsvOutputGenerator();
        output.generateOutput();
    }
}
