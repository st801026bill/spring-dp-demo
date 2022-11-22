package com.bill.model.impl;

import com.bill.model.Duck;
import com.bill.service.impl.fly.FlyWithWings;
import com.bill.service.impl.quack.Quack;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void dispaly() {
        log.info("I am a Mallard duck");
    }
}
