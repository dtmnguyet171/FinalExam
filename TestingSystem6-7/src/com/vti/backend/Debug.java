package com.vti.backend;

public class Debug {
    public static void main(String[] args) {
        Debug debug = new Debug();
        debug.vd3();
    }

    public void vd1() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Số i là : " + i);
            if (i % 2 == 0) {
                System.out.println("chỉ lấy số chẵn: " + i);
                continue;
            }
            System.out.println("Số lẻ thì xuống đây " + i);
            if (i == 7) {
                System.out.println("i = 7 thì dừng vòng lặp hiện tại");
                break;
            }
        }
    }

    public void vd2() {
        try {
            System.out.println(3/0);
        } catch (Exception ex) {
            System.err.println("Không thể chia cho 0");
        }
        System.out.println(1);
        System.out.println(2);
        System.out.println(3/0);
        System.out.println(4);
    }

    public void vd3(){
        int[] arr = {1,2,3,4};
        try {
            System.out.println(arr[4]);
        } catch (RuntimeException exception){
            System.err.println("có lỗi");
        }
    }
}
