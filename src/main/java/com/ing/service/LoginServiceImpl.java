package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.LoginDto;
import com.ing.dto.LoginResponseDto;
import com.ing.model.Account;
import com.ing.model.Customer;
import com.ing.repository.AccountRepository;
import com.ing.repository.CustomerRepository;
import com.ing.util.LoginUtil;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	public AccountRepository accountRepository;
	
	@Autowired
	public CustomerRepository customerRepository;

	@Override
	public LoginResponseDto processLogin(LoginDto loginRequest) {
		
		Account acc = accountRepository.findByCustomerId(loginRequest.getUserName());
		
		if(loginRequest.getPassword().equals(acc.getPassowrd())) {
			Customer customer = customerRepository.findByCustomerId(loginRequest.getUserName());
			if(customer != null) {
				return LoginUtil.createAccountDto(customer, acc.getAccountNumber());
			}
			
		}
		return null;
	}

}
