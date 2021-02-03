package com.itacademy.java.oop.basics;

public class EmployeeManager {

    public static void main(String[] args) {

        Employee john = new Employee("John", "Bean", ContractType.FULL_TIME, "10/10/2010", 1000, "Manager"  ) ;
        System.out.println(john.toString());
    }
}
