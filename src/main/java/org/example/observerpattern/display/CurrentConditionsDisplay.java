package org.example.observerpattern.display;

import org.example.observerpattern.observer.Observer;
import org.example.observerpattern.subject.Subject;
import org.example.observerpattern.weatherdata.WeatherData;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temp;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current Conditions Display:\nTemp:" + this.temp +"\nHumidity:" + this.humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
