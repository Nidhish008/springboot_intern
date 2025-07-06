package com.example.todotasktracker.controller;

import com.example.todotasktracker.model.Task;
import com.example.todotasktracker.service.Taskservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.todotasktracker.model.Status;

import java.util.List;

@RestController
@RequestMapping("/tasks")
public class Taskcontroller {
    @Autowired
    Taskservice service;

    @GetMapping
    public List<Task> getTasks() {
        return service.getTasklist();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable int id){
        return service.getTaskbyId(id);
    }

    @PostMapping
    public String addTask(@RequestBody Task task){
        return service.setTask(task);
    }

    @PutMapping("/{id}")
    public String updateTask(@PathVariable int id,@RequestBody Status status){
        return service.updateTaskStatus(id,status);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id){
        return service.DeleteTask(id);
    }
}
