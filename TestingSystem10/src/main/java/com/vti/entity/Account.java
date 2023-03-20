package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Account {
    private int accountId;
    private String fullName;
    public String email;
    private String password;
}
