package me.ranjit.spring.jdbc;

import me.ranjit.spring.jdbc.dao.CustomerDAO;
import me.ranjit.spring.jdbc.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/2/2017.
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        testJdbc(context);
//        testJdbcTemplate(context);
        testJdbcDaoSupport(context);
    }

    private static void testJdbc(ApplicationContext context) {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("jdbcCustomerDAO");
        Customer customer = new Customer(1, "baibai", 29);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
    }

    private static void testJdbcTemplate(ApplicationContext context) {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("jdbcTemplateCustomerDAO");
        Customer customer = new Customer(2, "dudu", 19);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(2);
        System.out.println(customer1);
    }

    private static void testJdbcDaoSupport(ApplicationContext context) {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("jdbcDaoSupportCustomerDAO");
        Customer customer = new Customer(11, "juju", 39);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(3);
        System.out.println(customer1);
    }
}
