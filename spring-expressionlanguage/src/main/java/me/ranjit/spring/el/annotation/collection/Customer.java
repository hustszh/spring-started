package me.ranjit.spring.el.annotation.collection;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/26/2017.
 */
@Data
@Component("customerBean")
public class Customer {

    @Value("#{itemBean.map['MapA']}")
    private String mapA;

    @Value("#{itemBean.list[0]}")
    private String list;
}
