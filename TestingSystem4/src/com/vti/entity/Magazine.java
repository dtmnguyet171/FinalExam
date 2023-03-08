package com.vti.entity;

public class Magazine extends Document{
    private int releaseNo;
    private int releaseMonth;

    public Magazine(int id, String publisher, int amount, int releaseNo, int releaseMonth) {
        super(id, publisher, amount);
        this.releaseNo = releaseNo;
        this.releaseMonth = releaseMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", amount=" + amount +
                ", releaseNo=" + releaseNo +
                ", releaseMonth=" + releaseMonth +
                '}';
    }
}
