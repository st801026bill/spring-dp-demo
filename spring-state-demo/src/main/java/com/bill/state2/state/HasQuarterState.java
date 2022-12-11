package com.bill.state2.state;

import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
@RequiredArgsConstructor
public class HasQuarterState implements State {
    private Random randomWinner = new Random(System.currentTimeMillis());   //3.增加亂數產生贏家
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
//        candyMachine.setState(candyMachine.getSoldState());
        //4. 判斷是否為贏家
        int winner = randomWinner.nextInt(10);
        if((winner==0) && (candyMachine.getCount()>1)) {
            candyMachine.setState(candyMachine.getWinnerState());
        } else {
            candyMachine.setState(candyMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        log.info("無法發放糖果");
    }
}
