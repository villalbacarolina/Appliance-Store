package com.appliance_store.sale.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter
public class Sale {
    @Id
    private long id;
    private long shoppingCartId;
    private Date date;
}
