package me.ranjit.spring.jdbc.query;

import lombok.extern.log4j.Log4j2;
import me.ranjit.spring.jdbc.model.Customer;
import me.ranjit.spring.jdbc.query.dao.CustomerQueryDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
@Log4j2
public class QueryAppMain {
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerQueryDAO customerDAO = (CustomerQueryDAO) context.getBean("customerQueryDAO");

        Customer customerA = customerDAO.findByCustomerId(1);
        log.info("Customer A : " + customerA);

        Customer customerB = customerDAO.findByCustomerId2(1);
        log.info("Customer B : " + customerB);

        List<Customer> customerAs = customerDAO.findAll();
        for(Customer cust: customerAs){
            log.info("Customer As : " + cust);
        }

        List<Customer> customerBs = customerDAO.findAll2();
        for(Customer cust: customerBs){
            log.info("Customer Bs : " + cust);
        }

        List<Customer> customerCs = customerDAO.findAll3();
        for(Customer cust: customerCs){
            log.info("Customer Cs : " + cust);
        }

        String customerName = customerDAO.findCustomerNameById(1);
        log.info("Customer Name : " + customerName);

        int total = customerDAO.findTotalCustomer();
        log.info("Total : " + total);

    }
}
