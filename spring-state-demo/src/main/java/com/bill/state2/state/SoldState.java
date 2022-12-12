package com.bill.state2.state;

import com.bill.state2.StateEnum;
import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SoldState implements State {

    @Override
    public void insertQuarter(CandyMachine candyMachine) {
        log.info("請稍候, 我們將給您一顆糖果...");
    }

    @Override
    public void ejectQuarter(CandyMachine candyMachine) {
        log.info("無法退幣，您已經轉動轉軸");
    }

    @Override
    public void turnCrank(CandyMachine candyMachine) {
        log.info("轉動2次也不會得到2顆糖果拉!");
    }

    @Override
    public void dispense(CandyMachine candyMachine) {
        candyMachine.releaseBall();
        if(candyMachine.getCount() > 0)
            candyMachine.setState(candyMachine.getState(StateEnum.NO_QUARTER));
        else {
            log.info("糖果沒了，無法提供糖果!");
            candyMachine.setState(candyMachine.getState(StateEnum.SOLD_OUT));
        }

    }
}
