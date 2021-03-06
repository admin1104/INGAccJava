package com.ing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ing.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	public Account findByCustomerId(long customerId);

}
