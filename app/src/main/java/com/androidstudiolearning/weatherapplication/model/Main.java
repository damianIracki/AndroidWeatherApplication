package com.androidstudiolearning.weatherapplication.model;

public class Main {
    private double temp;
    private double FeelsLike;
    private double tempMin;
    private double tempMax;
    private double pressure;
    private int humidity;

    public Main(double temp, double feelsLike, double tempMin, double tempMax, int pressure, int humidity) {
        this.temp = temp;
        FeelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return FeelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        FeelsLike = feelsLike;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
