package me.ranjit.spring.withtransaction.model;

import lombok.Data;

/**
 * Created by suzh on 7/20/2017.
 */
@Data
public class ProductQoh {
    private Long qohId;
    private long productId;
    private int qty;
}
