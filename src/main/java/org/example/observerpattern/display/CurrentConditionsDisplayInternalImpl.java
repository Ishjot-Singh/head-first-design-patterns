package org.example.observerpattern.display;

import org.example.observerpattern.weatherdata.WeatherDataInternalImpl;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayInternalImpl implements Observer, Display {
    Observable observable;
    private float temp;
    private float humidity;

    public CurrentConditionsDisplayInternalImpl(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDataInternalImpl){
            WeatherDataInternalImpl weatherData = (WeatherDataInternalImpl) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current Conditions Display:\nTemp:" + this.temp +"\nHumidity:" + this.humidity);
    }
}
