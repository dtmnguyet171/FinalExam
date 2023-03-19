package com.vti.entity;

public class KhoiThi {
    private String name;
    private String subject;

    public KhoiThi(String name) {
        this.name = name;
    }

    public KhoiThi(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        switch (this.name) {
            case "A":
                this.subject = "Toán, Lý, Hóa";
                break;
            case "B":
                this.subject = "Lý, Hóa, Sinh";
                break;
            case "C":
                this.subject = "Văn, Sử, Địa";
                break;
        }
        return this.subject;
    }

    @Override
    public String toString() {
        return "KhoiThi{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
