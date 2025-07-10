package com.example.Springboot.controller;
import java.util.List;

import com.example.Springboot.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.example.Springboot .model.*;

@RestController
@RequestMapping("/employee")
public class Employeecontroller {
    @Autowired
    Employeeservice service;

    @GetMapping("/")
    public String route(){
        return "Welcome to SpringSecurity";
    }


    @GetMapping("/employee")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Employee> getAllEmployees() {
        return service.getEmployees();
    }


    @GetMapping("/employee/{empId}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public Employee getEmployeeById(@PathVariable int empId) {
        return service.getEmployeeById(empId);
    }

    @GetMapping("/employee/job/{job}")
    public List<Employee> getEmployeeByJob(@PathVariable String job) {
        return service.getEmployeebyJob(job);
    }

    @GetMapping("/employee/name/{name}")
    public List<Employee> getEmployeeByName(@PathVariable String name) {
        return service.getEmployeebyName(name);
    }

    @PostMapping("/employee")
    @PreAuthorize("hasRole('ADMIN')")
    public String postMethod(@RequestBody Employee employee) {
        return service.postEmployee(employee);
    }


    @PutMapping("/employee/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public String putMethod(@PathVariable int id,@RequestBody Employee employee) {
        return service.updateEmployee(id,employee);
    }


    @DeleteMapping("/{empId}")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteEmpbyId(@PathVariable int empId) {
        return service.deleteEmployeeById(empId);
    }
}
