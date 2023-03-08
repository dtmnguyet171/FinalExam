package com.vti.entity;

import java.util.Date;

public class Newspaper extends Document{
    private Date releaseDate;

    public Newspaper(int id, String publisher, int amount, Date releaseDate) {
        super(id, publisher, amount);
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "id=" + id +
                ", publisher='" + publisher + '\'' +
                ", amount=" + amount +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
