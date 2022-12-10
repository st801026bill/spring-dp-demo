package com.bill.iterator1.client;

import com.bill.iterator1.iterator.Iterator;
import com.bill.iterator1.aggregate.Menu;
import com.bill.iterator1.aggregate.MenuItem;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class MenuClient {
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

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
