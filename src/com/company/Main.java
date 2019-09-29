package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount client = new BankAccount();
        client.deposit(10000.0);
        client.getAmount();
            try {
                while (true){
                    client.withDraw(6000.0);
                }
            } catch (LimitException e) {
                e.getRemainingAmount();
            }finally {
                client.getAmount();
                client.withdrawAccountBalance();
                client.getAmount();
                System.exit(0);
            }
    }
}
