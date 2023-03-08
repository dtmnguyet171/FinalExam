package com.vti.backend;

import com.vti.entity.Book;
import com.vti.entity.Document;
import com.vti.entity.Magazine;
import com.vti.entity.Newspaper;
import com.vti.utils.Scannerutils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QLTV {
    Scanner scanner = new Scanner(System.in);
    public Document addDocument() throws ParseException {
        System.out.println("Nhập vào danh mục cần thêm");
        System.out.println("1. Sách");
        System.out.println("2. Tạp chí");
        System.out.println("3. Báo");
        int choose = Scannerutils.inputNumber();
        switch (choose){
            case 1:
                System.out.println("Nhập vào thông tin sách");
                System.out.println("Mã tài liệu:");
                int id = Scannerutils.inputNumber();
                System.out.println("Tên nhà xuất bản:");
                String publisher = Scannerutils.inputString();
                System.out.println("Số bản phát hành:");
                int amount = Scannerutils.inputNumber();
                System.out.println("Tên tác giả:");
                String author = Scannerutils.inputString();
                System.out.println("Số trang:");
                int page = Scannerutils.inputNumber();
                Document book = new Book(id,publisher,amount,author,page);
                System.out.println(book);
                return book;
            case 2:
                System.out.println("Nhập vào thông tin tạp chí");
                System.out.println("Mã tài liệu:");
                int id1 = Scannerutils.inputNumber();
                System.out.println("Tên nhà xuất bản:");
                String publisher1 = Scannerutils.inputString();
                System.out.println("Số bản phát hành:");
                int amount1 = Scannerutils.inputNumber();
                System.out.println("Số phát hành:");
                int releaseNo = Scannerutils.inputNumber();
                System.out.println("Tháng phát hành");
                int releaseMonth = Scannerutils.inputNumber();
                Document magazine = new Magazine(id1,publisher1,amount1,releaseNo,releaseMonth);
                System.out.println(magazine);
                return magazine;
            case 3:
                System.out.println("Nhập vào thông tin báo:");
                System.out.println("Mã tài liệu:");
                int id2 = Scannerutils.inputNumber();
                System.out.println("Tên nhà xuất bản:");
                String publisher2 = Scannerutils.inputString();
                System.out.println("Số bản phát hành:");
                int amount2 = Scannerutils.inputNumber();
                System.out.println("Ngày phát hành:");
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date releaseDate = dateFormat.parse(Scannerutils.inputString());
                Document newspaper = new Newspaper(id2,publisher2,amount2,releaseDate);
                System.out.println(newspaper);
                return newspaper;
            }
        return null;
    }
    public Document findDocument(List<Document> documentList){
        System.out.println("Nhập vào mã tài liệu");
        int id = Scannerutils.inputNumber();
        Document document = new Document();
        for (Document document1 : documentList){
            if (id == document1.getId()){
                document = document1;
            }
        }
        return document;
    }
}
