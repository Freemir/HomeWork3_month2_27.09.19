package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        System.out.println(amount + " сом на счете");
        return amount;
    }
    void deposit(double sum){
        amount = sum;
        System.out.println("Начисленно на счет: " + amount + " сом");
    }
    void withDraw(double sum) throws LimitException{
        if (amount<sum){
            throw new LimitException("Недостаточно денег на счете", amount);
        }
        amount -= sum;
        System.out.println("Снято: " + amount + " сом со счета");
    }

    void withdrawAccountBalance(){
        System.out.println("Снято: " + amount + " сом со счета");
        amount=(amount-amount);
    }
}
