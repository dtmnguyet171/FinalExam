package com.vti.frontend;

import com.vti.backend.Example;
import com.vti.entity.Account;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Function {
    Example example = new Example();
    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("Mời bạn nhập vào Username");
        String username = Scannerutils.inputString();
        System.out.println("Mời bạn nhập vào email");
        String email = Scannerutils.emailString();
        System.out.println("Mời bạn nhập vào password");
        String password = Scannerutils.inputPassword();
        example.createAccount(username, email, password);
    }

    public void updateAccount(){
        System.out.println("Nhập vào Account  ID cần thay đổi thông tin");
        int accountId = Scannerutils.inputNumber();
        System.out.println("Nhập vào username mới");
        String username = Scannerutils.inputString();
        System.out.println("Mời bạn nhập vào email mới");
        String email = Scannerutils.emailString();
        System.out.println("Mời bạn nhập vào password mới");
        String password = Scannerutils.inputPassword();
        example.updateAccount(accountId,username,email,password);
    }

    public void deleteAccount(){
        System.out.println("Nhập vào Account ID cần xóa");
        int accountId = Scannerutils.inputNumber();
        example.deleteAccount(accountId);
    }

    public void findByEmail(){
        System.out.println("Nhập vào Email");
        String email = Scannerutils.emailString();
        Account account = example.findByEmail(email);
        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format("| id |    fullName     |       Email       |     passwword   |%n");
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(),
                    account.getEmail(), account.getPassword());
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
    }

    public void getAllAccount(){
        List<Account> accountList = example.getAllAccount();
        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format("| id |    fullName     |       Email       |     passwword   |%n");
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        for (Account account : accountList){
            System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(),
                    account.getEmail(), account.getPassword());
        }
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
    }

    public void login(){
        System.out.println("Email:");
        String email = Scannerutils.inputString();
        System.out.println("Mật khẩu: ");
        String password = Scannerutils.inputPassword();
        example.login(email,password);
    }
}
