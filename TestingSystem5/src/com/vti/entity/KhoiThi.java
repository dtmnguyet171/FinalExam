package com.vti.entity;

public class KhoiThi {
    private String name;
    private String subject;

    public KhoiThi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        switch (this.name) {
            case "A":
                this.subject = "Toán, Lý, Hóa";
            case "B":
                this.subject = "Lý, Hóa, Sinh";
            case "C":
                this.subject = "Văn, Sử, Địa";
        }
        return this.subject;
    }
}
