package com.bill.iterator2.client;

import com.bill.iterator2.menu.Menu;
import com.bill.iterator2.menu.MenuItem;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MenuClient {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();

        log.info("\n菜單\n----\n早餐");
        printMenu(pancakeIterator);
        log.info("\n晚餐");
        printMenu(dinerIterator);
        log.info("\n咖啡");
        printMenu(cafeIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() +","+ menuItem.getPrice() +"--"+ menuItem.getDescription());
        }
    }
}
