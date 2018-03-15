package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class SaleRepository {

    Sale sale;


    List<Sale> list ;

    public SaleRepository(Sale sale,List<Sale> list) {
        this.sale = sale;
        this.list = list;
    }

    public void add(Sale sale) {
        list.add(sale);
    }

    public List<Sale> findAll() {

        return list;
    }
    public void setAll(ArrayList<Sale> list){
        this.list = list;

    }
}
