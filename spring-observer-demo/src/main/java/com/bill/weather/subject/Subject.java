package com.bill.weather.subject;

import com.bill.weather.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObsdervers();
}