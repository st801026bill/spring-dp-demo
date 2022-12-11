package com.bill.composite2.component;

import com.bill.composite2.iterator.NullIterator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Iterator;

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

    //3.回傳NullIterator
    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
