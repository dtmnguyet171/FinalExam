package com.vti.backend.service;

import com.vti.backend.repository.UserRepository;
import com.vti.entity.User;

import java.util.List;

public class UserService implements IUserService{
    UserRepository repository = new UserRepository();
    @Override
    public User login(String email, String password) {
        return repository.login(email, password);
    }

    @Override
    public List<User> userListInProject(int projectId) {
        return repository.userListInProject(projectId);
    }

    @Override
    public List<User> getManager() {
        return repository.getManager();
    }
}
