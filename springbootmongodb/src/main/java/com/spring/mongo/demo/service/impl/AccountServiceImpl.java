package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.Account;
import com.spring.mongo.demo.repository.AccountRepository;
import com.spring.mongo.demo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public List<Account> findAll() {
        return repository.findAll();
    }

    @Override
    public Account findById(String id) {
        return repository.findById(id).orElse(new Account());
    }

    @Override
    public Account save(Account account) {
        return repository.save(account);
    }

    @Override
    public Account update(Account account) {
        return repository.save(account);
    }

    @Override
    public void delete(String id) {
        repository.findById(id).ifPresent(account -> repository.delete(account));
    }
}
