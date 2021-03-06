package com.capgemini.day2;

public class BankAccount {
	private long accId;
	
	private String accType;
	private double balance;
	private String accHolderName;
	public static final String BANK_NAME="ICICI BANK";
	private static long totalAccounts;
	
	
	public BankAccount() {
		totalAccounts++;
	}

	public BankAccount(long accId, String accHolderName, String accType, double balance) {
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
		totalAccounts++;
		System.out.println(totalAccounts);
	}

	public double withdraw(double amount) {
		if(balance - amount >= 0)
			balance = balance - amount;
		else
			System.out.println("You don't have sufficient balance.");
		return balance;
	}

	public Object deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	public double getBalance(double amount) {
		return balance;
	}
	
	public void displayBankAccountDetails() {
		System.out.println("Account Id : " + accId + "\nAccount holder name: " + accHolderName +  
				"\nAccount type: " + accType + "\nAccount balance: " + balance);
	} 
	public static long totalBankAccounts() {
		return totalAccounts;
	}

}
