package com.vti.backend.service;

import com.vti.entity.User;

import java.util.List;

public interface IUserService {
    User login(String email, String password);
    List<User> userListInProject(int projectId);
    List<User> getManager();
}
