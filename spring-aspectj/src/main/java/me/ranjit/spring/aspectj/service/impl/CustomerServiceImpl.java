package me.ranjit.spring.aspectj.service.impl;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.aspectj.service.ICustomerService;

/**
 * Created by suzh on 7/17/2017.
 */
@Log4j2
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public void addCustomer() {
        log.info("addCustomer() is running ");
    }

    @Override
    public String addCustomerReturnValue() {
        log.info("addCustomerReturnValue() is running ");
        return "abc";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
        log.info("addCustomerThrowException() is running ");
        throw new Exception("Generic Error");
    }

    @Override
    public void addCustomerAround(String name) {
        log.info("addCustomerAround() is running with args: " + name);
    }
}
