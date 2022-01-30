package com.spring.mongo.demo.repository;

import java.util.List;

import com.spring.mongo.demo.model.Customer;

public interface CustomerQuery {

    List<Customer> getAll();

    List<Customer> getEmployeeByFirstName(String firstName);

    Customer getSingleEmployeeByFirstName(String firstName);

    List<Customer> getEmployeeByFirstNameLike(String firstName);

    Customer getSingleEmployeeByLastName(String lastName);

    List<Customer> getEmployeeBySalaryGreaterThan(int salary);

}
