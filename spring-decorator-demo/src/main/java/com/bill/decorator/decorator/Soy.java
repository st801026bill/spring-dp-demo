package com.bill.decorator.decorator;

import com.bill.decorator.IBeverage;
import com.bill.decorator.ICondimenDecorator;

import java.math.BigDecimal;

public class Soy extends ICondimenDecorator {
    private final String name = "Soy";
    final BigDecimal cost = BigDecimal.valueOf(0.15);

    public Soy(IBeverage beverage) {
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
