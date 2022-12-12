package com.bill;

import com.bill.state1.context.CandyMachine;

public class StateDemo1 {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(5);

        System.out.println("---1.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.turnCrank();

        System.out.println("---2.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.ejectQuarter();
        candyMachine.turnCrank();

        System.out.println("---3.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.ejectQuarter();

        System.out.println("---4.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();

        System.out.println("---5.剩餘糖果個數:"+ candyMachine.getCount());
    }
}
