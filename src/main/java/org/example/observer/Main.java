package org.example.observer;

public class Main {
    public static void main(String[] args){

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay =
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(0.5f,0.5f,0.5f);
        weatherData.setMeasurements(0.2f,0.2f,0.2f);

    }
}
