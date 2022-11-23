package com.bill.weather.observer;

import com.bill.weather.subject.Subject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float tmperature;
    private float humidity;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {
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
        log.info(String.format("目前狀況: 氣溫%.2f度，濕度%.2f%%", this.tmperature, this.humidity));
    }
}
