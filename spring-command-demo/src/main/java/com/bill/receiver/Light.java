package com.bill.receiver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Light {

    public void on() { log.info("Light: on!!"); }

    public void off() {
        log.info("Light: off!!");
    }
}
