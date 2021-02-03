package com.itacademy.java.oop.basics;

public class LoansApplication {
    public static void main(String[] args) {

        Customer brian = new Customer();
        Customer john = new Customer("John",
                "Doe",
                50,
                "3333333333333");
        Loan[] userLoans = {new Loan(50, 5500, LoanType.LEASING, "2025/10/10"),
                new Loan(51, 7100, LoanType.CONSUMER, "2027/11/10")};
        john.setLoans(userLoans);
        System.out.println(john.getUserLoans());
        System.out.println(john.printAllInfo());

    }
}
