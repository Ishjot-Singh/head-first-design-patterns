package org.example.observerpattern.observer;

import org.example.observerpattern.weatherdata.HeatIndex;

public interface Observer {
    public void update(float temp, float humidity, float pressure, HeatIndex heatIndex);
}
