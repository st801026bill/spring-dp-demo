package com.bill.state1.state;

public interface State {
    //投入25分錢
    public void insertQuarter();
    //退出25分錢
    public void ejectQuarter();
    //轉動轉軸
    public void turnCrank();
    //發放糖果
    public void dispense();
}
