package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Branch;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BranchRepository  extends MongoRepository<Branch, String>{
}
