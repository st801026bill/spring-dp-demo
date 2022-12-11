package com.bill.state2.state;

import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class SoldState implements State {

    private final CandyMachine candyMachine;

    @Override
    public void insertQuarter() {
        log.info("請稍候, 我們將給您一顆糖果...");
    }

    @Override
    public void ejectQuarter() {
        log.info("無法退幣，您已經轉動轉軸");
    }

    @Override
    public void turnCrank() {
        log.info("轉動2次也不會得到2顆糖果拉!");
    }

    @Override
    public void dispense() {
        candyMachine.releaseBall();
        if(candyMachine.getCount() > 0)
            candyMachine.setState(candyMachine.getNoQuarterState());
        else {
            log.info("糖果沒了，無法提供糖果!");
            candyMachine.setState(candyMachine.getSoldOutState());
        }

    }
}
