package com.vti.frontend;

import com.vti.backend.controller.DepartmentController;
import com.vti.backend.controller.UserController;
import com.vti.backend.repository.UserRepository;
import com.vti.entity.Department;
import com.vti.entity.User;
import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;

public class Function1 {
    UserController controller = new UserController();
    DepartmentController departmentController = new DepartmentController();
    public User login(){
        System.out.println("Username:");
        String username = Scannerutils.inputString();
        System.out.println("Mật khẩu: ");
        String password = Scannerutils.inputPassword();
        controller.login(username,password);
        return controller.login(username,password);
    }
    public void getAllUsers(){
        List<User> userList = controller.getAllUsers();
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        for (User user: userList) {
            System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUsername(), user.getEmail(),
                    user.getDateOfBirth(), user.getDepartment().getDepartmentName());
            }
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
    }
    public void findById(){
        System.out.println("Nhập vào id");
        int id = Scannerutils.inputNumber();
        User user = controller.findById(id);
        if (user != null){
            String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
            System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
            System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUsername(), user.getEmail(),
                    user.getDateOfBirth(), user.getDepartment().getDepartmentName());
            System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        } else {
            System.out.println("id không tồn tại");
        }
    }
    public void findUser(){
        System.out.println("Nhập từ khóa");
        String key = Scannerutils.inputString();
        List<User> userList = controller.findUser(key);
        String leftAlignFormat = "| %-3s| %-8s | %-15s | %-17s | %-15s | %-15s |%n";
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        System.out.format("| id |   role   |     username    |        email      | date_of_birth   | department_name |%n");
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
        for (User user: userList) {
            System.out.format(leftAlignFormat, user.getId(), user.getRole().name(), user.getUsername(), user.getEmail(),
                    user.getDateOfBirth(), user.getDepartment().getDepartmentName());
        }
        System.out.format("+----+----------+-----------------+-------------------+-----------------+-----------------+%n");
    }
    public void getAllDepartment(){
        List<Department> departmentList = departmentController.getAllDepartment();
        String leftAlignFormat = "| %-3s | %-15s |%n";
        System.out.format("+-----+-----------------+%n");
        System.out.format("| id  | department_name |%n");
        System.out.format("+-----+-----------------+%n");
        for (Department department : departmentList){
            System.out.format(leftAlignFormat, department.getDepartmentId(), department.getDepartmentName());
        }
        System.out.format("+-----+-----------------+%n");
    }
    public void findDepartmentById() {
        System.out.println("Nhập vào Department ID:");
        int departmentId = Scannerutils.inputNumber();
        Department department = departmentController.findDepartmentById(departmentId);
        String leftAlignFormat = "| %-3s | %-15s |%n";
        System.out.format("+-----+-----------------+%n");
        System.out.format("| id  | department_name |%n");
        System.out.format("+-----+-----------------+%n");
        System.out.format(leftAlignFormat, department.getDepartmentId(), department.getDepartmentName());
        System.out.format("+-----+-----------------+%n");
    }
    public void findDepartmentByName(){
        System.out.println("Nhập vào từ khóa:");
        String key = Scannerutils.inputString();
        List<Department> departmentList = departmentController.findDepartmentByName(key);
        String leftAlignFormat = "| %-3s | %-15s |%n";
        System.out.format("+-----+-----------------+%n");
        System.out.format("| id  | department_name |%n");
        System.out.format("+-----+-----------------+%n");
        for (Department department : departmentList){
            System.out.format(leftAlignFormat, department.getDepartmentId(), department.getDepartmentName());
        }
        System.out.format("+-----+-----------------+%n");
    }
    public void deleteUser(){
        System.out.println("Nhập vào id user cần xóa");
        int id = Scannerutils.inputNumber();
        User user = controller.findById(id);
        if (user == null){
            System.out.println("Id không tồn tại");
        } else {
            controller.deleteUser(id);
        }
    }
    public void changePassword(){
        System.out.println("Nhập vào username:");
        String username = Scannerutils.inputString();
        System.out.println("Nhập vào password hiện tại:");
        String oldPassword = Scannerutils.inputPassword();
        System.out.println("Nhập vào password mới:");
        String newPassword = Scannerutils.inputPassword();
        controller.changePassword(username, oldPassword, newPassword);
    }
    public void createUser(){
        System.out.println("Nhập vào username:");
        String username = Scannerutils.inputString();
        System.out.println("Nhập vào email:");
        String email = Scannerutils.emailString();
        System.out.println("Nhập vào ngày sinh:");
        String birthDay = Scannerutils.inputString();
        System.out.println("Mời bạn chọn phòng ban:");
        System.out.println("1. Java");
        System.out.println("2. PHP");
        System.out.println("3. Scrum Master");
        int departmentId = Scannerutils.inputNumber(1,3);
        controller.createUser(username,email,birthDay,departmentId);
    }
    public void deleteDepartment(){
        System.out.println("Nhập vào DepartmentId");
        int departmentId = Scannerutils.inputNumber();
        if (departmentController.findDepartmentById(departmentId) == null){
            System.out.println("Department ID không tồn tại");
        } else {
            departmentController.deleteDepartment(departmentId);
        }
    }
    public void changeDepartmentName(){
        System.out.println("Nhập vào Department Id cần thay đổi");
        int departmentId = Scannerutils.inputNumber();
        System.out.println(departmentController.findDepartmentById(departmentId));
        System.out.println("Nhập vào Department Name mới");
        String departmentName = Scannerutils.inputString();
        departmentController.changeDepartmentName(departmentId,departmentName);
    }
    public void createDepartment(){
        System.out.println("Nhập vào DepartmentName");
        String departmentName = Scannerutils.inputString();
        departmentController.createDepartment(departmentName);
    }
}
