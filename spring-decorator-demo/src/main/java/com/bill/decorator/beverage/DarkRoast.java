package com.bill.decorator.beverage;

import com.bill.decorator.IBeverage;

import java.math.BigDecimal;

public class DarkRoast extends IBeverage {

    private final BigDecimal cost = BigDecimal.valueOf(0.99);

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public BigDecimal cost() {
        return cost;
    }
}
