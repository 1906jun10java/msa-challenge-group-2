package com.revature.reimbursementservice.models;

import javax.persistence.*;

@Entity
@Table(name="REIMBURSEMENT")
public class Reimbursement {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="reimbursementSequence")
    private int reimbursementId;
    @Column
    private int employeeId;
    @Column
    private double amount;
    @Column
    private String description;

    public Reimbursement() {
        super();
    }

    public Reimbursement(int eId, double amt, String desc) {
        this.employeeId = eId;
        this.amount = amt;
        this.description = desc;
    }

    public int getReimbursementId() {
        return reimbursementId;
    }

    public void setReimbursementId(int reimbursementId) {
        this.reimbursementId = reimbursementId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
