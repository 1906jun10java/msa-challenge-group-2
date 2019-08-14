package com.revature.employeeservice.services;

import com.revature.employeeservice.models.Employee;
import com.revature.employeeservice.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository er) {
        this.employeeRepository = er;
    }

    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id) {
        return this.employeeRepository.findById(id);
    }
}
