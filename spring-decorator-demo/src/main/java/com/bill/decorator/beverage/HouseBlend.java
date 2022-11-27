package com.bill.decorator.beverage;

import com.bill.decorator.IBeverage;

import java.math.BigDecimal;

public class HouseBlend extends IBeverage {

    private final BigDecimal cost = BigDecimal.valueOf(2.99);

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public BigDecimal cost() {
        return cost;
    }
}
