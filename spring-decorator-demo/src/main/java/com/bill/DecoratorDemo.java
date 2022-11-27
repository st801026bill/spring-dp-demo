package com.bill;

import com.bill.decorator.IBeverage;
import com.bill.decorator.beverage.DarkRoast;
import com.bill.decorator.beverage.Esoresso;
import com.bill.decorator.beverage.HouseBlend;
import com.bill.decorator.decorator.Mocha;
import com.bill.decorator.decorator.Soy;
import com.bill.decorator.decorator.Whip;

public class DecoratorDemo {
    public static void main(String[] args) {
        //濃縮咖啡(不加料) 1.99
        IBeverage esoresso = new Esoresso();
        System.out.println(esoresso.getDescription() +" $"+ esoresso.cost());

        //深度烘焙咖啡(雙倍摩卡、奶泡) 0.99+ 0.2 + 0.2 + 0.1
        IBeverage darkroast = new DarkRoast();
        darkroast = new Mocha(darkroast);
        darkroast = new Mocha(darkroast);
        darkroast = new Whip(darkroast);
        System.out.println(darkroast.getDescription() +" $"+ darkroast.cost());

        //特調咖啡(雙倍摩卡、奶泡) 2.99+ 0.15 + 0.2 + 0.1
        IBeverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() +" $"+ houseBlend.cost());
    }
}
