package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer findByCustomerId(long customerId);
	
	//public Customer findOne(Long customerId);
}
