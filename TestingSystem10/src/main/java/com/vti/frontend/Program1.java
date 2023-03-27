package com.vti.frontend;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.Scannerutils;

public class Program1 {
    public static void main(String[] args) {
        Function1 function1 = new Function1();
        System.out.println("Đăng nhâp");
        while (true){
            User user = function1.login();
            if (user == null) {
                System.out.println("Tên đăng nhập và mật khẩu không đúng, mời nhập lại");
            } else if (user.getRole() == Role.ADMIN){
                menuAdmin();
            } else {
                menuUser();
            }
        }
    }

    public static void menuAdmin(){
        Function1 function = new Function1();
        while (true){
            System.out.println("Nhập vào chức năng");
            System.out.println("1. Hiển thị danh sách tất cả User và có kèm theo thông tin của departmentName ( in ra dạng bảng )");
            System.out.println("2. Xóa 1 User theo Id ( có kiểm tra nếu Id không tồn tại thì in ra thông báo)");
            System.out.println("3. Thay đổi mật khẩu của 1 user");
            System.out.println("4. Thêm mới 1 User, mặc định password là 123456 và role là USER");
            System.out.println("5. Hiển thị danh sách tất cả các Department ( in ra dạng bảng )");
            System.out.println("6. Xóa 1 department theo Id  ( có kiểm tra nếu Id không tồn tại thì in ra thông báo)");
            System.out.println("7. Thay đổi tên 1 department");
            System.out.println("8. Thêm mới một Department");
            System.out.println("9. Thoát chương trình");
            int chose = Scannerutils.inputNumber(1,9);
            switch (chose){
                case 1:
                    function.getAllUsers();
                    break;
                case 2:
                    function.deleteUser();
                    break;
                case 3:
                    function.changePassword();
                    break;
                case 4:
                    function.createUser();
                    break;
                case 5:
                    function.getAllDepartment();
                    break;
                case 6:
                    function.deleteDepartment();
                    break;
                case 7:
                    function.changeDepartmentName();
                    break;
                case 8:
                    function.createDepartment();
                    break;
                case 9:
                    return;
            }
        }
    }

    public static void menuUser(){
        Function1 function = new Function1();
        while (true){
            System.out.println("Nhập vào chức năng");
            System.out.println("1. Hiển thị danh sách tất cả User và có kèm theo thông tin của departmentName ( in ra dạng bảng )");
            System.out.println("2. Tìm kiếm user theo id");
            System.out.println("3. Tìm kiếm user theo username và email ( nhập vào 1 từ khoá và tìm kiếm trên cả 2");
            System.out.println("4. Hiển thị danh sách tất cả các Department ( in ra dạng bảng )");
            System.out.println("5. Tìm kiếm Department theo Id");
            System.out.println("6. Tìm kiếm Department theo Department Name");
            System.out.println("7. Thoát chương trình");
            int chose = Scannerutils.inputNumber(1,7);
            switch (chose){
                case 1:
                    function.getAllUsers();
                    break;
                case 2:
                    function.findById();
                    break;
                case 3:
                    function.findUser();
                    break;
                case 4:
                    function.getAllDepartment();
                    break;
                case 5:
                    function.findDepartmentById();
                    break;
                case 6:
                    function.findDepartmentByName();
                    break;
                case 7:
                    return;
            }
        }
    }
}
