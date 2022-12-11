package com.bill.state1.state;

import com.bill.state1.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HasQuarterState implements State {

    private final CandyMachine candyMachine;

    @Override
    public void insertQuarter() {
        log.info("您無法再投入硬幣");
    }

    @Override
    public void ejectQuarter() {
        log.info("已退幣");
        candyMachine.setState(candyMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        log.info("轉動中...");
        candyMachine.setState(candyMachine.getSoldState());
    }

    @Override
    public void dispense() {
        log.info("無法發放糖果");
    }
}
