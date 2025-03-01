package com.appliance_store.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Product {
    @Id
    private String code;
    private String brand;
    private String name;
    private BigDecimal price;
}
