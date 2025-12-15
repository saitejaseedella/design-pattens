package org.example.observer;

import org.example.observer.interafce.DisplayElements;
import org.example.observer.interafce.Observer;

public class CurrentConditionDisplay implements DisplayElements, Observer {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        weatherData.registerObserver(this);

    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
