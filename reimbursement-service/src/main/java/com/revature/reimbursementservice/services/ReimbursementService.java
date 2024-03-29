package com.revature.reimbursementservice.services;

import com.revature.reimbursementservice.models.Reimbursement;
import com.revature.reimbursementservice.repositories.ReimbursementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReimbursementService {
    private ReimbursementRepository reimbursementRepository;

    @Autowired
    public ReimbursementService(ReimbursementRepository rr) {
        this.reimbursementRepository = rr;
    }

    public List<Reimbursement> findAll() {
        return this.reimbursementRepository.findAll();
    }

    public Optional<Reimbursement> findById(int id) {
        return this.reimbursementRepository.findById(id);
    }

    public List<Reimbursement> findByEmployeeId(int id) {
        return this.reimbursementRepository.findByEmployeeId(id);
    }
}
