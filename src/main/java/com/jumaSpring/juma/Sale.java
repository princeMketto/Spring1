package com.jumaSpring.juma;

import java.math.BigDecimal;
import java.time.LocalTime;

public class Sale {
    private String productname;
    private BigDecimal cost;
    private LocalTime time;

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getProductname() {
        return productname;
    }

    public void setTime(LocalTime time) {

        this.time = time;
    }



    public BigDecimal getCost() {
        return cost;
    }

    public LocalTime getTime() {
        return time;
    }
}
