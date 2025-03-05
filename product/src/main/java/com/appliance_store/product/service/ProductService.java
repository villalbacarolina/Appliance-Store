package com.appliance_store.product.service;

import com.appliance_store.product.model.Product;
import com.appliance_store.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product p) {
        productRepository.save(p);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product findProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public void editProduct(Product p) {
        this.saveProduct(p);
    }
}
