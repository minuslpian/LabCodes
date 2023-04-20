package com.app.banking;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ValidationRules {
	public static void checkAccNo(Map<Integer,BankAccount> accs, int accountNo) throws BankExceptions {

		BankAccount newAcc=new BankAccount(accountNo);
		
		if(accs.containsKey(newAcc))
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
