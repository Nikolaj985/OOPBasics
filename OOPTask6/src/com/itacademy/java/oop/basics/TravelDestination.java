package com.itacademy.java.oop.basics;

public class TravelDestination {
    private String name;
    private String city;
    private double distance;

    public TravelDestination() {
    }

    public TravelDestination(String name, String city, double distance) {
        this.name = name;
        this.city = city;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}
