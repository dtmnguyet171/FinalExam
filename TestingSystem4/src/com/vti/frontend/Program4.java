package com.vti.frontend;

import com.vti.backend.QLTV;
import com.vti.entity.Document;
import com.vti.utils.Scannerutils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        List<Document> documentList = new ArrayList<>();
        QLTV qltv = new QLTV();
        while (true){
            System.out.println("Mời bạn nhập vào chức năng");
            System.out.println("1. Thêm mới tài liêu: Sách, tạp chí, báo");
            System.out.println("2. Xoá tài liệu theo mã tài liệu");
            System.out.println("3. Hiện thị thông tin về tài liệu");
            System.out.println("4. Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo");
            System.out.println("5. Thoát khỏi chương trình");
            int choose = Scannerutils.inputNumber();
            switch (choose){
                case 1:
                    Document document = qltv.addDocument();
                    documentList.add(document);
                    break;
                case 2:
                    Document document1 = qltv.findDocument(documentList);
                    documentList.remove(document1);
                    System.out.println("Đã xóa thành công");
                    break;
                case 3:
                    System.out.println(documentList);
                    break;
                case 4:
                default:
                    return;
            }
        }
    }
}
