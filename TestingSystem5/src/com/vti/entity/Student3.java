package com.vti.entity;

import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student3 extends Person{
    private int id;
    private float averageScore;
    private String email;

    Scanner scanner = new Scanner(System.in);
    List<Student3> studentList = new ArrayList<>();

    @Override
    public void inputInfo() {
        System.out.println("Nhập vào thông tin sinh viên");
        System.out.println("Tên: ");
        this.name = Scannerutils.inputString();
        System.out.println("Giới tính: \n1.Nam \n2.Nữ \n3.Khác");
        int choose = Scannerutils.inputMinMax(1,3);
        switch (choose){
            case 1:
                this.gender = Gender.NAM;
                break;
            case 2:
                this.gender = Gender.NỮ;
                break;
            case 3:
                this.gender = Gender.KHÁC;
                break;
        }
        System.out.println("Ngày sinh: ");
        this.birthDate = new Date(Scannerutils.inputString());
        System.out.println("Địa chỉ: ");
        this.address = Scannerutils.inputString();
        System.out.println("Mã sinh viên: ");
        this.id = Scannerutils.inputNumber();
        System.out.println("Điểm trung bình: ");
        this.averageScore = scanner.nextFloat();
        System.out.println("Email: ");
        this.email = Scannerutils.emailString();
        Student3 student = new Student3(name, gender, birthDate, address, id, averageScore, email);
        studentList.add(student);
    }

    @Override
    public void showInfo() {
        for (Student3 student : studentList){
            System.out.println(student);
        }
    }

    public void scholarship() {
        for (Student3 student : studentList){
            if (student.getAverageScore() > 8.0f){
                System.out.println(getName() + " được học bổng");
            }
        }
    }

    public Student3() {
    }

    public Student3(String name, Gender gender, Date birthDate, String address, int id, float averageScore, String email) {
        super(name, gender, birthDate, address);
        this.id = id;
        this.averageScore = averageScore;
        email = email;
    }

    public float getAverageScore() {
        return averageScore;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "id=" + id +
                ", averageScore=" + averageScore +
                ", Email='" + email + '\'' +
                ", scanner=" + scanner +
                ", studentList=" + studentList +
                '}';
    }
}
