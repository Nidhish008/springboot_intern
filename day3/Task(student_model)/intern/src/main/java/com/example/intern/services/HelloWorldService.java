package com.example.intern.services;

import com.example.intern.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@Service
public class HelloWorldService {
    List<Student> stud=new ArrayList<>(
            Arrays.asList(new Student(1,"Nidhish","nid@gmail.com","xxyyyxyxyx"),
                    new Student(2,"padma","cxx@gmail.com","cdsaddvfse")

            )
    );


    public String hello() {
        return "hello world";
    }

    public List<Student> getmethod(){
        return stud;
    }

    public String postmethod(){
       System.out.println("Enter student id:");
       Scanner sc=new Scanner(System.in);
       int id=sc.nextInt();
       System.out.println("Enter student name:");
       String name=sc.next();
       System.out.println("Enter student email:");
       String email=sc.next();
       System.out.println("Ener student phone number:");
       String phone=sc.next();
       Student st=new Student(id,name,email,phone);
       stud.add(st);
       return "Student added successfully";
    }

    public String putmethod(){
        return "put method";
    }

    public String deletemethod(){
        return "delete method";
    }
}
