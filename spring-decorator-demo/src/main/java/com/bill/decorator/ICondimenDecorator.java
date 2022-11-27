package com.bill.decorator;

public abstract class ICondimenDecorator extends IBeverage {
    protected IBeverage beverage = null;
    public abstract String getDescription();
}
