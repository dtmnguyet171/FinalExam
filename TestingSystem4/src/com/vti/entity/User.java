package com.vti.entity;

public abstract class User {
    private String name;
    protected double salaryRatio;

    public User(String name, double salaryRatio) {
        this.name = name;
        this.salaryRatio = salaryRatio;
    }

    public abstract double calculatePay();

    public void displayInfor(){
        System.out.println("Tên: " + name);
        System.out.println("Hệ số lương: " + salaryRatio);
        System.out.println("Tổng lương: " + calculatePay());
    }
}
