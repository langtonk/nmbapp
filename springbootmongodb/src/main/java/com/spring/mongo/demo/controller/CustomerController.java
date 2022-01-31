package com.spring.mongo.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.mongo.demo.model.Customer;
import com.spring.mongo.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAll() {
        return customerService.getAll();
    }

//    @GetMapping("/{empId}")
//    public Customer getEmployeeById(@PathVariable int empId ) {
//        return customerService.getEmployeeById(empId);
//    }


    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);

    }




}




