package com.itacademy.java.oop.basics;

public class Family {
    private Person[] persons;
    private Vehicle vehicle;
    private TravelDestination travelDestination;

    public Family() {
    }

    public Family(Person[] persons, Vehicle vehicle, TravelDestination travelDestination) {
        this.persons = persons;
        this.vehicle = vehicle;
        this.travelDestination = travelDestination;
    }

    public TravelDestination getTravelDestination() {
        return travelDestination;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Person[] getPersons() {
        return persons;
    }

}
