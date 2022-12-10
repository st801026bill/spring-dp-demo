package com.bill.iterator2.iterator;

import com.bill.iterator2.aggregate.MenuItem;

import java.util.Iterator;

public class DinerMenuJdkIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuJdkIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    //2. 改成 import java.util.Iterator; 並實踐remove()方法
    @Override
    public void remove() {
        if(position <= 0)
            throw new IllegalStateException("無法執行remove()，請確認至少要一筆資料");
        if(items[position-1] != null) {
            for(int i=position-1; i<items.length-1; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
