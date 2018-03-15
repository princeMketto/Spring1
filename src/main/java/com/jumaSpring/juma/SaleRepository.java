package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SaleRepository {
    @Autowired
    Sale sale;


    List<Sale> list;

    public SaleRepository(Sale sale,List<Sale> list) {
        this.sale = sale;
        this.list = list;
    }

    public void add(String productname, BigDecimal cost) {
         list = new ArrayList<Sale>();
        LocalTime time = LocalTime.now();
        sale.setProductname(productname);
        sale.setCost(cost);
        sale.setTime(time);
        list.add(sale);
    }

    public List<Sale> findAll() {

        return list;
    }
}
