package com.vti.backend.service;

import com.vti.backend.repository.AccountRepository;
import com.vti.entity.Account;

import java.util.List;

public class AccountService implements IAccountService{
    private AccountRepository repository = new AccountRepository();
    @Override
    public void createAccount(String username, String email, String password) {
        repository.createAccount(username,email,password);
    }

    @Override
    public void updateAccount(int accountId, String oldPassword, String newPassword) {
        repository.updateAccount(accountId, oldPassword, newPassword);
    }

    @Override
    public void deleteAccount(int accountId) {
        repository.deleteAccount(accountId);
    }

    @Override
    public List<Account> findByEmail(String email) {
        repository.findByEmail(email);
        return repository.findByEmail(email);
    }

    @Override
    public List<Account> getAllAccount() {
        return repository.getAllAccount();
    }

    @Override
    public boolean login(String email, String password) {
        return repository.login(email, password);
    }
}
