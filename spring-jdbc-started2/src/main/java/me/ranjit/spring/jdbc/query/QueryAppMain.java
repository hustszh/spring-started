package me.ranjit.spring.jdbc.query;

import me.ranjit.spring.jdbc.model.Customer;
import me.ranjit.spring.jdbc.query.dao.CustomerQueryDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public class QueryAppMain {
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerQueryDAO customerDAO = (CustomerQueryDAO) context.getBean("customerQueryDAO");

        Customer customerA = customerDAO.findByCustomerId(1);
        System.out.println("Customer A : " + customerA);

        Customer customerB = customerDAO.findByCustomerId2(1);
        System.out.println("Customer B : " + customerB);

        List<Customer> customerAs = customerDAO.findAll();
        for(Customer cust: customerAs){
            System.out.println("Customer As : " + cust);
        }

        List<Customer> customerBs = customerDAO.findAll2();
        for(Customer cust: customerBs){
            System.out.println("Customer Bs : " + cust);
        }

        List<Customer> customerCs = customerDAO.findAll3();
        for(Customer cust: customerCs){
            System.out.println("Customer Cs : " + cust);
        }

        String customerName = customerDAO.findCustomerNameById(1);
        System.out.println("Customer Name : " + customerName);

        int total = customerDAO.findTotalCustomer();
        System.out.println("Total : " + total);

    }
}
