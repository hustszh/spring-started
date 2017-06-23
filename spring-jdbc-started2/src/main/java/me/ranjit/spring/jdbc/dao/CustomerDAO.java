package me.ranjit.spring.jdbc.dao;

import me.ranjit.spring.jdbc.model.Customer;

/**
 * Created by suzh on 6/2/2017.
 */
public interface CustomerDAO {
    void insert(Customer customer);
    Customer findByCustomerId(int custId);
}
