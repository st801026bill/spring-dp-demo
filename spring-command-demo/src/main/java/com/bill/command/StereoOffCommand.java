package com.bill.command;

import com.bill.receiver.Light;
import com.bill.receiver.Stereo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StereoOffCommand implements Command{

    @Autowired
    private Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
