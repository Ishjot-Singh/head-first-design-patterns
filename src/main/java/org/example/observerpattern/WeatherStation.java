package org.example.observerpattern;

import org.example.observerpattern.display.CurrentConditionsDisplay;
import org.example.observerpattern.weatherdata.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(50, 20, 30);
        weatherData.setMeasurements(80, 50, 20);
        weatherData.setMeasurements(100, 120, 150);
    }
}
