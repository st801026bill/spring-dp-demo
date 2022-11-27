package com.bill.decorator.decorator;

import com.bill.decorator.IBeverage;
import com.bill.decorator.ICondimenDecorator;

import java.math.BigDecimal;

public class Whip extends ICondimenDecorator {
    private final String name = "Whip";
    final BigDecimal cost = BigDecimal.valueOf(0.1);

    public Whip(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(cost);
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", beverage.getDescription(), name);
    }
}
