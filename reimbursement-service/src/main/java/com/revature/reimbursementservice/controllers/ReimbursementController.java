package com.revature.reimbursementservice.controllers;

import com.revature.reimbursementservice.models.Reimbursement;
import com.revature.reimbursementservice.services.ReimbursementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
