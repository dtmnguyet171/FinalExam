package com.vti.entity;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private float grade;

    public Student(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
        this.grade = 0;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
    public void addGrade(float grade) {
        this.grade += grade;
    }
    @Override
    public String toString() {
        String gradeType = "";
        if (this.grade<4.0){
            gradeType = "Yếu";
        } else if (this.grade<6.0){
            gradeType = "Trung bình";
        } else if (this.grade<8.0){
            gradeType = "Khá";
        } else gradeType = "Giỏi";

        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", gradeType=" + gradeType +
                '}';
    }
}
