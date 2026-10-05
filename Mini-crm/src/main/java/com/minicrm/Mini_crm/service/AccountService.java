package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Account;
import com.minicrm.Mini_crm.repository.AccountRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Integer id) {
        return accountRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Account not found with id: " + id));
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }
}