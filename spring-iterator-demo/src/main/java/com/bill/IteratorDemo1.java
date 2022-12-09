package com.bill;

import com.bill.iterator1.client.MenuClient;
import com.bill.iterator1.menu.DinerMenu;
import com.bill.iterator1.menu.PancakeHouseMenu;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorDemo1 {
    public static void main(String[] args) {
        MenuClient menuClient = new MenuClient(new PancakeHouseMenu(), new DinerMenu());
        menuClient.printMenu();
    }
}
