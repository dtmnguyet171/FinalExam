package com.vti.frontend;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Position;

import java.time.LocalDate;

public class Exercise1 {
    public static void main(String[] args) {
        question1();
        question2();
    }
    public static void question1(){
        Department department1 = new Department();
        Department department2 = new Department("Sale");
    }
    public static void question2(){
        Account account1 = new Account();
        Account account2 = new Account(2,"dtmnguyet171@gmail.com","dtmnguyet171","Đỗ Thị Minh Nguyệt");
        Position position = new Position();
        Account account3 = new Account(3,"user2@gmail.com","user3","User 3");
        Account account4 = new Account(4,"user4@gmail.com","user4","User 4",position, LocalDate.of(2023,3,10));
    }
    public static void question3(){
        Group group1 = new Group();
        String[] usernames = {"dtmnguyet171", "account2"};
        Account account1 = new Account(usernames[0]);
        Account account2 = new Account(usernames[1]);
        Account[] accounts = {account1,account2};
        Group group2 = new Group("Group 1",account1,LocalDate.of(2022,12,03), accounts);
        Group group3 = new Group("Group 3", account1,LocalDate.of(2019,04,03),usernames);
    }
}
