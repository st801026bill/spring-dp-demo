package com.bill.iterator1.menu;

import com.bill.iterator1.iterator.Iterator;
import com.bill.iterator1.iterator.PancakeHouseMenuIterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
    ArrayList menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList();

        addItem("有氧煎餅早餐", "炒雞蛋煎餅+吐司",      true,   2.99);
        addItem("招牌煎餅早餐", "煎雞蛋+德國香腸",      false,  2.99);
        addItem("藍莓煎餅",     "新鮮藍莓煎餅",         true,   3.49);
        addItem("威化餅",       "威化餅(藍莓或草莓)",   true,   3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        com.bill.iterator1.menu.MenuItem menuItem = new com.bill.iterator1.menu.MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
