package com.bill.receiver;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Stereo {

    public void on() { log.info("Stereo: on!!"); }

    public void off() {
        log.info("Stereo: off!!");
    }
}
