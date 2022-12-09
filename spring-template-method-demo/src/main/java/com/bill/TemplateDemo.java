package com.bill;

import com.bill.template.Coffee;
import com.bill.template.CoffeeWithHook;
import com.bill.template.Tea;

public class TemplateDemo {
    public static void main(String[] args) {
        templateDemo();
        templateDemoHook();
    }

    private static void templateDemo() {
        Tea tea = new Tea();
        tea.prepareRecipe();

        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    private static void templateDemoHook() {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();
    }
}
