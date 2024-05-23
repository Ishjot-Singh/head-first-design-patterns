package org.example.observerpattern.weatherdata;

import org.example.observerpattern.observer.Observer;
import org.example.observerpattern.subject.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers;
    private float temp;
    private float humidity;
    private float pressure;

    private HeatIndex heatIndex;

    public WeatherData(){
        observers = new ArrayList();
        heatIndex = new HeatIndex();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int indexOfObserver = observers.indexOf(o);
        if(indexOfObserver >= 0) {
            observers.remove(indexOfObserver);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observers.size(); i++){
            Observer obj = (Observer) observers.get(i);
            obj.update(temp, humidity, pressure, heatIndex);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
