package com.bill.command;

import com.bill.receiver.Stereo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StereoOnCommand implements Command{

    @Autowired
    private Stereo stereo;

    @Override
    public void execute() {
        stereo.on();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
