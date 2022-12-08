package com.bill;

import com.bill.adaptee.Turkey;
import com.bill.adaptee.WildTurkey;
import com.bill.adapter.TurkeyAdapter;
import com.bill.target.Duck;
import com.bill.target.MallardDuck;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdapterDemo {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(duck);
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
