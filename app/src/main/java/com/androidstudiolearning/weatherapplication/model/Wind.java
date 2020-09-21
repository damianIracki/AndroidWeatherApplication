package com.androidstudiolearning.weatherapplication.model;

public class Wind {
    private double speed;
    private double degree;
    private double gust;

    public Wind(double speed, double degree, double gust) {
        this.speed = speed;
        this.degree = degree;
        this.gust = gust;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}
