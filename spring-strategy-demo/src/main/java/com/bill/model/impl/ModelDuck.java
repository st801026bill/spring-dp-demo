package com.bill.model.impl;

import com.bill.model.Duck;
import com.bill.service.impl.fly.FlyNoWay;
import com.bill.service.impl.fly.FlyRocketPower;
import com.bill.service.impl.fly.FlyWithWings;
import com.bill.service.impl.quack.Quack;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void dispaly() {
        log.info("I am a Model duck");
    }
}
