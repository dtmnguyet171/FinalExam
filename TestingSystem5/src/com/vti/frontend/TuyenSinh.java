package com.vti.frontend;

import com.vti.entity.ITuyenSinh;
import com.vti.entity.KhoiThi;
import com.vti.entity.Student;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;

public class TuyenSinh implements ITuyenSinh {
    List<Student> studentList = new ArrayList<>();
    @Override
    public void addNewStudent() {
        System.out.println("Nhập vào thông tin thí sinh");
        System.out.println("Số báo danh: ");
        String studentCode = Scannerutils.inputString();
        System.out.println("Họ tên: ");
        String fullName = Scannerutils.inputString();
        System.out.println("Địa chỉ: ");
        String address = Scannerutils.inputString();
        System.out.println("Khu vực ưu tiên: ");
        int priorityLevel = Scannerutils.inputNumber();
        String khoiThi = Scannerutils.inputString();
        Student student = new Student(studentCode,fullName,address,priorityLevel, new KhoiThi(khoiThi));
        studentList.add(student);
    }
    @Override
    public void displayStudent() {
        for (Student student : studentList){
            System.out.println(student);
        }
    }
    @Override
    public Student searchStudent(String studentCode) {
        Student student = new Student();
        for (Student student1 : studentList){
            if (studentCode == student1.getStudentCode()){
                student = student1;
            }
        }
        return student;
    }
}
