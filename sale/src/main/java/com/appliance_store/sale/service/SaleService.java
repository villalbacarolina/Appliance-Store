package com.appliance_store.sale.service;

import com.appliance_store.sale.model.Sale;
import com.appliance_store.sale.repository.ISaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService implements ISaleService{

    @Autowired
    ISaleRepository saleRepository;

    @Override
    public List<Sale> getSales() {
        return saleRepository.findAll();
    }

    @Override
    public void saveSale(Sale s) {
        saleRepository.save(s);
    }

    @Override
    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }

    @Override
    public Sale findSale(Long id) {
        return saleRepository.findById(id).orElse(null);
    }

    @Override
    public void editSale(Sale s) {
        this.saveSale(s);
    }
}
