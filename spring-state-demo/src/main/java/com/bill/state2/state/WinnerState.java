package com.bill.state2.state;

import com.bill.state2.context.CandyMachine;
import lombok.RequiredArgsConstructor;

//2. 實做WinnerState
@RequiredArgsConstructor
public class WinnerState implements State {
    private final CandyMachine candyMachine;

    @Override
    public void insertQuarter() {
        System.out.println("請稍候, 我們將給您一顆糖果...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("無法退幣，您已經轉動轉軸");
    }

    @Override
    public void turnCrank() {
        System.out.println("轉動2次也不會得到2顆糖果拉!");
        //candyMachine.setState(candyMachine);
    }

    @Override
    public void dispense() {
        System.out.println("恭喜你! 您得到2顆糖果!!");
        candyMachine.releaseBall();
        if(candyMachine.getCount() == 0)
            candyMachine.setState(candyMachine.getSoldOutState());
        else {
            candyMachine.releaseBall();
            if(candyMachine.getCount() > 0)
                candyMachine.setState(candyMachine.getNoQuarterState());
            else {
                System.out.println("糖果賣完了...");
                candyMachine.setState(candyMachine.getSoldOutState());
            }
        }
    }
}