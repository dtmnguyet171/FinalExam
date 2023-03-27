package com.vti.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private Role role;
    private String username;
    private String password;
    private String email;
    private String dateOfBirth;
    private Department department;
}
