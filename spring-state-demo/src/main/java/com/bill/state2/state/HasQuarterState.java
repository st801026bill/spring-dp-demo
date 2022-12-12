package com.bill.state2.state;

import com.bill.state2.StateEnum;
import com.bill.state2.context.CandyMachine;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());   //3.增加亂數產生贏家

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
//        candyMachine.setState(candyMachine.getSoldState());
        //4. 判斷是否為贏家
        int winner = randomWinner.nextInt(10);
        if((winner==0) && (candyMachine.getCount()>1)) {
            candyMachine.setState(candyMachine.getState(StateEnum.WINNER));
        } else {
            candyMachine.setState(candyMachine.getState(StateEnum.SOLD));
        }
    }

    @Override
    public void dispense(CandyMachine candyMachine) {
        log.info("無法發放糖果");
    }
}
