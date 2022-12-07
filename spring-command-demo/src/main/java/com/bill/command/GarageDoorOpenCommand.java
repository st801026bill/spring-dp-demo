package com.bill.command;

import com.bill.receiver.GarageDoor;
import com.bill.receiver.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GarageDoorOpenCommand implements Command{

    @Autowired
    private GarageDoor garageDoor;

    @Override
    public void execute() { garageDoor.on(); }

    @Override
    public void undo() {
        garageDoor.off();
    }
}
