package com.example.springboot_demo.service;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>(
            Arrays.asList(
                    new Employee(1, "Prashanth", "Trainer"),
                    new Employee(2, "Yuvraj", "Faculty")
            )
    );

    public List<Employee> helloWorld() {
        return employees;
    }

    public String putMethod() {
        return "PUT method called";
    }

    public String postMethod() {
        return "POST method called";
    }

    public String deleteMethod() {
        return "DELETE method called";
    }
    public String addEmployee(Employee emp) {
        employees.add(emp);
        return "Employee added: " + emp.getName();
    }
}