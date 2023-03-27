package com.vti.frontend;

import com.vti.backend.controller.AccountController;
import com.vti.entity.Account;
import com.vti.utils.Scannerutils;

import java.util.List;
import java.util.Scanner;

public class Function {
    AccountController controller = new AccountController();
    Scanner scanner = new Scanner(System.in);
    public void createAccount(){
        System.out.println("Mời bạn nhập vào Username");
        String username = Scannerutils.inputString();
        System.out.println("Mời bạn nhập vào email");
        String email = Scannerutils.emailString();
        System.out.println("Mời bạn nhập vào password");
        String password = Scannerutils.inputPassword();
        controller.createAccount(username, email, password);
    }

    public void updateAccount(){
        System.out.println("Nhập vào Account  ID cần thay đổi thông tin");
        int accountId = Scannerutils.inputNumber();
        System.out.println("Nhập vào password cũ");
        String oldPassword = Scannerutils.inputPassword();
        System.out.println("Mời bạn nhập vào password mới");
        String newPassword = Scannerutils.inputPassword();
        controller.updateAccount(accountId,oldPassword, newPassword);
    }

    public void deleteAccount(){
        System.out.println("Nhập vào Account ID cần xóa");
        int accountId = Scannerutils.inputNumber();
        controller.deleteAccount(accountId);
    }

    public void findByEmail(){
        System.out.println("Nhập vào Email");
        String email = Scannerutils.inputString();
        List<Account> accountList = controller.findByEmail(email);
        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format("| id |    fullName     |       Email       |      Password   |%n");
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        for (Account account : accountList){
            System.out.format(leftAlignFormat, account.getAccountId(), account.getFullName(),
                    account.getEmail(), account.getPassword());
        }
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
    }

    public void getAllAccount(){
        List<Account> accountList = controller.getAllAccount();
        String leftAlignFormat = "| %-3s| %-15s | %-17s | %-15s |%n";
        System.out.format("+----+-----------------+-------------------+-----------------+%n");
        System.out.format("| id |    fullName     |       Email       |     password   |%n");
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
        if (controller.login(email,password)){
            System.out.println("Đăng nhập thành công");
        } else {
            System.out.println("Đăng nhập thất bại");
        }
    }
}
