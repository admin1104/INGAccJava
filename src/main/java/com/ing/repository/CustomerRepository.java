package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ing.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer findByCustomerId(long customerId);
}
