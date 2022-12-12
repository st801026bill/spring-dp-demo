package com.bill.state1.state;

import com.bill.state1.StateEnum;
import com.bill.state1.context.CandyMachine;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HasQuarterState implements State {

    @Override
    public void insertQuarter(CandyMachine candyMachine) {
        log.info("您無法再投入硬幣");
    }

    @Override
    public void ejectQuarter(CandyMachine candyMachine) {
        log.info("已退幣");
        candyMachine.setState(candyMachine.getState(StateEnum.NO_QUARTER));
    }

    @Override
    public void turnCrank(CandyMachine candyMachine) {
        log.info("轉動中...");
        candyMachine.setState(candyMachine.getState(StateEnum.SOLD));
    }

    @Override
    public void dispense(CandyMachine candyMachine) {
        log.info("無法發放糖果");
    }
}
