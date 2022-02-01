package com.spring.mongo.demo.service;

import com.spring.mongo.demo.model.Statement;

import java.util.List;

public interface StatementService {

    List<?> findAll();

    Statement findById(String id);

    Statement save(Statement statement);

    Statement update(Statement statement);

    void delete(String id);
}