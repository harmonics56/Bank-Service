package com.cognizant.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.LoanService;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;

	@GetMapping("/loans")
	public List<Loan> retrieveAllLoans() {
		return loanService.getAllLoans();
	}

	@GetMapping("/loans/{number}")
	public Loan retrieveLoanByNumber(@PathVariable String number) {
		return loanService.getLoanByLoanNumber(number);
	}
	@GetMapping("/loans/type/{type}")
	public Loan retrieveLoanByType(@PathVariable String type) {
		System.out.println(loanService.getLoanBytype(type));
		return loanService.getLoanBytype(type);
	}
}
