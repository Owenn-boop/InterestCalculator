package model;

public class BankAccount {
	
	// private class variables
	private double balance;
	private double interestRate;
	private String accountHolder;
	
	// default constructor
	public BankAccount() {
		this.balance = 0;
		this.interestRate = 0;
	}
	
	
	// constructor with account holder name
	public BankAccount(String accountHolder) {
		this.accountHolder = accountHolder;
		this.balance = 0;
		this.interestRate = 0;
	}
	
	// constructor with all values
	public BankAccount(String accountHolder, double balance, double interestRate) {
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.interestRate = interestRate;
	}


	// all getters and setters for private class variables:
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getInterestRate() {
		return interestRate;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
}
