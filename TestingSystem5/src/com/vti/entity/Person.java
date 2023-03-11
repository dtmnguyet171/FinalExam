package com.vti.entity;

import java.util.Date;

public abstract class Person {
    protected String name;
    protected Gender gender;
    protected Date birthDate;
    protected String address;

    public abstract void inputInfo();

    public abstract void showInfo();

    public Person() {
    }

    public Person(String name, Gender gender, Date birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
