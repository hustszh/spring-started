package me.ranjit.spring.el.annotation.base;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by suzh on 6/26/2017.
 */
@Data
@Component("itemBean")
public class Item {
    @Value("itemB") //inject String directly
    private String name;

    @Value("22") //inject interger directly
    private int qty;
}
