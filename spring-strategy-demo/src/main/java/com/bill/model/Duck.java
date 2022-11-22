package com.bill.model;

import com.bill.service.FlyBehavior;
import com.bill.service.QuackBehavior;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public abstract void dispaly();

    public void performFly() { flyBehavior.fly(); }

    public void performQuack() { quackBehavior.quack(); }
}
