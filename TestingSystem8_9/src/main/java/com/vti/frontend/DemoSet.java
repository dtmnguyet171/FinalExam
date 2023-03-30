package com.vti.frontend;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        demoHashSet();
    }
    public static void demoHashSet(){
        // Set không lưu hai phần tử giống nhau
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(0);
        integerSet.add(6);
        integerSet.add(3);
        System.out.println(integerSet);
        // Kiểm tra số phần tử
        System.out.println("Số phần tử " + integerSet.size());
        // Lấy phần tử ở vị trí thứ a: Không có hàm get(index)
        // Xóa
//        System.out.println("Xóa: " + integerSet.remove(0));
//        System.out.println(integerSet);
        System.out.println("Xóa: " + integerSet.remove(Integer.valueOf(6)));
        System.out.println(integerSet);
    }
}
