package com.app.banking;

import java.util.Collections;
import java.util.Comparator;

public class AccountBalComparator implements Comparator<BankAccount>{

	
		
		@Override
		public int compare(BankAccount a1, BankAccount a2) {
			return ((Double)a1.getAccountBalance()).compareTo(a2.getAccountBalance());
		}
	}	