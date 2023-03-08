package com.vti.entity;

public class Document {
    protected int id;
    protected String publisher;
    protected int amount;

    public Document(int id, String publisher, int amount) {
        this.id = id;
        this.publisher = publisher;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Document() {
    }
}
