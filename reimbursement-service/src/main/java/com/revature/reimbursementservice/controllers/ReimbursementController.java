package com.revature.reimbursementservice.controllers;

import com.revature.reimbursementservice.models.Reimbursement;
import com.revature.reimbursementservice.services.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/reimbursements")
public class ReimbursementController {
	private ReimbursementService reimbursementService;

	@Autowired
	public void setReimbursementService(ReimbursementService rs) {
		this.reimbursementService = rs;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Reimbursement>> findAll() {
		return new ResponseEntity<>(reimbursementService.findAll(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Reimbursement>> findById(@PathVariable int id) {
		return new ResponseEntity<>(reimbursementService.findById(id), HttpStatus.OK);
	}

	@GetMapping("/employees/{id}")
	public ResponseEntity<List<Reimbursement>> findByEmployeeId(@PathVariable int id) {
		return new ResponseEntity<>(reimbursementService.findByEmployeeId(id), HttpStatus.OK);
	}
}
