package com.bill.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Coffee extends CaffeineBeverage {
    @Override
    protected void brew() {
        log.info("用沸水沖泡咖啡");
    }

    @Override
    protected void addCondiments() {
        log.info("加糖和牛奶");
    }
}
