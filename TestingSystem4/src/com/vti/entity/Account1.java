package com.vti.entity;

public class Account1 {
    String id;
    String name;
    int balance;

    public Account1(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return (this.balance+=amount);
    }

    public int debit(int amount) {
        return (this.balance-=amount);
    }

    public void transferTo(Account1 account, int amount) {
        account.balance += amount;
    }

    @Override
    public String toString() {
        return "Account1{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
