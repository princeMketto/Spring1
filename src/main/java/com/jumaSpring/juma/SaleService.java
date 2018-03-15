package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;


public class SaleService {

    @Autowired
     SaleRepository repository;

    public void save(Sale sale) {
      //  System.out.println("Please save this:"+productname);
      //  repository.add(productname,cost);
        repository.add(sale);

    }

    public List<Sale> getAll() {
        List<Sale> list = repository.findAll();
        return  list;
    }

}
