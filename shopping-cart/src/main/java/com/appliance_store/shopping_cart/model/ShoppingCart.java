package com.appliance_store.shopping_cart.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.LinkedList;

@Entity
@AllArgsConstructor @NoArgsConstructor
public class ShoppingCart {
    @Id
    private long id;
    private LinkedList<Item> items;
    private BigDecimal totalPrice;
}
