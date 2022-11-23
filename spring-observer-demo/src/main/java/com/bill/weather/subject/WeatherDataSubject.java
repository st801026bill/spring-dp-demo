package com.bill.weather.subject;

import com.bill.weather.observer.Observer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class WeatherDataSubject implements Subject {

    private float temperature;
    private float humidity;
    private float preasure;

    private List<Observer> observers;

    public WeatherDataSubject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObsdervers() {
        for(Observer o: observers) {
            o.update(temperature, humidity, preasure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float preasure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.preasure = preasure;
        notifyObsdervers();
    }
}
