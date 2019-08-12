package com.revature.employeeservice.controllers;

import com.revature.employeeservice.models.Employee;
import com.revature.employeeservice.repositories.EmployeeRepository;
import com.revature.employeeservice.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService es) {
        this.employeeService = es;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllFlashcards() {
        return new ResponseEntity<>(employeeService.findAll(), HttpStatus.OK);
    }
}
