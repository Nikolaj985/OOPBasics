package com.itacademy.java.oop.basics;

public class AccountApplication {


    public static void main(String[] args) {
    Account first = new Account("1" , "John", 100);
    Account second = new Account("2" , "Alex", 50);
    first.credit(20);
    first.credit(10);
        System.out.println(first.getBalance() );
    second.credit(10);
        System.out.println(second.getBalance() );
        first.debit(500);
        second.transferTo(first,70);
        first.debit(30);
        System.out.println(first.getBalance() );
        first.transferTo(second,10);
        System.out.println(first.getBalance() );
        System.out.println(second.getBalance() );
        System.out.println(first.toString() );
        System.out.println(second.toString() );

    }

}
