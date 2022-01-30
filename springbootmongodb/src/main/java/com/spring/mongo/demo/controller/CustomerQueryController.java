package com.spring.mongo.demo.controller;

import java.util.List;

import com.spring.mongo.demo.model.Customer;
import com.spring.mongo.demo.service.CustomerQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.mongo.demo.model.Employee;

@RestController
@RequestMapping("/customer-query")
public class CustomerQueryController {

    @Autowired
    private CustomerQueryService customerQueryService;

    @GetMapping
    public List<Customer> getAll() {
        return customerQueryService.getAll();
    }


    // getAll employee by first name (equals())
    @GetMapping("/firstName/{firstName}")
    public List<Customer> getEmployeeByFirstName(@PathVariable String firstName) {
        return customerQueryService.getEmployeeByFirstName(firstName);
    }


    // getAll employee by first name (equals())
    @GetMapping("/one-by-firstName/{firstName}")
    public Customer getOneEmployeeByFirstName(@PathVariable String firstName) {
        return customerQueryService.getOneEmployeeByFirstName(firstName);
    }

    // getAll employee by first name %LIKE%
    @GetMapping("/firstName-like/{firstName}")
    public List<Customer> getEmployeeByFirstNameLike(@PathVariable String firstName) {
        return customerQueryService.getEmployeeByFirstNameLike(firstName);
    }


    // getAll employee by last name (equals())
    @GetMapping("/one-by-lastName/{lastName}")
    public Customer getSingleEmployeeByLastName(@PathVariable String lastName) {
        return customerQueryService.getSingleEmployeeByLastName(lastName);
    }


    @GetMapping("/salary-greater-than/{salary}")
    public List<Customer> getEmployeeBySalaryGreaterThan(@PathVariable int salary) {
        return customerQueryService.getEmployeeBySalaryGreaterThan(salary);
    }


    @PostMapping("/get-by-condition")
    public List<Customer> getEmployeeByCondition(@RequestBody Customer customer) {
        return customerQueryService.getEmployeeByCondition(customer);
    }

}
