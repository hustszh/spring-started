package me.ranjit.spring.loosecoupling;

import lombok.extern.log4j.Log4j2;

/**
 * Created by suzh on 5/27/2017.
 */
@Log4j2
public class CsvOutputGenerator implements IOutputGenerator {
    public void generateOutput() {
        log.info("csv output generator");
    }
}
