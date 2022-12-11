package com.bill.composite2.component;

import java.math.BigDecimal;
import java.util.Iterator;

public interface MenuComponent {
    //與合成節點(Menu)相關的方法，包括新增、移除、取得子節點
    default public void add(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    default public void remove(MenuComponent menuComponent) { throw new UnsupportedOperationException(); }
    default public MenuComponent getChild(int i) { throw new UnsupportedOperationException(); }

    //與葉節點(MenuItem)相關的方法，但其中有些也可以用再合成節點上
    default public String getName() { throw new UnsupportedOperationException(); }
    default public String getDescription() { throw new UnsupportedOperationException(); }
    default public boolean isVegetarian() { throw new UnsupportedOperationException(); }
    default public BigDecimal getPrice() { throw new UnsupportedOperationException(); }
    default public void print() { throw new UnsupportedOperationException(); }

    //1. 建立createIterator方法，強迫子類別繼承與實踐
    default public Iterator<MenuComponent> createIterator() { throw new UnsupportedOperationException();}
}
