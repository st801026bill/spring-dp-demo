package com.bill.receiver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CeilingFan {

    private LEVEL level;
    public enum LEVEL {HIGH, MEDIUM, LOW, OFF};

    public void high() {
        level = LEVEL.HIGH;
        log.info("CeilingFan: high!!");
    }

    public void medium() {
        level = LEVEL.MEDIUM;
        log.info("CeilingFan: medium!!");
    }

    public void low() {
        level = LEVEL.LOW;
        log.info("CeilingFan: low!!");
    }

    public void off() {
        level = LEVEL.OFF;
        log.info("CeilingFan: off!!");
    }

    public LEVEL getSpeed() {
        return level;
    }
}
