package com.bill.decorator.beverage;

import com.bill.decorator.IBeverage;

import java.math.BigDecimal;

public class Esoresso extends IBeverage {

    private final BigDecimal cost = BigDecimal.valueOf(1.99);

    public Esoresso() {
        description = "Expresso";
    }

    @Override
    public BigDecimal cost() {
        return cost;
    }
}
