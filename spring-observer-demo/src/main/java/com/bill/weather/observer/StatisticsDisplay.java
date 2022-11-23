package com.bill.weather.observer;

import com.bill.weather.subject.Subject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class StatisticsDisplay implements Observer, DisplayElement {
    private List<Float> tempList;
    private Subject weatherDate;

    public StatisticsDisplay(Subject weatherDate) {
        tempList = new ArrayList<Float>();
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float tmperature, float humidity, float pressure) {
        tempList.add(tmperature);
        display();
    }

    @Override
    public void display() {
        log.info(String.format("平均/最高/最低(℃) : %.1f/%.1f/%.1f", getAvgTemp(), getMaxTemp(), getMinTemp()));
    }

    private float getAvgTemp() {
        float sum = 0;
        for(float temp : tempList) {
            sum+=temp;
        }
        return sum/tempList.size();
    }

    private float getMaxTemp() {
        float max = 0;
        for(float temp : tempList) {
            if(temp>max)
                max = temp;
        }
        return max;
    }

    private float getMinTemp() {
        float min = 999;
        for(float temp : tempList) {
            if(temp<min)
                min = temp;
        }
        return min;
    }
}