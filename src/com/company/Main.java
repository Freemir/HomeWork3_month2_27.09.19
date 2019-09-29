package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.deposit(10000.0);
        client.getAmount();
        while (true) {
            try {
                client.withDraw(6000.0);
            } catch (LimitException e) {
                e.getRemainingAmount();
                client.withDrawBalance();
                client.getAmount();
            }
            finally {
                System.exit(0);
            }
        }
    }
}
