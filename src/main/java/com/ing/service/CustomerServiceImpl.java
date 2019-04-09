package com.ing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.CustomerDto;
import com.ing.model.Customer;
import com.ing.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public String createAccount(CustomerDto customerDto) {
		Customer customer = new Customer();
		
		
		customer.setBalance(customerDto.getBalance());
		customer.setCustomerId(customerDto.getCustomerId());
		customer.setCustomerName(customerDto.getCustomerName());
		customer.setEmail(customerDto.getEmail());
		customer.setMobile(customerDto.getMobile());
		customer.setPan(customerDto.getPan());
		customer.setRole(customerDto.getRole());
		
		
		customerRepository.save(customer);
		return "successfully saved";
	}
	
	@Override
	public String updateUser(String email, Long mobile, Long customerId) {
		Customer getUser;
		getUser=customerRepository.findById(customerId).orElse(null);
		if(null != getUser) {
			getUser.setEmail(email);
			getUser.setMobile(mobile);
			customerRepository.save(getUser);
			
			return "User details are updated successfully";
		}
		return "Unable to update user details";
	}

}
