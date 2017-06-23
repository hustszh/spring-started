package me.ranjit.spring.jdbc.update.dao;

import me.ranjit.spring.jdbc.model.Customer;

import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public interface CustomerUpdateDAO {
    void updateBatch(List<Customer> customers);

    void updateBatchSQL(String sql);
}
