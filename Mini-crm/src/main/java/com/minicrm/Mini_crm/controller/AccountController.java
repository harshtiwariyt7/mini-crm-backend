package com.minicrm.Mini_crm.controller;

import com.minicrm.Mini_crm.entity.Account;
import com.minicrm.Mini_crm.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

@RequestMapping("/api/accounts")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable Integer id) {
        return ResponseEntity.ok(accountService.getAccountById(id));
    }

    @PostMapping
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return ResponseEntity.ok(accountService.createAccount(account));
    }
}