package com.vti.backend.service;

import com.vti.entity.Account;

import java.util.List;

public interface IAccountService {
    void createAccount(String username, String email, String password);
    void updateAccount(int accountId, String oldPassword, String newPassword);
    void deleteAccount(int accountId);
    List<Account> findByEmail(String email);
    List<Account> getAllAccount();
    boolean login(String email, String password);
}
