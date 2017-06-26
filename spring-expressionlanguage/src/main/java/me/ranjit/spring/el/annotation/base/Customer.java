package me.ranjit.spring.el.annotation.base;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/26/2017.
 */
@Data
@Component("customerBean")
public class Customer {
    @Value("#{itemBean}")
    private Item item;

    @Value("#{itemBean.name}")
    private String itemName;
}
