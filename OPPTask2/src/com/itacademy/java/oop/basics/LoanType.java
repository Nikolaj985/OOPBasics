package com.itacademy.java.oop.basics;

public enum LoanType {
    LEASING("leasing"), CONSUMER("consumer");

    private String loanType;

    LoanType(String loanType) {
        this.loanType = loanType;
    }

    public String getLoanType() {
        return loanType;
    }
}
