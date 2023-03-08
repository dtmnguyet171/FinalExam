package com.vti.backend;

import com.vti.entity.CanBo;
import com.vti.entity.Gender;
import com.vti.utils.Scannerutils;

import java.util.List;
import java.util.Scanner;

public class QLCB {
    public CanBo addCanBo(){
        System.out.println("Mời bạn nhập vào thông tin cán bộ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên");
        String fullName = Scannerutils.inputString();
        System.out.println("Tuổi:");
        int age = Scannerutils.inputNumber();
        System.out.println("Nhập giới tính");
        System.out.println("1. Nan \n2.Nữ \n3.Khác");
        int choose = Scannerutils.inputNumber();
        Gender gender;
        switch (choose){
            case 1:
                gender = Gender.NAM;
            case 2:
                gender = Gender.NỮ;
            default:
                gender = Gender.KHÁC;
        }
        System.out.println("Địa chỉ");
        String address = Scannerutils.inputString();
        CanBo canBo = new CanBo();
        canBo.setAddress(address);
        canBo.setAge(age);
        canBo.setFullName(fullName);
        canBo.setGender(gender);
        System.out.println(canBo);
        return canBo;
    }
    public CanBo findCanBo(List<CanBo> canBoList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên cán bộ");
        String fullName = scanner.nextLine();
        CanBo canBo = new CanBo();
        for (CanBo canBo1 : canBoList){
            if (fullName.equals(canBo1.getFullName())){
                canBo = canBo1;
                break;
            }
        }
        return canBo;
    }
}
