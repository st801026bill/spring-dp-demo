package com.bill.composite2;

import com.bill.composite2.component.MenuComponent;
import lombok.RequiredArgsConstructor;

import java.util.Iterator;

@RequiredArgsConstructor
public class MenuClient {
    private final MenuComponent allMenus;

    public void printMenu() {
        allMenus.print();
    }

    //6.
    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.print("\n素食菜單\n----\n");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            //只有MenuItem的print()可以被呼叫，而Menu的不行(因為會throw UnsupportedOperationException())
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
