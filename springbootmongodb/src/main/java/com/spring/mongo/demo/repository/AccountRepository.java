package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository  extends MongoRepository<Account, String>{
}
