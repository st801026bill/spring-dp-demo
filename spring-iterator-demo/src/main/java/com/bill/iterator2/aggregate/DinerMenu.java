package com.bill.iterator2.aggregate;

import com.bill.iterator2.iterator.DinerMenuJdkIterator;

import java.util.Iterator;

public class DinerMenu implements Menu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("素食三明治",   "生菜全麥吐司",           true,   2.99);
        addItem("招牌三明治",   "培根生菜全麥吐司",       false,  2.99);
        addItem("當日湯品",     "當日湯品(附番茄沙拉)",   false,  3.29);
        addItem("熱狗",         "熱狗+大亨堡",           false,  3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuJdkIterator(menuItems);
    }
}
