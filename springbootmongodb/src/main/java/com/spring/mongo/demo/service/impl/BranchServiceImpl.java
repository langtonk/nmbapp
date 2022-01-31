package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.Branch;
import com.spring.mongo.demo.repository.BranchRepository;
import com.spring.mongo.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchServiceImpl implements BranchService {

    @Autowired
    private BranchRepository repository;

    @Override
    public List<Branch> findAll() {
        return repository.findAll();
    }

    @Override
    public Branch findById(String id) {
        return repository.findById(id).orElse(new Branch());
    }

    @Override
    public Branch save(Branch branch) {
        return repository.save(branch);
    }

    @Override
    public Branch update(Branch branch) {
        return repository.save(branch);
    }

    @Override
    public void delete(String id) {
        repository.findById(id).ifPresent(branch -> repository.delete(branch));
    }
}
