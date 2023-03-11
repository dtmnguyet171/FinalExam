package com.vti.entity;

public class Student {
    protected String studentCode;
    protected String fullName;
    protected String address;
    protected int priorityLevel;
    protected KhoiThi khoiThi;

    public Student(String studentCode, String fullName, String address, int priorityLevel, KhoiThi khoiThi) {
        this.studentCode = studentCode;
        this.fullName = fullName;
        this.address = address;
        this.priorityLevel = priorityLevel;
        this.khoiThi = khoiThi;
    }

    public Student() {
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public KhoiThi getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(KhoiThi khoiThi) {
        this.khoiThi = khoiThi;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", khoiThi=" + khoiThi +
                '}';
    }
}
