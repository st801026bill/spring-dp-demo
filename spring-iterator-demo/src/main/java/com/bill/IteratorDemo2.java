package com.bill;

import com.bill.iterator2.menu.DinerMenu;
import com.bill.iterator2.menu.PancakeHouseMenu;
import com.bill.iterator2.client.MenuClient;
import com.bill.iterator2.menu.CafeMenu;
import lombok.extern.slf4j.Slf4j;

/**
 * 反覆器模式 : 讓我們能夠取得一個聚集內的每一個元素，而不需要此聚集將其實件方式暴露出來
 * 利用jdk內建 java.util.Iterator 改寫程式
 */
@Slf4j
public class IteratorDemo2 {
    public static void main(String[] args) {
        MenuClient menuClient = new MenuClient(new PancakeHouseMenu(), new DinerMenu(), new CafeMenu());
        menuClient.printMenu();
    }
}
