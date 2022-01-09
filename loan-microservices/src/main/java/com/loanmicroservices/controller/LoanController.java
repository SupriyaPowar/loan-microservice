package com.loanmicroservices.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loanmicroservices.entity.ApplyLoanRequest;
import com.loanmicroservices.services.ApplyLoanRequestServices;

@RestController
@RequestMapping("/loan")
public class LoanController {

	@Autowired
	ApplyLoanRequestServices applyLoanRequestServices;

	@PostMapping
	public void addLoan(@RequestBody ApplyLoanRequest applyLoanRequest)
	{
		applyLoanRequestServices.addLoan(applyLoanRequest);

	}
	@PutMapping
	public void updateLoan(@RequestBody ApplyLoanRequest applyLoanRequest)
	{
		applyLoanRequestServices.updateLoan(applyLoanRequest);

	}
	@DeleteMapping("/{id}")
	public void deleteLoan(@PathVariable("id") int id)
	{
		applyLoanRequestServices.deleteLoan(id);

	}

	@GetMapping("/{id}")
	public Optional<ApplyLoanRequest> getLoanByIdLoan(@PathVariable("id") int id)
	{
		return applyLoanRequestServices.getLoanById(id);

	}

	@GetMapping
	public List<ApplyLoanRequest> getAllLoans()
	{
		return applyLoanRequestServices.getAllLoan();

	}




}
