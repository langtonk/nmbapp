package com.spring.mongo.demo.repository;

import com.spring.mongo.demo.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface CustomerRepository extends MongoRepository<Customer, String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByFirstNameLike(String firstName);
}