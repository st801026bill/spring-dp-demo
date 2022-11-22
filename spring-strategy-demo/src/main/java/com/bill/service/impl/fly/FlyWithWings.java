package com.bill.service.impl.fly;

import com.bill.service.FlyBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        log.info("I'm flying");
    }
}
