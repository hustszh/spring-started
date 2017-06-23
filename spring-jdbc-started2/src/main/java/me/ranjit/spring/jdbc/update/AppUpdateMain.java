package me.ranjit.spring.jdbc.update;

import me.ranjit.spring.jdbc.model.Customer;
import me.ranjit.spring.jdbc.update.dao.CustomerUpdateDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by suzh on 6/2/2017.
 */
public class AppUpdateMain {
    public static void main( String[] args )
    {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CustomerUpdateDAO customerDAO = (CustomerUpdateDAO) context.getBean("customerUpdateDAO");
        Customer customer1 = new Customer(4, "taitai",21);
        Customer customer3 = new Customer(5, "youyou",22);
        Customer customer2 = new Customer(6, "ququ",23);

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        customerDAO.updateBatch(customers);

        String sql = "UPDATE CUSTOMER SET NAME ='BATCHUPDATE'";
        customerDAO.updateBatchSQL(sql);

    }
}
