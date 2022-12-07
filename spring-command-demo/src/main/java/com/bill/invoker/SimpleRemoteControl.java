package com.bill.invoker;

import com.bill.command.Command;
import org.springframework.stereotype.Component;

@Component
public class SimpleRemoteControl {
    private Command slot;

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
