package com.vti.backend.service;

import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    User login(String username, String password);
    List<User> getAllUsers();
    User findById(int id);
    List<User> findUser(String key);
    void deleteUser(int id);
    void changePassword(String username, String oldPassword, String newPassword);
    void createUser(String username, String email, String birthDay, int departmentId);
}
