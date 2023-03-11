package com.vti.frontend;

import com.vti.entity.Contact;
import com.vti.entity.VietnamesePhone;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        Contact contact = new Contact();
        List<Contact> contactList = new ArrayList<>();
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng");
            System.out.println("1. Thêm liên hệ theo tên");
            System.out.println("2. Xóa liên hệ");
            System.out.println("3. Sửa liên hệ");
            System.out.println("4. Tìm liên hệ theo tên");
            System.out.println("5. Thoát");
            int choose = Scannerutils.inputMinMax(1,5);
            switch (choose) {
                case 1:
                    System.out.println("Nhập vào tên:");
                    String name = scanner.nextLine();
                    contact.setName(name);
                    System.out.println("Nhập vào số điện thoại:");
                    String phone = scanner.nextLine();
                    contact.setNumber(phone);
                    vietnamesePhone.insertContact(name,phone);
                    break;
                case 2:
                    System.out.println("Nhập vào tên");
                    String name1 = scanner.nextLine();
                    contact.setName(name1);
                    vietnamesePhone.removeContact(name1);
                    System.out.println("Đã xóa thành công");
                    break;
                case 3:
                    System.out.println("Nhập vào tên:");
                    String name2 = scanner.nextLine();
                    System.out.println("Nhập vào số điện thoại mới:");
                    String newPhone = scanner.nextLine();
                    vietnamesePhone.updateContact(name2,newPhone);
                    break;
                case 4:
                    System.out.println("Nhập vào tên:");
                    String name3 = scanner.nextLine();
                    vietnamesePhone.searchContact(name3);
                    break;
                case 5:
                    return;
            }
        }
    }
}
