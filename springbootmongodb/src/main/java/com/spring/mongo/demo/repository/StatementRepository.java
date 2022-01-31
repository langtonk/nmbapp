package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Statement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StatementRepository  extends MongoRepository<Statement, String> {
}
