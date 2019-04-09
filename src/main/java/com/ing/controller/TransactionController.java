package com.ing.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ing.service.TransactionService;
import com.ing.dto.TransactionDto;

@RestController
public class TransactionController {
	
	@Autowired
	TransactionService transservice;
	
	@PostMapping("/createtransactions")
	public void saveStock(@Valid @RequestBody TransactionDto transdto) {
		transservice.saveTransaction(transdto);
	}


}
