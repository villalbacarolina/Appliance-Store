package com.appliance_store.sale.controller;

import com.appliance_store.sale.model.Sale;
import com.appliance_store.sale.service.ISaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {

    @Autowired
    private ISaleService saleService;

    @PostMapping("/save")
    public String saveSale(@RequestBody Sale s) {
        saleService.saveSale(s);
        return "Sale saved successfully.";
    }

    @GetMapping("/get")
    public List<Sale> getSales(){
        return saleService.getSales();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSale(@PathVariable Long id){
        saleService.deleteSale(id);
        return "Sale deleted successfully.";
    }

    @PutMapping("/edit/{id_originalSale}")
    public Sale editSale(@PathVariable Long id_originalSale,
                               @RequestBody Sale newSale){
        saleService.editSale(id_originalSale, newSale);

        return saleService.findSale(id_originalSale);
    }
}
