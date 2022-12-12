package com.bill.state2.state;

import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldOutState implements State {

    @Override
    public void insertQuarter(CandyMachine candyMachine) {
        log.info("糖果已經賣完，無法投入硬幣");
    }

    @Override
    public void ejectQuarter(CandyMachine candyMachine) {
        log.info("無法退幣，您尚未投入硬幣");
    }

    @Override
    public void turnCrank(CandyMachine candyMachine) {
        log.info("糖果已經賣完...");
    }

    @Override
    public void dispense(CandyMachine candyMachine) {
        log.info("無法發放糖果");
    }
}
