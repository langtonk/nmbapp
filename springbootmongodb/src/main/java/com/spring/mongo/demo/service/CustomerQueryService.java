package com.spring.mongo.demo.service;

import java.util.List;

import com.spring.mongo.demo.model.Customer;

public interface CustomerQueryService {

    List<Customer> getAll();

    List<Customer> getEmployeeByFirstName(String firstName);

    Customer getSingleEmployeeByLastName(String lastName);

    List<Customer> getEmployeeByFirstNameLike(String firstName);

    Customer getOneEmployeeByFirstName(String firstName);

    List<Customer> getEmployeeBySalaryGreaterThan(int salary);

    List<Customer> getEmployeeByCondition(Customer customer);


}

