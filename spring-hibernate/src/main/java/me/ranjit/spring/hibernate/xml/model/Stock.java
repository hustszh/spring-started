package me.ranjit.spring.hibernate.xml.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by suzh on 7/19/2017.
 */
@Data
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long stockId;
    private String stockCode;
    private String stockName;
}
