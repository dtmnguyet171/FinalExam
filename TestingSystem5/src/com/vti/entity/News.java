package com.vti.entity;

import com.vti.utils.Scannerutils;

import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publicDate;
    private String author;
    private String content;
    private float averageRate;
    Scanner scanner = new Scanner(System.in);
    @Override
    public void Display(){
        System.out.println(title);
        System.out.println(this.publicDate);
        System.out.println(this.content);
        System.out.println(this.author);
        System.out.println(this.averageRate);
    }

    @Override
    public float Calculate(){
        System.out.println("Mời bạn đnahs giá");
        int[] rates = new int[3];
        rates[0] = Scannerutils.inputMinMax(0,5);
        rates[1] = Scannerutils.inputMinMax(0,5);
        rates[2] = Scannerutils.inputMinMax(0,5);
        return (rates[0]+rates[1]+rates[2])/3.0f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public void setAverageRate(float averageRate) {
        this.averageRate = averageRate;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }
}
