package com.vti.frontend;

import java.util.*;

public class DemoList {
    public static void main(String[] args){
        demoArrayList();
    }
    public static void demoArrayList(){
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(0);
        integers.add(2);
        System.out.println("Số phần tử trong list là: " + integers.size());
        // Lấy phần tử ở vị trí index thứ n (index bắt đầu từ 0)
        System.out.println("Vị trí có index = 1 là: " + integers.get(1));
        System.out.println(integers.get(Integer.valueOf(2)));
        // Xóa phần tử (2 cách)
        // + Cách 1: Truyền index của phần tử muốn xóa (dữ liệu trả về là đối tượng E đang làm việc)
//        integers.remove(3);
//        System.out.println(integers);
        // + Cách 2: Truyền vào đối tượng mà mình muốn xóa (Đối tượng truyền vào phải giống E) (dữ liệu trả về là boolean)
        System.out.println("Xóa: " + integers.remove(Integer.valueOf(2)));
        System.out.println(integers);

        Iterator<Integer> stringIterator = integers.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
    }
    public static void demoLinkList(){
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(2);
        System.out.println("Số phần tử trong list là: " + integers.size());
        // Lấy phần tử ở vị trí index thứ n (index bắt đầu từ 0)
        System.out.println("Vị trí có index = 1 là: " + integers.get(1));
        // Xóa phần tử (2 cách)
        // + Cách 1: Truyền index của phần tử muốn xóa (dữ liệu trả về là đối tượng E đang làm việc)
//        integers.remove(3);
//        System.out.println(integers);
        // + Cách 2: Truyền vào đối tượng mà mình muốn xóa (Đối tượng truyền vào phải giống E) (dữ liệu trả về là boolean)
        System.out.println("Xóa: " + integers.remove(Integer.valueOf(2)));
        System.out.println(integers);

        Iterator<Integer> stringIterator = integers.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        // Sắp xếp theo thứ tự tăng dần
        Collections.sort(integers);
        System.out.println(integers);
        // Đảo ngược vị trí
        Collections.reverse(integers);
        System.out.println(integers);

    }
}
