package com.appliance_store.shopping_cart.service;

import com.appliance_store.shopping_cart.model.ShoppingCart;
import com.appliance_store.shopping_cart.repository.IShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService implements IShoppingCartService{

    @Autowired
    IShoppingCartRepository shoppingCartRepository;

    @Override
    public List<ShoppingCart> getShoppingCart() {
        return shoppingCartRepository.findAll();
    }

    @Override
    public void saveShoppingCart(ShoppingCart sc) {
        shoppingCartRepository.save(sc);
    }

    @Override
    public void deleteShoppingCart(Long id) {
        shoppingCartRepository.deleteById(id);
    }

    @Override
    public ShoppingCart findShoppingCart(Long id) {
        return shoppingCartRepository.findById(id).orElse(null);
    }

    @Override
    public void editShoppingCart(ShoppingCart sc) {
        this.saveShoppingCart(sc);
    }
}
