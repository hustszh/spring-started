package me.ranjit.spring.aspectj.service;

/**
 * Created by suzh on 7/17/2017.
 */
public interface ICustomerService {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
