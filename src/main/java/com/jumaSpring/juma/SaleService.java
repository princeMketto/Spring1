package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;


public class SaleService {
    @Autowired
 SaleRepository repository;
    @Autowired
    Sale sale;

    public void save(String productname, BigDecimal cost) {
        repository.add(productname,cost);

    }

    public List<Sale> getAll() {
        List<Sale> list = repository.findAll();
        return  list;
    }
}
