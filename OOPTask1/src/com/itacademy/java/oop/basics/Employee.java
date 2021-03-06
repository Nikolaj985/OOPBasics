package com.itacademy.java.oop.basics;

public class Employee {
    private String name;
    private String surname;
    private ContractType contractType;
    private String contractStartDate;
    private int salary;
    private String position;

    public Employee() {
    }

    public Employee(String name, String surname, ContractType contractType, String contractStartDate, int salary, String position) {
        this.name = name;
        this.surname = surname;
        this.contractType = contractType;
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ContractType getContractType() {
        return contractType;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contractType=" + contractType.getDisplayName() +
                ", contractStartDate='" + contractStartDate + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public int getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
