package com.example.intern.controller;
import java.util.*;
import com.example.intern.models.Student;
import com.example.intern.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldService service;

    @GetMapping("/greet")
    public String hello(){
        return service.hello();
    }

    @GetMapping("/")
    public List<Student> getMethod(){
        return service.getmethod();
    }

    @PostMapping("/")
    public String postMethod(){
        return service.postmethod();
    }

    @PutMapping("/")
    public String putMethod(){
        return service.putmethod();
    }

    @DeleteMapping("/")
    public String deleteMethod(){
        return service.deletemethod();
    }
}
