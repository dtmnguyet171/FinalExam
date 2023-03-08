package com.vti.frontend;

import com.vti.backend.QLCB;
import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] test = Scannerutils.inputMinMax(5,1);
        System.out.println("min="+test[0]);
        System.out.println("max="+test[1]);
        List<CanBo> canBoList = new ArrayList<>();
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("Mời bạn nhập vào chức năng");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm theo họ tên");
            System.out.println("3. Hiển thị danh sách cán bộ");
            System.out.println("4. Nhập vào tên và delete cán bộ");
            System.out.println("5. Thoát khỏi chương trình");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    CanBo canBo = qlcb.addCanBo();
                    canBoList.add(canBo);
                    break;
                case 2:
                    CanBo canBo2 = qlcb.findCanBo(canBoList);
                    System.out.println(canBo2);
                    break;
                case 3:
                    for (CanBo canBo1 : canBoList){
                        System.out.println(canBo1);
                    }
                    break;
                case 4:
                    CanBo canBo3 = qlcb.findCanBo(canBoList);
                    canBoList.remove(canBo3);
                    System.out.println("Đã xóa thành công");
                    break;
                case 5:
                    return;
            }
        }
    }
}
