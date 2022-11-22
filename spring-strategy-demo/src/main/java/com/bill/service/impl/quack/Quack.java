package com.bill.service.impl.quack;

import com.bill.service.FlyBehavior;
import com.bill.service.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        log.info("quack");
    }
}
