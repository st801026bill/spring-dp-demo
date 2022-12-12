package com.bill.state2.state;

import com.bill.state2.StateEnum;
import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoQuarterState implements State {

    @Override
    public void insertQuarter(CandyMachine candyMachine) {
        log.info("您投入了25分錢");
        candyMachine.setState(candyMachine.getState(StateEnum.HAS_QUARTER));
    }

    @Override
    public void ejectQuarter(CandyMachine candyMachine) {
        log.info("您尚未投入了25分錢");
    }

    @Override
    public void turnCrank(CandyMachine candyMachine) {
        log.info("轉動開關，但您尚未投入硬幣");
    }

    @Override
    public void dispense(CandyMachine candyMachine) {
        log.info("您需要先投幣");
    }
}
