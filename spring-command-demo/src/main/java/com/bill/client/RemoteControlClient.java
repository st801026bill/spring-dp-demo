package com.bill.client;

import com.bill.command.*;
import com.bill.invoker.RemoteControl;
import com.bill.invoker.SimpleRemoteControl;
import com.bill.receiver.GarageDoor;
import com.bill.receiver.Light;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class RemoteControlClient {
    // invoker
    @Autowired
    private SimpleRemoteControl simpleRemote;
    @Autowired
    private RemoteControl remote;

    // command
    @Autowired
    private LightOnCommand lightOn;
    @Autowired
    private LightOffCommand lightOff;
    @Autowired
    private GarageDoorOpenCommand garageDoorOpen;
    @Autowired
    private GarageDoorCloseCommand garageDoorClose;
    @Autowired
    private StereoOnCommand stereoOn;
    @Autowired
    private StereoOffCommand stereoOff;
    @Autowired
    private CeilingFanHighCommand ceilingFanHigh;
    @Autowired
    private CeilingFanMediumCommand ceilingFanMedium;
    @Autowired
    private CeilingFanLowCommand ceilingFanLow;
    @Autowired
    private CeilingFanOffCommand ceilingFanOff;

    @Autowired
    Light light;

    public void demo1() {
        simpleRemote.setCommand(lightOn);
        simpleRemote.buttonPressed();

        simpleRemote.setCommand(garageDoorOpen);
        simpleRemote.buttonPressed();
    }

    public void demo2() {
        remote.setCommand(0, lightOn, lightOff);
        remote.setCommand(1, garageDoorOpen, garageDoorClose);
        remote.setCommand(2, stereoOn, stereoOff);

        remote.onCommandPushed(0);
        remote.offCommandPushed(0);
        remote.onCommandPushed(1);
        remote.offCommandPushed(1);
        remote.onCommandPushed(2);
        remote.offCommandPushed(2);

        remote.undoButtonPushed();
    }

    public void demo3() {
        remote.setCommand(0, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(2, ceilingFanLow, ceilingFanOff);

        remote.onCommandPushed(0);
        remote.offCommandPushed(0);
        remote.undoButtonPushed();

        remote.onCommandPushed(1);
        remote.undoButtonPushed();
    }

    public void demo4() {
        Command[] partyOn  = {lightOn, stereoOn, ceilingFanHigh};
        Command[] partyOff = {lightOff, stereoOff, ceilingFanOff};

        MacroCommand partyOnMarco = new MacroCommand(partyOn);
        MacroCommand partyOffMarco = new MacroCommand(partyOff);

        remote.setCommand(0, partyOnMarco, partyOffMarco);
        remote.onCommandPushed(0);
        remote.offCommandPushed(0);
    }

}
