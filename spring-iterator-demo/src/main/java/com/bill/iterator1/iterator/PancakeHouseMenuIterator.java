package com.bill.iterator1.iterator;

import com.bill.iterator1.menu.MenuItem;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator{

    private ArrayList menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position++;
        return menuItem;
    }
}
