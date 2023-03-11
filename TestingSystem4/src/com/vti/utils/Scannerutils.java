package com.vti.utils;

import java.util.Scanner;

public class Scannerutils {
    static Scanner scanner = new Scanner(System.in);
    // Tạo 1 method để nhập vào một chuỗi bất kỳ
    public static String inputString(){
        String string = scanner.nextLine();
        return string;
    }
    // Tạo một method để nhập vào một số nguyên dương
    public static int inputNumber(){
        int number = Integer.parseInt(scanner.nextLine());
        while (number<=0){
            System.out.println("Mời bạn nhập lại");
            number = Integer.parseInt(scanner.nextLine());
        }
        return number;
    }
    // Bài tập:
    // 1. Thay thế các Scanner ở các class khác bằng phương thức trong class utils
    // 2. Tạo 1 method nhập vào đúng định dạng email
    public static String emailString(){
        String email = scanner.nextLine();
        while (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z0-9.-]+$")) {
            System.out.println("Mời bạn nhập lại");
            email = scanner.nextLine();
        };
        return email;
    }
    // 3. Tạo 1 method nhập vào 1 số min và max do người dùng truyền vào
    public static int inputMinMax(int min, int max) {
        int a = scanner.nextInt();
        while (a<min || a>max){
            System.out.println("Mời bạn nhập lại");
            a = scanner.nextInt();
        }
        return a;
    }
    // 4. Tạo method nhập vào chuỗi là password, chứa 6-12 ký tự
    public static String inputPasswword(){
        String password = scanner.nextLine();
        while (password.length()<6 || password.length()>12){
            System.out.println("Mời bạn nhập lại");
            password = scanner.nextLine();
        }
        return password;
    }
}
