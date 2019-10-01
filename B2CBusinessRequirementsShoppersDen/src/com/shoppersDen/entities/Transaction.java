package com.shoppersDen.entities;

public class Transaction {

	public int transactionId;
	public int paymentId;
	public String paymentType;

	public Transaction(int transactionId, int paymentId, String paymentType) {
		super();
		this.transactionId = transactionId;
		this.paymentId = paymentId;
		this.paymentType = paymentType;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
