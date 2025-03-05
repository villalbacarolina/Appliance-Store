package com.appliance_store.shopping_cart.service;

import com.appliance_store.shopping_cart.model.ShoppingCart;

import java.util.List;

public interface IShoppingCartService {
    public List<ShoppingCart> getShoppingCart();
    public void saveShoppingCart(ShoppingCart sc);
    public void deleteShoppingCart(Long id);
    public ShoppingCart findShoppingCart(Long id);
    public void editShoppingCart(ShoppingCart sc);
}
