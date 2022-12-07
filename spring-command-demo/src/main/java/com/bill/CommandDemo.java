package com.bill;

import com.bill.client.RemoteControlClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CommandDemo {
    @Autowired
    private RemoteControlClient client;

    @Bean
    public void demo1() {
        log.info("==== demo1");
        client.demo1();
    }

    @Bean
    public void demo2() {
        log.info("==== demo2");
        client.demo2();
    }

    @Bean
    public void demo3() {
        log.info("==== demo3");
        client.demo3();
    }

    @Bean
    public void demo4() {
        log.info("==== demo4");
        client.demo4();
    }
}
