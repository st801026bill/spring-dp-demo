package com.bill.template;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Tea extends CaffeineBeverage {
    @Override
    protected void brew() {
        log.info("用沸水沖泡茶葉");
    }

    @Override
    protected void addCondiments() {
        log.info("加檸檬");
    }
}
