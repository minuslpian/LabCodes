package com.app.banking;

import java.time.LocalDate;
import java.util.List;

public class ValidationRules {
	public static void checkAccNo(List<BankAccount> accs, int accountNo) throws BankExceptions {

		BankAccount newAcc=new BankAccount(accountNo);
		
		if(accs.contains(newAcc))
			throw new BankExceptions("Account already exists with this Number!!!!!!");
			
	}
	
	public static AccountType checkAccType(String t)  {
		return AccountType.valueOf(t.toUpperCase());
	}
	public static LocalDate checkDate(String d) {
		return LocalDate.parse(d);
	}
	public static double checkOpeningBalance(double bal,double minBal) throws BankExceptions{
		if(bal < minBal)
			throw new BankExceptions("Amount less than minimum balance");
		return bal;
	}
}
