package com.ing.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ing.dto.CustomerDto;
import com.ing.model.Customer;
import com.ing.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	CustomerRepository customerRepository;
	@Override
	public String createAccount(CustomerDto customerDto) {
		// TODO Auto-generated method stub
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
	
	public String updateUser(CustomerDto customerDto) {
		Long customerId;
		Customer getUser;
		customerId=(Long)customerDto.getCustomerId();
		
		
		getUser=customerRepository.findByCustomerId(customerId);
		
		
		getUser.setEmail(customerDto.getEmail());
		getUser.setMobile(customerDto.getMobile());
		customerRepository.save(getUser);
		
		return null;
	}

}
