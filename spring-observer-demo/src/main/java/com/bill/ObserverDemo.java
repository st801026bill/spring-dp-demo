package com.bill;

import com.bill.weather.observer.CurrentConditionsDisplay;
import com.bill.weather.observer.ForecastDisplay;
import com.bill.weather.observer.StatisticsDisplay;
import com.bill.weather.subject.WeatherDataSubject;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ObserverDemo {
    public static void main(String[] args) {
        WeatherDataSubject weatherData = new WeatherDataSubject();
        new CurrentConditionsDisplay(weatherData);
        new ForecastDisplay(weatherData);
        new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(27.5f, 0.35f, 1);
    }
}
