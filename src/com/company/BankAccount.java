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
        System.out.println("Снято: " + sum + " сом со счета");
        amount-=sum;
        throw new LimitException("Недостаточно денег на счете", amount);
    }
    void withDrawBalance(){
        System.out.println("Снято: " + amount + " сом со счета");
        amount-=amount;
    }

}

