package com.jumaSpring.juma;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class SaleRepository {
    Set<Sale> list = new HashSet<>();

    public SaleRepository() {
    }

    public void add(Sale sale) {
        list.add(sale);
    }

    public List<Sale> findAll() {
        return list.stream().collect(Collectors.toList());
    }

}
