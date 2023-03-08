package com.vti.entity;

public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
        System.out.println("Hàm khởi tạo không tham số");
    }

    public CongNhan(int bac){
        this("",4);
    }

    public CongNhan(String fullName, int age){
        super(fullName,age);
    }
}
