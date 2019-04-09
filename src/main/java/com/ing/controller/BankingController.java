package com.ing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.CustomerDto;
import com.ing.dto.LoginDto;
import com.ing.dto.LoginResponseDto;
import com.ing.service.LoginService;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BankingController {
	
	@Autowired
	public LoginService loginService;

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
	public ResponseEntity<CustomerDto> createAccount(@RequestBody CustomerDto createAccount) {
		return null;
	}
	
	
	@PostMapping("/updateUser")
	public ResponseEntity<CustomerDto> updateUser(@RequestBody CustomerDto updateUser) {
		return null;
	}
	
}
