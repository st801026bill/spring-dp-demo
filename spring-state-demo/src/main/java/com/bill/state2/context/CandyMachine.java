package com.bill.state2.context;

import com.bill.state2.state.*;

public class CandyMachine {
    //記錄所有的狀態
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;  //1. 增加winnerState狀態

    State state = soldOutState; //預設是沒有裝糖果的
    int count = 0;  //記錄裝有多少顆糖果，預設是沒有的

    public CandyMachine(int numberCandies) {
        soldOutState    = new SoldOutState(this);
        noQuarterState  = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState       = new SoldState(this);
        winnerState     = new WinnerState(this);

        this.count = numberCandies;
        state = numberCandies > 0? noQuarterState:soldOutState;
    }

    //投入25分錢
    public void insertQuarter() {
        state.insertQuarter();
    }

    //退出25分錢
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //轉動轉軸
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("糖果釋出，請稍候...");
        if(count != 0) {
            count--;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() { return winnerState; }

    public int getCount() {
        return count;
    }

}
