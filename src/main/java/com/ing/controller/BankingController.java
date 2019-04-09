package com.ing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ing.dto.AccountDto;
import com.ing.dto.LoginDto;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class BankingController {

	@PostMapping("/login")
	public ResponseEntity<AccountDto> processLogin(@RequestBody LoginDto login) {
		return null;
	}
	
}
