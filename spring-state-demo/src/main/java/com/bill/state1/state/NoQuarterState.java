package com.bill.state1.state;

import com.bill.state1.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class NoQuarterState implements State {

    private final CandyMachine candyMachine;

    @Override
    public void insertQuarter() {
        log.info("您投入了25分錢");
        candyMachine.setState(candyMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        log.info("您尚未投入了25分錢");
    }

    @Override
    public void turnCrank() {
        log.info("轉動開關，但您尚未投入硬幣");
    }

    @Override
    public void dispense() {
        log.info("您需要先投幣");
    }
}
