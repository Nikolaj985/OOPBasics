package com.itacademy.java.oop.basics;

public class TravelManager {

    static Family changeDestination(Family family, TravelDestination destination) {
        if (family.getTravelDestination() != destination) {

            Family newFamily  = new Family(family.getPersons(), family.getVehicle(),destination);
            return newFamily;
        }
        return family;
    }

    static void travel(Family family) {
        double needRefill = needRefuel(family);
        if (needRefill > 0) {
            System.out.println("You won't reach tour destination, You will need to refuel " + needRefill + " litres");
        } else {
            System.out.println("You'll reach your destination  with current fuel level.");
        }
    }

    static void printFamilyMembers(Family family){
        for (Person person: family.getPersons()) {
            System.out.println(person.toString());
        }
    }

    private static double needRefuel(Family family) {
        if (family.getTravelDestination().getDistance() > family.getVehicle().getFuel() * 100 / family.getVehicle().getConsumption()) {
            double temp =  Math.round((family.getTravelDestination().getDistance() - family.getVehicle().getFuel() * 100 / family.getVehicle().getConsumption())*family.getVehicle().getConsumption());
            return temp/100;
        }
        return 0;
    }
}
