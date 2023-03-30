package com.vti.frontend;

import com.vti.backend.controller.UserController;
import com.vti.entity.User;
import com.vti.utils.Scannerutils;

import java.util.List;

public class Function {
    UserController controller = new UserController();
    public User login(){
        System.out.println("Email: ");
        String email = Scannerutils.emailString();
        System.out.println("Password: ");
        String password = Scannerutils.inputPassword();
        return controller.login(email,password);
    }
    public void userListInProject(){
        System.out.println("Nhập vào projectId cần tìm: ");
        int projectId = Scannerutils.inputNumber();
        List<User> userList = controller.userListInProject(projectId);
        System.out.println("Danh sách user của project " + projectId);
        String leftAlignFormat = "| %-3s | %-20s | %-20s |%n";
        System.out.format("+-----+----------------------+----------------------+%n");
        System.out.format("|  id |       fullname       |         email        |%n");
        System.out.format("+-----+----------------------+----------------------+%n");
        for (User user : userList){
            System.out.format(leftAlignFormat,user.getId(),user.getFullName(),user.getEmail());
        }
        System.out.format("+-----+----------------------+----------------------+%n");
    }
    public void getManager(){
        List<User> userList = controller.getManager();
        String leftAlignFormat = "| %-3s | %-20s | %-20s |%n";
        System.out.format("+-----+----------------------+----------------------+%n");
        System.out.format("|  id |       fullname       |         email        |%n");
        System.out.format("+-----+----------------------+----------------------+%n");
        for (User user : userList){
            System.out.format(leftAlignFormat,user.getId(),user.getFullName(),user.getEmail());
        }
        System.out.format("+-----+----------------------+----------------------+%n");
    }
}
