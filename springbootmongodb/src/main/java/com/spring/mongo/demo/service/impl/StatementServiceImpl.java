package com.spring.mongo.demo.service.impl;

import com.spring.mongo.demo.model.Statement;
import com.spring.mongo.demo.repository.StatementRepository;
import com.spring.mongo.demo.service.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementServiceImpl implements StatementService {

    @Autowired
    private StatementRepository repository;

    @Override
    public List<Statement> findAll() {
        return repository.findAll();
    }

    @Override
    public Statement findById(String id) {
        return repository.findById(id).orElse(new Statement());
    }

    @Override
    public Statement save(Statement statement) {
        return repository.save(statement);
    }

    @Override
    public Statement update(Statement statement) {
        return repository.save(statement);
    }

    @Override
    public void delete(String id) {
        repository.findById(id).ifPresent(statement -> repository.delete(statement));
    }
}
