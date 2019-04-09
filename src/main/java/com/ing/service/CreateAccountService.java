package com.ing.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.ing.dto.CreateAccountDto;

public interface CreateAccountService {
	
	String createAccount(CreateAccountDto customer);

	List<Object[]> searchCriteria(long accountNo,String customerName);
}
