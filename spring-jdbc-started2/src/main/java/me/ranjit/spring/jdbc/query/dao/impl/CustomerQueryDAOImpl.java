package me.ranjit.spring.jdbc.query.dao.impl;

import me.ranjit.spring.jdbc.model.Customer;
import me.ranjit.spring.jdbc.model.CustomerRowMapper;
import me.ranjit.spring.jdbc.query.dao.CustomerQueryDAO;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by suzh on 6/2/2017.
 */
public class CustomerQueryDAOImpl extends JdbcDaoSupport implements CustomerQueryDAO {

    /*
    查询单行数据
    自定义RowMapper
     */
    public Customer findByCustomerId(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Customer customer = getJdbcTemplate().queryForObject(
                sql, new Object[] { custId }, new CustomerRowMapper());

        return customer;
    }

    /*
    查询单行数据
    Spring2.5之后的RowMapper 实现所谓“BeanPropertyRowMapper”，
    它可以通过匹配行的名字的列值映射到一个属性。
    只要确保这两个属性和列具有相同的名称，如属性“CUSTID”将匹配到列名为：“CUSTID”或下划线“CUST_ID”。
     */
    public Customer findByCustomerId2(int custId) {
        String sql = "SELECT * FROM CUSTOMER WHERE CUST_ID = ?";

        Customer customer = (Customer)getJdbcTemplate().queryForObject(
                sql, new Object[] { custId },
                new BeanPropertyRowMapper(Customer.class));

        return customer;
    }

    /*
    查询多行，不推荐！
    返回多行，RowMapper 不支持 queryForList()方法，需要手动映射它。
     */
    public List<Customer> findAll() {
        String sql = "SELECT * FROM CUSTOMER";

        List<Customer> customers = new ArrayList<Customer>();

        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
        for (Map row : rows) {
            Customer customer = new Customer(((Long) (row.get("CUST_ID"))).intValue(),
                    (String)row.get("NAME"),
                    ((Long)row.get("AGE")).intValue());
            customers.add(customer);
        }

        return customers;
    }

    /*
    查询多行
    使用 BeanPropertyRowMapper 类
     */
    public List<Customer> findAll2() {
        String sql = "SELECT * FROM CUSTOMER";

        List<Customer> customers  = getJdbcTemplate().query(sql,
                new BeanPropertyRowMapper(Customer.class));

        return customers;
    }

    /*
    查询多行
    使用 RowMapper 类
     */
    public List<Customer> findAll3() {
        String sql = "SELECT * FROM CUSTOMER";

        List<Customer> list = getJdbcTemplate().query(sql, new RowMapper<Customer>() {
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                Customer customer = new Customer(
                        resultSet.getInt("CUST_ID"),
                        resultSet.getString("NAME"),
                        resultSet.getInt("AGE"));
                return customer;
            }
        });
        return list;
    }

    /*
    查询单值
    查询单个列名作为字符串。
     */
    public String findCustomerNameById(int custId) {
        String sql = "SELECT NAME FROM CUSTOMER WHERE CUST_ID = ?";

        String name = getJdbcTemplate().queryForObject(
                sql, new Object[] { custId }, String.class);

        return name;
    }

    /*
    查询单值
    如何从数据库中查询行的总数。
     */
    public int findTotalCustomer() {
        String sql = "SELECT COUNT(*) FROM CUSTOMER";

        int total = getJdbcTemplate().queryForInt(sql);

        return total;
    }
}
