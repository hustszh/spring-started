package me.ranjit.spring.hibernate.annotation.model;


import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by suzh on 7/19/2017.
 * Stock模型注解类来存储库存数据。
 */
@ToString
@Entity
@Table(name = "stock", catalog = "suzh", uniqueConstraints = {
        @UniqueConstraint(columnNames = "STOCK_NAME"),
        @UniqueConstraint(columnNames = "STOCK_CODE") })
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long stockId;
    private String stockCode;
    private String stockName;

    public Stock() {
    }

    public Stock(String stockCode, String stockName) {
        this.stockCode = stockCode;
        this.stockName = stockName;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "STOCK_ID", unique = true, nullable = false)
    public Long getStockId() {
        return this.stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    @Column(name = "STOCK_CODE", unique = true, nullable = false, length = 10)
    public String getStockCode() {
        return this.stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    @Column(name = "STOCK_NAME", unique = true, nullable = false, length = 20)
    public String getStockName() {
        return this.stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
}
