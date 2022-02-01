package com.spring.mongo.demo.service;


import java.util.List;

import com.spring.mongo.demo.model.Customer;

public interface CustomerService {

    Customer save(Customer customer);

    List<Customer> getAll();

    List<Customer> getEmployeeByFirstName(String firstName);

    Customer getOneEmployeeByFirstName(String firstName);

    List<Customer> getEmployeeByFirstNameLike(String firstName);

//    Employee getEmployeeById(int empId);

    Customer getEmployeeByLastName(String lastName);

    List<Customer> getEmployeeBySalaryGreaterThan(int salary);

    List<Customer> getEmployeeByCondition(Customer employee);

}
