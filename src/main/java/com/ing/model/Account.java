package com.ing.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="account")
public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="account_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	
	@Column(name="account_number")
	private long accountNumber;
	
	@Column(name="customer_id")
	private long customerId;
	
	@Column(name="passowrd")
	private String passowrd;
	
	@Column(name="account_type")
	private String accountType;
	
	@Column(name="branch_name")
	private String branchName;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="created_date")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp 
	private Date createdDate;

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getPassowrd() {
		return passowrd;
	}

	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Account(long accountNumber, long customerId, String passowrd, String accountType, String branchName,
			double balance, Date createdDate) {
		super();
		this.accountNumber = accountNumber;
		this.customerId = customerId;
		this.passowrd = passowrd;
		this.accountType = accountType;
		this.branchName = branchName;
		this.balance = balance;
		this.createdDate = createdDate;
	}

	public Account() {
		super();
	}
	

}
