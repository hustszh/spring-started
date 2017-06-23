package me.ranjit.spring.jdbc;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.jdbc.dao.CustomerDAO;
import me.ranjit.spring.jdbc.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by suzh on 6/2/2017.
 */
@Log4j2
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
        log.info(customer1);
    }

    private static void testJdbcTemplate(ApplicationContext context) {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("jdbcTemplateCustomerDAO");
        Customer customer = new Customer(2, "dudu", 19);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(2);
        log.info(customer1);
    }

    private static void testJdbcDaoSupport(ApplicationContext context) {
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("jdbcDaoSupportCustomerDAO");
        Customer customer = new Customer(11, "juju", 39);
        customerDAO.insert(customer);

        Customer customer1 = customerDAO.findByCustomerId(3);
        log.info(customer1);
    }
}
