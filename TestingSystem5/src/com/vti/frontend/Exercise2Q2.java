package com.vti.frontend;

import com.vti.entity.Student2;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2Q2 {
    public static void main(String[] args) {
        List<Student2> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
// Tạo 10 sinh viên, chia thành 3 nhóm
        System.out.println("Nhập vào sinh viên");
        for (int i = 1; i<=4; i++){
            Student2 student = new Student2();
            student.setId(i);
            System.out.println("Họ tên: ");
            student.setName(scanner.nextLine());
            System.out.println("Nhóm: ");
            student.setGroup(Scannerutils.inputMinMax(1,3));
            studentList.add(student);
        }
        System.out.println(studentList);
// Kêu gọi cả lớp điểm danh
        for (Student2 student2 : studentList){
            student2.diemDanh();
        }
// Gọi nhóm 1 đi học bài
        for (Student2 student2 : studentList){
            if (student2.getGroup() == 1) {
                student2.hocBai();
            }
        }
// Gọi nhóm 2 đi dọn vệ sinh
        for (Student2 student2 : studentList){
            if (student2.getGroup() == 2) {
                student2.diDonVeSinh();
            }
        }
    }
}
