package com.appliance_store.product.service;

import com.appliance_store.product.model.Product;
import java.util.List;

public interface IProductService {
    public List<Product> getProducts();
    public void saveProduct(Product p);
    public void deleteProduct(Long id);
    public Product findProduct(Long id);
    public void editProduct(Long id, Product p);
}
