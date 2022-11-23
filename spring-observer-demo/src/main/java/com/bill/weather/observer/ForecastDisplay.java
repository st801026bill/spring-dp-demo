package com.bill.weather.observer;

import com.bill.weather.subject.Subject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ForecastDisplay implements Observer, DisplayElement {
    private float tmperature;
    private float humidity;
    private Subject weatherDate;

    public ForecastDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float tmperature, float humidity, float pressure) {
        this.tmperature = tmperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        if(humidity >= 80f)
            log.info("天氣預測 : 全台有雨");
        if(humidity < 80f && humidity >= 30f)
            log.info("天氣預測 : 晴時多雲偶陣雨");
        if(humidity <30f)
            log.info("天氣預測 : 晴天");
    }
}