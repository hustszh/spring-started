package me.ranjit.spring.jdbc.dao.impl;

import me.ranjit.spring.jdbc.dao.CustomerDAO;
import me.ranjit.spring.jdbc.model.Customer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public class JdbcTemplateCustomerDAOImpl implements CustomerDAO {
    private DataSource dataSource;

    /**
     * 使用JdbcTemplate可节省大量的冗余代码(创建连接，关闭连接，处理异常)，因为JdbcTemplate类会自动处理它。
     */
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void insert(Customer customer) {
        String sql = "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        jdbcTemplate.update(sql, new Object[]{
                customer.getCust_id(),
                customer.getName(),
                customer.getAge()
        });
    }

    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        List<Customer> list = jdbcTemplate.query(sql, new Object[]{custId}, new RowMapper<Customer>() {
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
