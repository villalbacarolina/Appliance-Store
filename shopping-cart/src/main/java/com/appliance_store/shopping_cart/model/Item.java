package com.appliance_store.shopping_cart.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Item {
    private String productCode;
    private int quantity;
    private BigDecimal totalPrice;
}
