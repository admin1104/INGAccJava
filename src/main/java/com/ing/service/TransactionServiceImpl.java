package com.ing.service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ing.dto.TransactionDto;
import com.ing.repository.TransactionRepository;
import com.ing.service.TransactionService;
import com.ing.model.Transaction;


@Service
public class TransactionServiceImpl implements TransactionService {
	@Autowired
	TransactionRepository transrepo;

	@Override
	public void saveTransaction(TransactionDto t) {
		// TODO Auto-generated method stub
		Transaction transmodel = new Transaction();
		BeanUtils.copyProperties(t, transmodel);
		transrepo.save(transmodel);
		
	}

}
