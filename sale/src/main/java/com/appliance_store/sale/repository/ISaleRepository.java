package com.appliance_store.sale.repository;

import com.appliance_store.sale.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISaleRepository extends JpaRepository<Sale,Long> {
}
