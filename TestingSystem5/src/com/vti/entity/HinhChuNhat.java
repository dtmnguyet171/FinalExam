package com.vti.entity;

public abstract class HinhChuNhat {
    private float a;
    private float b;

    public HinhChuNhat(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public Float tinhChuVi(){
        System.out.println("Tính chu vi hình chữ nhật: " + (a+b)*2);
        return (a+b)*2;
    }

    public Float tinhDienTich(){
        System.out.println("Tính diện tích hình chữ nhật: " + a*b);
        return a*b;
    }
}
