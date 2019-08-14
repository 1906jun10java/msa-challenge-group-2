package com.revature.reimbursementservice.repositories;

import com.revature.reimbursementservice.models.Reimbursement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReimbursementRepository extends JpaRepository<Reimbursement, Integer> {
	@Query("FROM Reimbursement R WHERE R.employeeId = :eId")
	List<Reimbursement> findByEmployeeId(@Param("eId") int id);
}
