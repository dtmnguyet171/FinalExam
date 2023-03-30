package com.vti.backend.controller;

import com.vti.backend.service.UserService;
import com.vti.entity.User;

import java.util.List;

public class UserController {
    UserService service = new UserService();
    public User login(String email, String password) {
        return service.login(email, password);
    }
    public List<User> userListInProject(int projectId) {
        return service.userListInProject(projectId);
    }
    public List<User> getManager() {
        return service.getManager();
    }
}
