package com.vti.entity;

public class Book extends Document{
    private String author;
    private int page;

    public Book(int id, String publisher, int amount, String author, int page) {
        super(id, publisher, amount);
        this.author = author;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", page=" + page +
                ", publisher='" + publisher + '\'' +
                ", amount=" + amount +
                '}';
    }

}
