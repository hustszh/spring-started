package me.ranjit.spring.jdbc.query.dao;

import me.ranjit.spring.jdbc.model.Customer;

import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public interface CustomerQueryDAO {

    Customer findByCustomerId(int custId);

    Customer findByCustomerId2(int custId);

    List<Customer> findAll();

    List<Customer> findAll2();

    List<Customer> findAll3();

    String findCustomerNameById(int custId);

    int findTotalCustomer();
}
