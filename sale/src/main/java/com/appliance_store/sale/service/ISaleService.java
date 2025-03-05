package com.appliance_store.sale.service;

import com.appliance_store.sale.model.Sale;

import java.util.List;


public interface ISaleService {
    public List<Sale> getSales();
    public void saveSale(Sale s);
    public void deleteSale(Long id);
    public Sale findSale(Long id);
    public void editSale(Long id, Sale s);
}
