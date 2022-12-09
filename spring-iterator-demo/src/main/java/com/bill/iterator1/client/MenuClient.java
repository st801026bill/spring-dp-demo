package com.bill.iterator1.client;

import com.bill.iterator1.iterator.Iterator;
import com.bill.iterator1.menu.DinerMenu;
import com.bill.iterator1.menu.MenuItem;
import com.bill.iterator1.menu.PancakeHouseMenu;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MenuClient {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        log.info("\n菜單\n----\n早餐");
        printMenu(pancakeIterator);
        log.info("\n晚餐");
        printMenu(dinerIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() +","+ menuItem.getPrice() +"--"+ menuItem.getDescription());
        }
    }
}
