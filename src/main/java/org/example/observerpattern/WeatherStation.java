package org.example.observerpattern;

import org.example.observerpattern.display.CurrentConditionsDisplay;
import org.example.observerpattern.display.CurrentConditionsDisplayInternalImpl;
import org.example.observerpattern.weatherdata.WeatherData;
import org.example.observerpattern.weatherdata.WeatherDataInternalImpl;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30);
        weatherData.setMeasurements(82, 70, 20);
        weatherData.setMeasurements(78, 90, 150);


        // Internal Implementation code
        WeatherDataInternalImpl weatherDataInternal = new WeatherDataInternalImpl();
        CurrentConditionsDisplayInternalImpl currentConditionsDisplayInternal = new CurrentConditionsDisplayInternalImpl(weatherDataInternal);
        weatherDataInternal.setMeasurements(80, 65, 30);
        weatherDataInternal.setMeasurements(82, 70, 20);
        weatherDataInternal.setMeasurements(78, 90, 150);
    }
}
