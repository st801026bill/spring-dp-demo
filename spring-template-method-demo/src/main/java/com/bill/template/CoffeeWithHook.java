package com.bill.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    protected void brew() {
        System.out.println("用沸水沖泡咖啡");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加糖和牛奶");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if("yes".equals(answer))
            return true;
        else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("請問需要糖和牛奶嗎?(yes/no)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch(IOException e) {
            e.printStackTrace();
        }
        if(answer == null)
            return "no";
        return answer;
    }
}
