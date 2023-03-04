package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

public class Account {
    private int accountId;
    private String email;
    private String username;
    private String fullName;
    private Department departmentId;
    private Position positionId;
    private LocalDate createDate;

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentId=" + departmentId +
                ", positionId=" + positionId +
                ", createDate=" + createDate +
                '}';
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Department getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Department departmentId) {
        this.departmentId = departmentId;
    }

    public Position getPositionId() {
        return positionId;
    }

    public void setPositionId(Position positionId) {
        this.positionId = positionId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

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
