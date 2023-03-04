package com.vti.frontend;

import com.vti.entity.Student;

public class Program1 {
    public static void main(String[] args) {
        Student student = new Student("Nguyễn Văn A", "Nam Định");
        student.setGrade(3.6f);
        student.addGrade(4.8f);
        System.out.println(student);
    }
}
