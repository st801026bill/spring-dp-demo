package com.bill.command;

import com.bill.receiver.CeilingFan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CeilingFanLowCommand implements Command{

    private CeilingFan.LEVEL preLevel;

    @Autowired
    private CeilingFan ceilingFan;

    @Override
    public void execute() {
        preLevel = ceilingFan.getSpeed();
        ceilingFan.low();
    }

    @Override
    public void undo() {
        switch(preLevel) {
            case HIGH:
                ceilingFan.high();
                break;
            case MEDIUM:
                ceilingFan.medium();
                break;
            case LOW:
                ceilingFan.low();
                break;
            case OFF:
                ceilingFan.off();
                break;
        }
    }
}
