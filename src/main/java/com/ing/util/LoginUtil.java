package com.ing.util;

import com.ing.dto.LoginResponseDto;
import com.ing.model.Customer;

public class LoginUtil {
	
	public static LoginResponseDto createAccountDto(Customer customer, long accountNumber) {
		LoginResponseDto loginResponse = new LoginResponseDto();
		loginResponse.setAccountHolderName(customer.getCustomerName());
		loginResponse.setBalance(customer.getBalance());
		loginResponse.setRole(customer.getRole());
		loginResponse.setAccountNumber(accountNumber);
		return loginResponse;
	}

}
