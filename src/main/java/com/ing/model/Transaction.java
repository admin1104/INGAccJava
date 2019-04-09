package com.ing.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "transaction")
public class Transaction {
	
	
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int id;

@Id	
@Column(name="transaction_id", nullable=false)	
@GeneratedValue(strategy= GenerationType.AUTO)
private long transactionID;
@Column(name="account_number", nullable=false)	
private long accountNumber;
@Column(name="customer_id", nullable=false)	
private long customerID;
@Column(name="transaction_remarks", nullable=false)	
private String transactionRemarks;
@Column(name="transaction_type", nullable=false)	
private String transactionType;
@Column(name="transaction_amount", nullable=false)	
private double transactionAmount;
@Column(name="from_account", nullable=false)	
private long fromAccount;
@Column(name="to_account", nullable=false)	
private long toAccount;
@Column(name="balance")	
private long balance;
@Column(name="transaction_status")	
private String transactionStatus;
@Column(name="transaction_date", nullable=false)	
private Date transactionDate;


public long getTransactionID() {
	return transactionID;
}
public void setTransactionID(long transactionID) {
	this.transactionID = transactionID;
}
public long getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}
public long getCustomerID() {
	return customerID;
}
public void setCustomerID(long customerID) {
	this.customerID = customerID;
}
public String getTransactionRemarks() {
	return transactionRemarks;
}
public void setTransactionRemarks(String transactionRemarks) {
	this.transactionRemarks = transactionRemarks;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}
public double getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(double transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public long getFromAccount() {
	return fromAccount;
}
public void setFromAccount(long fromAccount) {
	this.fromAccount = fromAccount;
}
public long getToAccount() {
	return toAccount;
}
public void setToAccount(long toAccount) {
	this.toAccount = toAccount;
}
public long getBalance() {
	return balance;
}
public void setBalance(long balance) {
	this.balance = balance;
}
public String getTransactionStatus() {
	return transactionStatus;
}
public void setTransactionStatus(String transactionStatus) {
	this.transactionStatus = transactionStatus;
}
public Date getTransactionDate() {
	return transactionDate;
}
public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

}
