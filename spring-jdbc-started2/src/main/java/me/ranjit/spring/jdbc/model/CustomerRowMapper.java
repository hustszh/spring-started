package me.ranjit.spring.jdbc.model;

import me.ranjit.spring.jdbc.query.dao.impl.CustomerQueryDAOImpl;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by suzh on 6/2/2017.
 */
public class CustomerRowMapper implements RowMapper<Customer> {
    public Customer mapRow(ResultSet rs, int i) throws SQLException {
        Customer customer = new Customer(
                rs.getInt("CUST_ID"),
                rs.getString("NAME"),
                rs.getInt("AGE"));
        return customer;
    }
}
