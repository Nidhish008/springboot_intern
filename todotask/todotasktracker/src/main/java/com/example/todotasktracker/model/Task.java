package com.example.todotasktracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
    private int Id;
    private String Title;
    private Status Status;

    public Task(int id, String title, com.example.todotasktracker.model.Status status) {
        Id = id;
        Title = title;
        Status = status;
    }

    public int getId() {
        return Id;
    }

    public String getTitle() {
        return Title;
    }

    public Status getStatus() {
        return Status;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setStatus(Status status) {
        Status = status;
    }
}
