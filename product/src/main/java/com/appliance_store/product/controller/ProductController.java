package com.appliance_store.product.controller;

import com.appliance_store.product.model.Product;
import com.appliance_store.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product p) {
        productService.saveProduct(p);
        return "Product saved successfully.";
    }

    @GetMapping("/get")
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return "Product deleted successfully.";
    }

    @PutMapping("/products/edit/{id_originalProduct}")
    public Product editProduct(@PathVariable Long id_originalProduct,
                               @RequestBody Product newProduct){
        productService.editProduct(id_originalProduct, newProduct);
        
        return productService.findProduct(id_originalProduct);
    }

}
