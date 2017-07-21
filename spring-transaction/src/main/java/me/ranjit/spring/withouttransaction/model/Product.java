package me.ranjit.spring.withouttransaction.model;

import lombok.Data;

/**
 * Created by suzh on 7/20/2017.
 */
@Data
public class Product {
    private Long productId;
    private String productCode;
    private String productDesc;
}
