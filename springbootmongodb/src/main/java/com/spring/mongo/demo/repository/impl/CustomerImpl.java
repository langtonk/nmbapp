package com.spring.mongo.demo.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.spring.mongo.demo.repository.CustomerQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.spring.mongo.demo.model.Customer;


@Repository
class CustomerImpl implements CustomerQuery {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Customer> getAll() {
        System.out.println("Inside Customer Query DAO Impl's get()");
        return mongoTemplate.findAll(Customer.class);
    }


    @Override
    public List<Customer> getEmployeeByFirstName(String firstName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(firstName));
        return new ArrayList<>(mongoTemplate.find(query, Customer.class));
    }


    @Override
    public Customer getSingleEmployeeByFirstName(String name) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").is(name));

        return mongoTemplate.findOne(query, Customer.class);
    }


    // "firstName"  --> database property (not related to java code)
    // select * from employee where lastName like %Gurung% limit 1 --> (case insensitive)
    @Override
    public List<Customer> getEmployeeByFirstNameLike(String firstName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("firstName").regex(firstName, "i"));

        return mongoTemplate.find(query, Customer.class);
    }


    @Override
    public Customer getSingleEmployeeByLastName(String lastName) {

        Query query = new Query();
        query.addCriteria(Criteria.where("lastName").regex(lastName, "i"));

        return mongoTemplate.findOne(query, Customer.class);
    }




    @Override
    public List<Customer> getEmployeeBySalaryGreaterThan(int salary) {

        Query query = new Query();
        query.addCriteria(Criteria.where("salary").gt(salary));
        query.with(Sort.by(Sort.Direction.ASC, "firstName"));
        query.with(Sort.by(new Sort.Order(Sort.Direction.ASC, "firstName").ignoreCase()));

        return mongoTemplate.find(query, Customer.class);
    }


}
