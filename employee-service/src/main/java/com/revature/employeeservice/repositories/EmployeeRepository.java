package com.revature.employeeservice.repositories;

import com.revature.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {}
