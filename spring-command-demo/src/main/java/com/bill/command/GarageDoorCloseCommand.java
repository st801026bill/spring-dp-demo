package com.bill.command;

import com.bill.receiver.GarageDoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GarageDoorCloseCommand implements Command{

    @Autowired
    private GarageDoor garageDoor;

    @Override
    public void execute() { garageDoor.off(); }

    @Override
    public void undo() {
        garageDoor.on();
    }
}
