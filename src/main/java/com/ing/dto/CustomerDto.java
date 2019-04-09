package com.ing.dto;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CustomerDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private  Long customerId;
	private String customerName;
	private	String email;
	private	BigInteger mobile;
	private Double balance;
	private	String pan;
	private String role;
	
	public CustomerDto() {
		super();
	}

	public CustomerDto(Long customerId, String customerName, String email,
			BigInteger mobile, Double balance, String pan, String role) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobile = mobile;
		this.balance = balance;
		this.pan = pan;
		this.role=role;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public BigInteger getMobile() {
		return mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName="
				+ customerName + ", email=" + email + ", mobile=" + mobile
				+ ", balance=" + balance + ", pan=" + pan + ", role=" + role
				+ "]";
	}

	
	

	
}
