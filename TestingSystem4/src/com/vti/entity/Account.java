package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    int accountId;
    String email;
    String username;
    String fullName;
    Department departmentId;
    Position positionId;
    LocalDate createDate;

    public Account() {
    }

    public Account(int accountId, String email, String username, String fullName) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
    }

    public Account(int accountId, String email, String username, String fullName, Position positionId, LocalDate createDate) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.positionId = positionId;
        this.createDate = LocalDate.now();
    }

    public Account(int accountId, String email, String username, String fullName, LocalDate createDate) {
        this.accountId = accountId;
        this.email = email;
        this.username = username;
        this.fullName = fullName;
        this.createDate = createDate;
    }

    public Account(String username) {
    }
}
