package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Account;

import java.util.List;

public interface AccountService {

    List<?> findAll();

    Account findById(String id);

    Account save(Account superHero);

    Account update(Account superHero);

    void delete(String id);
}