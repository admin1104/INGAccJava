package com.ing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}
