package com.bill;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonDemo {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        log.info(String.valueOf(instance1 == instance2));

        ThreadSafeSingleton safeInstance1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton safeInstance2 = ThreadSafeSingleton.getInstance();
        log.info(String.valueOf(safeInstance1 == safeInstance2));
    }
}
