package com.bill.adapter;

import com.bill.adaptee.Turkey;
import com.bill.target.Duck;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    @Override
    public void quack() {
        turkey.quack();
    }

    @Override
    public void fly() {
        for(int i=0; i<5; i++) {
            turkey.fly();
        }
    }
}
