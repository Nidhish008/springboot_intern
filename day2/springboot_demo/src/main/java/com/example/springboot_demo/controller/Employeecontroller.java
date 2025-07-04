package com.example.springboot_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_demo.service.Employeeservice;
import com.example.springboot_demo.model.*;

@RestController
public class Employeecontroller {
    @Autowired
    Employeeservice hws;
    @GetMapping("/h")
    public List<Employee> hello() {
        return hws.helloWorld();
    }

    @PutMapping("/")
    public String putMethod() {
        return hws.putMethod();
    }
    @PostMapping("/")
    public String postMethod() {
        return hws.postMethod();
    }
    @DeleteMapping("/")
    public String deleteMethod() {
        return hws.deleteMethod();
    }
    @PostMapping("/employee")
    public String addEmployee(@RequestBody Employee emp) {
        return hws.addEmployee(emp);
    }
}
