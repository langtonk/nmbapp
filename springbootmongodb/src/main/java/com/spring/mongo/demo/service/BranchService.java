package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Branch;

import java.util.List;

public interface BranchService {

    List<?> findAll();

    Branch findById(String id);

    Branch save(Branch superHero);

    Branch update(Branch superHero);

    void delete(String id);
}