package com.company;

public class LimitException extends Exception {
    private String message;
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    void getRemainingAmount(){
        System.out.println("На счете осталось: " + remainingAmount + " сом");
    }
}
