package com.bill;

import com.bill.model.Duck;
import com.bill.model.impl.MallardDuck;
import com.bill.model.impl.ModelDuck;
import com.bill.service.impl.fly.FlyRocketPower;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StrategyDemo {
    public static void main(String[] args) {
        log.info("====MallardDuck");
        testMallardDuck();
        log.info("====ModelDuck");
        testModelDuck();
    }


    private static void testMallardDuck() {
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

    private static void testModelDuck() {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();

        duck.setFlyBehavior(new FlyRocketPower());
        duck.performFly();
    }
}
