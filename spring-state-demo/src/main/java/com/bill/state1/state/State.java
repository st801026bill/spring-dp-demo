package com.bill.state1.state;

import com.bill.state1.context.CandyMachine;

public interface State {
    //投入25分錢
    public void insertQuarter(CandyMachine candyMachine);
    //退出25分錢
    public void ejectQuarter(CandyMachine candyMachine);
    //轉動轉軸
    public void turnCrank(CandyMachine candyMachine);
    //發放糖果
    public void dispense(CandyMachine candyMachine);
}
