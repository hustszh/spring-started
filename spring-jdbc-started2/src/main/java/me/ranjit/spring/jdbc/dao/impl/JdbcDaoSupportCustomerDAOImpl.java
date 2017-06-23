package me.ranjit.spring.jdbc.dao.impl;

import me.ranjit.spring.jdbc.dao.CustomerDAO;
import me.ranjit.spring.jdbc.model.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 * 通过扩展 JdbcDaoSupport，设置数据源，并且 JdbcTemplate 在类中不再是必需的，
 * 只需要正确的数据源注入CustomerDAO。可以使用 getJdbcTemplate()方法得到 JdbcTemplate。
 */
public class JdbcDaoSupportCustomerDAOImpl extends JdbcDaoSupport implements CustomerDAO {

    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().update(sql, new Object[] {
                customer.getCust_id(),
                customer.getName(),
                customer.getAge()
        });
    }

    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        List<Customer> list = getJdbcTemplate().query(sql, new Object[]{custId}, new RowMapper<Customer>() {
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer = new Customer(
                        resultSet.getInt("CUST_ID"),
                        resultSet.getString("NAME"),
                        resultSet.getInt("AGE"));
                return customer;
            }
        });
        return list.get(0);
    }
}
