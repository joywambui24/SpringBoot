package com.example.friday.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private BigDecimal price;

    public Product(long id, String brand, String model, BigDecimal price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

}
