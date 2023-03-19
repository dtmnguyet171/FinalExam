package com.vti.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {
    public static boolean checkFileExists(String pathFile){
        File file = new File(pathFile);
        if (file.exists()) {
            System.out.println("Đường dẫn có tồn tại");
            return true;
        } else {
            System.out.println("Đường dẫn không tồn tại");
            return false;
        }
    }

    public static void createFile(String fileName){
        String pathFile = "Data/" + fileName;
        File file = new File(pathFile);
        try {
            if (file.createNewFile()){
                System.out.println("Tạo file thành công");
            } else {
                System.err.println("Tạo file không thành công");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void deleteFile(String pathFile){
        File file = new File(pathFile);
        if (file.exists()) {
            System.out.println(file.delete() ? "Xóa thành công" : "Xóa thất bại");
        } else {
            System.out.println("File không tồn tại");
        }
    }

    public static void getAllFile(String folderPath){
        File file = new File(folderPath);
        if (file.isDirectory()) {
            for (String fileName : file.list()){
                System.out.println(fileName);
            }
        } else {
            System.out.println("Đường dẫn không hợp lệ");
        }
    }

    public static void readFile(String pathFile){
        if (checkFileExists(pathFile)){
            try {
                FileInputStream fileInputStream = new FileInputStream(pathFile);
                byte[] b = new byte[1024];
                int length = fileInputStream.read(b);
                while (length > -1){
                    String content = new String(b,0, length);
                    System.out.println(content);
                    length = fileInputStream.read(b);
                }
                fileInputStream.close();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
