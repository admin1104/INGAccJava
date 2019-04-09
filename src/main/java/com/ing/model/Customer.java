package com.ing.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="email")
	private	String email;
	
	@Column(name="mobile")
	private	Long	mobile;
	
	@Column(name="balance")
	private Double balance;
	
	@Column(name="pan")
	private	String pan;
	
	
	@Column(name="role")
	private String role;
	
	public Customer(Long customerId, String customerName, String email,
			Long mobile, Double balance, String pan) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.mobile = mobile;
		this.balance = balance;
		this.pan = pan;
	}
	public Customer() {
		super();
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
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", email=" + email + ", mobile=" + mobile
				+ ", balance=" + balance + ", pan=" + pan + ", role=" + role
				+ "]";
	}
	

	
	
}
