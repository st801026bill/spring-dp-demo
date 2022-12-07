package com.bill.command;

import com.bill.receiver.Light;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LightOnCommand implements Command{

    @Autowired
    private Light light;

    @Override
    public void execute() { light.on(); }

    @Override
    public void undo() {
        light.off();
    }
}
