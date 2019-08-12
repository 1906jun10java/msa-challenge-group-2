package com.revature.reimbursementservice.repositories;

import com.revature.reimbursementservice.models.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {}
