package org.example;

public class BankAccount {
    private int balance;

    BankAccount() {
        this.balance = 0;
    }

    BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient Balance");
        }
    }
}
