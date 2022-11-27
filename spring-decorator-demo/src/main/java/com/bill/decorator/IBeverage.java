package com.bill.decorator;

import java.math.BigDecimal;

public abstract class IBeverage {
    public String description = null;

    public String getDescription() {
        return description;
    }
    public abstract BigDecimal cost();
}
