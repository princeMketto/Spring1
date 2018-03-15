package com.jumaSpring.juma;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sale {
    private String productname;

    private BigDecimal cost;

    private LocalDateTime time;

    public Sale() {
    }

    public Sale(String productname, BigDecimal cost, LocalDateTime time) {
        this.productname = productname;
        this.cost = cost;
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getProductname() {
        return productname;
    }

    public BigDecimal getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sale sale = (Sale) o;

        return time.equals(sale.time);
    }

    @Override
    public int hashCode() {
        return time.hashCode();
    }
}
