package com.itacademy.java.oop.basics;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private String personalNumber;
    private Loan[] loans;

    public void setLoans(Loan[] loans) {
        this.loans = loans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getLoans() {
        return loans;
    }
    public int getUserLoans(){
        int sum = 0;
        for (Loan loan: loans) {

            sum +=loan.getAmount();
            
        }
        return sum;
    }

    public Customer() {
    }

    public Customer(String name, String surname, int age, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
    }


    public String printAllInfo() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber='" + personalNumber + '\'' +
                ", loans=" + Arrays.toString(loans) +
                '}';
    }
}
