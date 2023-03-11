package com.vti.frontend;

import com.vti.entity.MyMath;
import com.vti.utils.Scannerutils;

import java.util.Scanner;

public class MyMathDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyMath myMath = new MyMath();
        while (true) {
            System.out.println("Nhập vào chức năng");
            System.out.println("1. Tính tổng 2 số int");
            System.out.println("2. Tính tổng 2 số byte");
            System.out.println("3. Tính tổng 2 số float");
            System.out.println("4. Thoát");
            int choose = Scannerutils.inputMinMax(1,4);
            switch (choose){
                case 1:
                    System.out.println("Nhập vào số thứ nhât");
                    int a = scanner.nextInt();
                    System.out.println("Nhập vào số thứ hai");
                    int b = scanner.nextInt();
                    System.out.println("Tổng hai số là: " + myMath.sum(a,b));
                    break;
                case 2:
                    System.out.println("Nhập vào số thứ nhât");
                    byte a1 = scanner.nextByte();
                    System.out.println("Nhập vào số thứ hai");
                    byte b1 = scanner.nextByte();
                    System.out.println("Tổng hai số là: " + myMath.sum(a1,b1));
                    break;
                case 3:
                    System.out.println("Nhập vào số thứ nhât");
                    float a2 = scanner.nextFloat();
                    System.out.println("Nhập vào số thứ hai");
                    float b2 = scanner.nextFloat();
                    System.out.println("Tổng hai số là: " + myMath.sum(a2,b2));
                    break;
                case 4:
                    return;
            }
        }
    }
}
