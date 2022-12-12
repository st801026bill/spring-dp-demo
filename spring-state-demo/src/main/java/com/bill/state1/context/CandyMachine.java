package com.bill.state1.context;

import com.bill.state1.StateEnum;
import com.bill.state1.state.*;

public class CandyMachine {
    //記錄所有的狀態
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;

    State state;
    int count = 0;  //記錄裝有多少顆糖果，預設是沒有的

    public CandyMachine(int numberCandies) {
        soldOutState    = new SoldOutState();
        noQuarterState  = new NoQuarterState();
        hasQuarterState = new HasQuarterState();
        soldState       = new SoldState();

        this.count = numberCandies;
        state = numberCandies > 0? noQuarterState:soldOutState;
    }

    //投入25分錢
    public void insertQuarter() {
        state.insertQuarter(this);
    }

    //退出25分錢
    public void ejectQuarter() {
        state.ejectQuarter(this);
    }

    //轉動轉軸
    public void turnCrank() {
        state.turnCrank(this);
        state.dispense(this);
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

    public State getState(StateEnum stateEnum) {
        switch (stateEnum) {
            case HAS_QUARTER :
                return hasQuarterState;
            case NO_QUARTER :
                return noQuarterState;
            case SOLD_OUT :
                return soldOutState;
            case SOLD :
                return soldState;
            default:
                throw new NullPointerException();
        }
    }

//    public State getSoldOutState() {
//        return soldOutState;
//    }
//
//    public State getNoQuarterState() {
//        return noQuarterState;
//    }
//
//    public State getHasQuarterState() {
//        return hasQuarterState;
//    }
//
//    public State getSoldState() {
//        return soldState;
//    }

    public int getCount() {
        return count;
    }

}
