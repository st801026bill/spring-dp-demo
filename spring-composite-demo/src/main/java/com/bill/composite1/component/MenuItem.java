package com.bill.composite1.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
@RequiredArgsConstructor
public class MenuItem implements MenuComponent {
    private final String name;
    private final String description;
    private final boolean vergetarian;
    private final BigDecimal price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vergetarian;
    }

    @Override
    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public void print() {
        String name = isVegetarian()? String.format("%s%s", "(素食)", getName()) : getName();
        log.info("{}, {} -- {}", name, getPrice(), getDescription());
    }
}
