package me.ranjit.spring.el.annotation.method;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/26/2017.
 */
@Data
@Component("priceBean")
public class Price {
    @Value("#{99.99}")
    private double price;
}
