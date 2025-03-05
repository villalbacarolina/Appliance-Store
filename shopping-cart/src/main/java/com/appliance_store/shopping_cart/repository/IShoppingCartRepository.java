package com.appliance_store.shopping_cart.repository;

import com.appliance_store.shopping_cart.model.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShoppingCartRepository extends JpaRepository<ShoppingCart,Long> {
}
