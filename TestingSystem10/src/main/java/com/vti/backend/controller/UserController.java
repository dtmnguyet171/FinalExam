package com.vti.backend.controller;

import com.vti.backend.service.UserService;
import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    UserService service = new UserService();
    public User login(String username, String password) {
        return service.login(username, password);
    }
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }
    public User findById(int id) {
        return service.findById(id);
    }
    public List<User> findUser(String key) {
        return service.findUser(key);
    }
    public void deleteUser(int id) {
        service.deleteUser(id);
    }
    public void changePassword(String username, String oldPassword, String newPassword) {
        service.changePassword(username, oldPassword, newPassword);
    }
    public void createUser(String username, String email, String birthDay, int departmentId) {
        service.createUser(username, email, birthDay, departmentId);
    }
}
