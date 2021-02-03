package com.itacademy.java.oop.basics;

public class TravelApplication {
    public static void main(String[] args) {
        Person agent = new Person("Agent", "Smith", "male", 45);
        Person alex = new Person("Alex", "Johnson", "male", 33);
        Person maria = new Person("Maria", "Smith", "female", 22);
        Person sonia = new Person("Sonia", "Johnson", "female", 25);
        Person kenya = new Person("Kenya", "Johnson", "female", 10);

        Person[] smiths = {agent, maria};
        Person[] johnsons = {alex, sonia, kenya};

        Vehicle mercedes = new Vehicle("200", "Mercedes", 20, 6.9);
        Vehicle prius = new Vehicle("Prius", "Toyota", 10, 3);

        TravelDestination superPlus = new TravelDestination("Super Travel", "Druskininkai", 150);
        TravelDestination superExtra = new TravelDestination("Super Extra", "Nida", 400);

        Family first = new Family(smiths, mercedes, superPlus);
        Family second = new Family(johnsons, prius, superExtra);

        TravelManager.travel(first);
        TravelManager.travel(second);
        second = TravelManager.changeDestination(second,superPlus); //Tikiuosi gerai supratau, kad sukuriau naują objektą ir priskiriau senajam.
        TravelManager.travel(second);
        first = TravelManager.changeDestination(first,superExtra);
        TravelManager.travel(first);
        TravelManager.printFamilyMembers(first);
        TravelManager.printFamilyMembers(second);


    }
}
