package com.bill.iterator2.menu;

import java.util.ArrayList;
import java.util.Iterator;

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
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        //1. 不建立自己的反覆器，我們直接呼叫ArrayList的iterator()方法取得反覆器
        //return new PancakeHouseMenuIterator(menuItems);
        return menuItems.iterator();
    }
}
