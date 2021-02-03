package com.itacademy.java.oop.basics;

public class Account {

    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
       return balance +=amount;
    }
    public int debit(int amount){
        if(amount>balance){
            System.out.println("Amount exceeded!");
            return balance;
        }
        return balance -=amount;
    }
    public int transferTo(Account another, int amount){
        if(amount>balance){
            System.out.println("Amount exceeded!");
            return balance;
        }
        another.credit(amount);
        return debit(amount);
    }

    @Override
    public String toString() {
        return "Account[" +
                "id=" + id  +
                ", name=" + name  +
                ", balance=" + balance +
                ']';
    }
}
