package com.app.banking;
import java.time.LocalDate;
import java.util.*;

public class BankAccount<T>{
	private int accountNo;
	private String customerName;
	private AccountType type;
	private double accountBalance;
	private LocalDate openingDate;
	private double minBalance;

	public BankAccount(int accountNo, String customerName,AccountType type, LocalDate openingDate, double minBal,double balance) {
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.openingDate = openingDate;
		this.type =type;
		this.accountBalance=balance;
		this.minBalance=minBal;
	}
	public BankAccount(int accountNo) {
		this.accountNo=accountNo;
	}
	@Override
	public String toString() {
		return "Account Number :"+this.accountNo+" Customer Name :"
	+this.customerName+"Account Type: "+type+" Account balance :"+this.accountBalance+" Account Opening Date :"+this.openingDate;	
	}
	
	public void withdraw(double withdrawAmt)throws BankExceptions {
		if((accountBalance-withdrawAmt)>minBalance) {
			accountBalance=accountBalance-withdrawAmt;
			System.out.println("Transaction Successful!!!");
			System.out.println("Account Balance :"+ accountBalance);
		}
		else
			throw new BankExceptions("Low Balance");
	}
	
	public void deposit(double depositAmt) {
			accountBalance=accountBalance+depositAmt;
			System.out.println("Transaction Successful!!!");
			System.out.println("Account Balance :"+ accountBalance);
		}
	
	public void fundTransfer(double transferAmt, BankAccount acc2) {
		try {
			withdraw(transferAmt);
			acc2.deposit(transferAmt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BankAccount)
			return this.accountNo == ((BankAccount)obj).accountNo;
		return false;
	}
	
}
