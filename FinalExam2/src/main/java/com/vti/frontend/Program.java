package com.vti.frontend;

import com.vti.entity.User;
import com.vti.utils.Scannerutils;

public class Program {
    public static void main(String[] args) {
        Function function = new Function();
        System.out.println("Đăng nhập");
        while (true){
            User user = function.login();
            if (user == null) {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng, mời nhập lại");
            } else {
                System.out.println("Welcome "+ user.getFullName());
                menu();
            }
        }
    }
    public static void menu(){
        Function function = new Function();
        while (true){
            System.out.println("Nhập vào chức năng");
            System.out.println("1. Nhập vào id project, sau đó in ra tất cả các employee & Manager trong project đó");
            System.out.println("2. Lấy ra tất cả Manager của các project");
            System.out.println("3. Thoát chương trình");
            int choose = Scannerutils.inputNumber(1,3);
            switch (choose){
                case 1:
                    function.userListInProject();
                    break;
                case 2:
                    function.getManager();
                    break;
                case 3:
                    return;
            }
        }
    }
}
