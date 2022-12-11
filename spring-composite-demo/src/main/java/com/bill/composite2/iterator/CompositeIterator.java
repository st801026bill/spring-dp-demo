package com.bill.composite2.iterator;

import com.bill.composite2.component.Menu;
import com.bill.composite2.component.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    Stack<Iterator> stack = new Stack();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty())
            return false;

        Iterator<MenuComponent> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if(!hasNext()) return null;

        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent component = iterator.next();
        if(component instanceof Menu) {
            stack.push(component.createIterator());
        }
        return component;
    }
}
