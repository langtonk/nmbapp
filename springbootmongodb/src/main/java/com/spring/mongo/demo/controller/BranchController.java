package com.spring.mongo.demo.controller;


import com.spring.mongo.demo.model.Branch;
import com.spring.mongo.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/all")
    public ResponseEntity<List<?>> findAll() {
        List<?> list = branchService.findAll();
        return ResponseEntity.ok().body(list);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable String id) {
        Branch branch = branchService.findById(id);
        return ResponseEntity.ok().body(branch);
    }


    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody Branch branch) {
        Branch savedBranch = branchService.save(branch);
        return ResponseEntity.ok().body(savedBranch);
    }


    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody Branch branch) {
        Branch updatedBranch = branchService.update(branch);
        return ResponseEntity.ok().body(updatedBranch);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        branchService.delete(id);
        return ResponseEntity.ok().body("Branch deleted successfully...!");
    }
}
