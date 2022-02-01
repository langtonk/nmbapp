package com.spring.mongo.demo.controller;


import com.spring.mongo.demo.model.Account;
import com.spring.mongo.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/all")
    public ResponseEntity<List<?>> findAll() {
        List<?> list = accountService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Account account = accountService.findById(id);
        return ResponseEntity.ok().body(account);
    }


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Account account) {
        Account savedAccount = accountService.save(account);
        return ResponseEntity.ok().body(savedAccount);
    }


    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Account account) {
        Account updatedAccount = accountService.update(account);
        return ResponseEntity.ok().body(updatedAccount);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        accountService.delete(id);
        return ResponseEntity.ok().body("Account deleted successfully...!");
    }
}
