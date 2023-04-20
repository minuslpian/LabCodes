package com.app.tester;

import static com.app.banking.ValidationRules.checkDate;

import java.util.ArrayList;
import java.util.List;

import com.app.banking.AccountType;
import com.app.banking.BankAccount;
import com.app.banking.InvalidInput;


public class TestData {
	public static List<BankAccount> populateAccount() throws InvalidInput{
		List<BankAccount> accounts=new ArrayList<>();
		//String chasisNo, Color vehicleColor, double basePrice, LocalDate manufactureDate, String company
		accounts.add(new BankAccount(12345,"Chandan Bile",AccountType.LOAN,checkDate("2023-03-10"),1500,2000));
		accounts.add(new BankAccount(67899,"Pallavi Chaudahri",AccountType.DEMAT,checkDate("2022-04-01"),500,20000));
		accounts.add(new BankAccount(91011,"Vidyas Uagale",AccountType.SAVING,checkDate("2022-12-10"),1000,200));
		accounts.add(new BankAccount(12131,"Aayushi Malvia",AccountType.CURRENT,checkDate("2021-08-19"),5000,20000));

		return accounts;
	}
}
