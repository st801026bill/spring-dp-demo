package com.bill.composite1;

import com.bill.composite1.component.MenuComponent;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MenuClient {
    private final MenuComponent allMenus;

    public void printMenu() {
        allMenus.print();
    }
}
