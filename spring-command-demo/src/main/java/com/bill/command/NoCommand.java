package com.bill.command;

import com.bill.receiver.GarageDoor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NoCommand implements Command{

    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
