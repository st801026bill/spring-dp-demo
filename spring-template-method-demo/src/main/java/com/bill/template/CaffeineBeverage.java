package com.bill.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract protected void brew();
    abstract protected void addCondiments();

    private void boilWater() {
        log.info("煮沸水");
    }

    private void pourInCup() {
        log.info("倒進杯子");
    }
}
