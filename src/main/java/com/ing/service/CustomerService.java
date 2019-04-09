package com.ing.service;

import java.math.BigInteger;

import com.ing.dto.CustomerDto;

public interface CustomerService {
	
	public String createAccount(CustomerDto customerDto);
	
	public String updateUser(String email,BigInteger mobile,Long customerId);
}
