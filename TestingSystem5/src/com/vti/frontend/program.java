package com.vti.frontend;

import com.vti.backend.TuyenSinh;
import com.vti.utils.Scannerutils;

public class program {
    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();
        tuyenSinh.addNewStudent();
        tuyenSinh.displayStudent();
        tuyenSinh.searchStudent(Scannerutils.inputString());
    }
}
