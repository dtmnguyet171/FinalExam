package com.vti.backend.controller;

import com.vti.backend.service.AccountService;
import com.vti.entity.Account;

import java.util.List;

public class AccountController {
    AccountService service = new AccountService();
    public void createAccount(String username, String email, String password){
        service.createAccount(username, email, password);
    }
    public void updateAccount(int accountId, String oldPassword, String newPassword) {
        service.updateAccount(accountId,oldPassword,newPassword);
    }
    public void deleteAccount(int accountId) {
        service.deleteAccount(accountId);
    }
    public List<Account> findByEmail(String email) {
        service.findByEmail(email);
        return service.findByEmail(email);
    }
    public List<Account> getAllAccount() {
        return service.getAllAccount();
    }
    public boolean login(String email, String password) {
        return service.login(email, password);
    }
}
