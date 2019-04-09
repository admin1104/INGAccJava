package com.ing.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.CreateAccountDto;
import com.ing.dto.LoginDto;
import com.ing.dto.LoginResponseDto;
import com.ing.dto.TransactionDto;
import com.ing.service.CreateAccountService;
import com.ing.service.CustomerService;
import com.ing.service.LoginService;
import com.ing.service.TransactionService;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BankingController {
	
	@Autowired
	public LoginService loginService;

	@Autowired
	public CreateAccountService createAccountService;

	@Autowired
	public CustomerService customerService;
	
	@Autowired
	TransactionService transservice;
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponseDto> processLogin(@RequestBody LoginDto loginRequest) {
		LoginResponseDto response = loginService.processLogin(loginRequest);
		if(response != null) {
			return ResponseEntity.ok().body(response);
		}else {
			return ResponseEntity.badRequest().build();
		}
	}
	@PostMapping("/createAccount")
	public ResponseEntity<String> createAccount(@RequestBody CreateAccountDto createAccountDto) {
		return new ResponseEntity<>(createAccountService.createAccount(createAccountDto),HttpStatus.OK);
	}
		
	@PostMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody String email, Long mobile, Long customerId) {
		String responseMessage = customerService.updateUser(email, mobile, customerId);
		if (responseMessage != null) {
			return ResponseEntity.ok().body(responseMessage);
		} else {
			return ResponseEntity.badRequest().body(responseMessage);
		}
	}
	@PostMapping("/createtransactions")
	public ResponseEntity<String> createTransaction(@RequestBody TransactionDto transdto) {
		transservice.saveTransaction(transdto);
		String responseMessage = "Transaction Saved Suucessfully!";
		return ResponseEntity.ok().body(responseMessage);
	}
	
	
	
}

	
