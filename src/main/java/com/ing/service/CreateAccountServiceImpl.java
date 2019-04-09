package com.ing.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.ing.dto.CreateAccountDto;
import com.ing.model.Account;
import com.ing.model.Customer;
import com.ing.repository.AccountRepository;
import com.ing.repository.CustomerRepository;
import com.ing.util.NumberGenerator;

@Service
@Transactional
public class CreateAccountServiceImpl implements CreateAccountService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	NumberGenerator numberGenerator;

	private static final String SUCCESS = "SUCCESS";

	private static final String FAILURE = "FAILURE";

	@PersistenceContext
	private EntityManager em;

	@Override
	public String createAccount(CreateAccountDto createAccountDto) {

		Account account = new Account();
		account.setAccountNumber(numberGenerator.getAccountNumber());
		account.setCustomerId(numberGenerator.getCustomerId());
		account.setPassowrd(numberGenerator.getPassword());
		account.setAccountType(createAccountDto.getAccountType());
		account.setBranchName(createAccountDto.getBranchName());

		Customer customer = new Customer();
		customer.setCustomerId(numberGenerator.getCustomerId());
		customer.setCustomerName(createAccountDto.getCustomerName());
		customer.setEmail(createAccountDto.getEmail());
		customer.setMobile(createAccountDto.getMobile());
		customer.setPan(createAccountDto.getPan());
		customer.setRole("User");

		try {
			accountRepository.save(account);
			customerRepository.save(customer);
		} catch (Exception e) {
			return FAILURE;
		}
		return SUCCESS;
	}

	@Override
	public List<Object[]> searchCriteria(long accountNo, String customerName) {
		List l = em.createQuery(
				"SELECT a, c  FROM Account a, Customer c WHERE "
				/*+ "a.accountNumber = :accno AND c.customerName = :name ")
				.setParameter("accno", accountNo)
				.setParameter("name", customerName)*/
				+ "a.accountNumber = :accno")
				.setParameter("accno", new Long(9876543))
				.getResultList();
		
		for(Object p:l){
			System.out.println(p.toString());
	    }
		
		return null;

	}
}
