package com.ing.dto;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class AccountDto implements Serializable{

	private String role;
	private long accountNumber;
	private String accountHolderName;
	private double balance;
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public AccountDto(String role, long accountNumber, String accountHolderName, double balance) {
		super();
		this.role = role;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public AccountDto() {
		super();
	}
	
	@Override
	public String toString() {
		return "AccountDto [role=" + role + ", accountNumber=" + accountNumber + ", accountHolderName="
				+ accountHolderName + ", balance=" + balance + "]";
	}
	
	
}
