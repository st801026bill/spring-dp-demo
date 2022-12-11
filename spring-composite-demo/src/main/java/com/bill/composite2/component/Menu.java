package com.bill.composite2.component;

import com.bill.composite2.iterator.CompositeIterator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Iterator;

@Slf4j
@RequiredArgsConstructor
public class Menu implements MenuComponent {
    ArrayList<MenuComponent> menuComponents = new ArrayList();
    private final String name;
    private final String description;

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent) menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        log.info("{}, {}", getName(), getDescription());
        log.info("---------------------------------");

        //重要!! call sub menu or sub item
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }

    //2.實做一個新的反覆器類別CompositeIterator，該反覆器知道如何在合成節點內進行反覆
    @Override
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
