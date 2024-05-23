package org.example.observerpattern.weatherdata;

import java.util.Observable;

public class WeatherDataInternalImpl extends Observable {
    private float temp;
    private float humidity;
    private float pressure;

    public void setMeasurements(float temp, float humidity, float pressure){
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        measurementsChanged();
    }

    public void measurementsChanged(){
        setChanged();
        // Using the PULL Implementation as
        // the notifyObservers method
        // does not include a data object
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
