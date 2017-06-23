package me.ranjit.spring.javaconfig;

import me.ranjit.spring.javaconfig.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by suzh on 6/6/2017.
 */
@Configuration
public class CustomerConfig {

    @Bean(name="customer")
    public Customer anyNameIsOK() {
        return new Customer("jacket", 23);
    }
}
