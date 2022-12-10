package com.bill.iterator2.aggregate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    @Override
    public String toString() {
        return String.format("%s %s %s %s", name, description, vegetarian, price);
    }
}
