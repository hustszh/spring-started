package me.ranjit.spring.jdbc.update.dao.impl;

import me.ranjit.spring.jdbc.model.Customer;
import me.ranjit.spring.jdbc.update.dao.CustomerUpdateDAO;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public class CustomerUpdateDAOImpl extends JdbcDaoSupport implements CustomerUpdateDAO {

    public void updateBatch(final List<Customer> customers) {
        String sql = "INSERT INTO CUSTOMER (CUST_ID, NAME, AGE) VALUES (?, ?, ?)";

        getJdbcTemplate().batchUpdate(sql, new BatchPreparedStatementSetter() {

            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Customer customer = customers.get(i);
                ps.setLong(1, customer.getCust_id());
                ps.setString(2, customer.getName());
                ps.setInt(3, customer.getAge() );
            }

            public int getBatchSize() {
                return customers.size();
            }
        });
    }

    public void updateBatchSQL(String sql) {
        getJdbcTemplate().batchUpdate(new String[]{sql});
    }
}
