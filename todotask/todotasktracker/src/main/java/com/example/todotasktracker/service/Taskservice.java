package com.example.todotasktracker.service;
import com.example.todotasktracker.model.Task;
import com.example.todotasktracker.model.Status;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class Taskservice {
    List<Task> tasklist=new ArrayList<>(
            Arrays.asList(
                new Task(1,"laundry", Status.YET_TO_START),
                new Task(2,"assignment",Status.IN_PROGRESS)
            )
    );

    public List<Task> getTasklist() {
        return tasklist;
    }

    public Task getTaskbyId(int id) {
        for(Task t:tasklist){
            if(t.getId()==id){
                return t;
            }
        }
        return null;
    }

    public String setTask(Task task){
        tasklist.add(task);
        return "Added task successfully";
    }

    public String updateTaskStatus(int id,Status status) {
        for(Task t:tasklist){
            if(t.getId()==id){
                t.setStatus(status);
                return "Updated task successfully";
            }
        }
        return "Task not found";
    }

    public String DeleteTask(int id){
        for(Task t:tasklist){
            if(t.getId()==id){
                tasklist.remove(t);
                return "Deleted task successfully";
            }
        }
        return "Task not found";
    }


}
