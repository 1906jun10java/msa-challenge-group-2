package com.revature.employeeservice.models;

import javax.persistence.*;

@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="employeeSequence")
    private int employeeId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String department;

    public Employee() {
        super();
    }

    public Employee(String fn, String ln, String dept) {
        this.firstName = fn;
        this.lastName = ln;
        this.department = dept;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
