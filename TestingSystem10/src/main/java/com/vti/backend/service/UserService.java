package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.Department;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService{
    UserRepository repository = new UserRepository();
    @Override
    public User login(String username, String password) {
        return repository.login(username, password);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.getAllUsers();
    }

    @Override
    public User findById(int id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findUser(String key) {
        return repository.findUser(key);
    }

    @Override
    public void deleteUser(int id) {
        repository.deleteUser(id);
    }

    @Override
    public void changePassword(String username, String oldPassword, String newPassword) {
        repository.changePassword(username, oldPassword, newPassword);
    }

    @Override
    public void createUser(String username, String email, String birthDay, int departmentId) {
        repository.createUser(username, email, birthDay, departmentId);
    }
}
