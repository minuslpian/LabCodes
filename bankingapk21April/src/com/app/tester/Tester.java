package com.app.tester;
import static com.app.banking.ValidationRules.*;

import com.app.banking.*;
//import static com.app.banking.ValidationRules.checkDate;
//import static com.app.banking.ValidationRules.checkOpeningBalance;

import java.time.*;
import java.util.*;


//import com.app.banking.AccountBalComparator;
import com.app.banking.AccountType;
import com.app.banking.BankAccount;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
//		List<BankAccount> accounts=new ArrayList<>(TestData.populateAccount());
		Map<Integer,BankAccount> accounts = TestData.populateAccountMap(TestData.populateAccount());
		boolean entry=true;
		while(entry) {
			System.out.println("Enter the choices : 1.Add account details 2.Display account summary by accNo"
					+"3.Withdraw Amount 4.Deposit Amount 5.Transfer Funds to Another Account");
			try {
				switch(sc.nextInt()){
				case 1:	
					System.out.println("enter : accountNo customerName type Opening Balance openingDate(yyyy-MM-dd): ");					
					int accNo = sc.nextInt();
					checkAccNo(accounts,accNo);
					String customerName = sc.next();
					AccountType accType = checkAccType(sc.next());
					double openingBalance = checkOpeningBalance(sc.nextDouble(),accType.getMinAmt());
					LocalDate d = checkDate(sc.next());				
					accounts.put(accNo, new BankAccount(accNo,customerName,accType,d,accType.getMinAmt(),openingBalance));
					
					break;
				case 2:
					BankAccount acc;

					System.out.println("Showroom details ");
					for (BankAccount v : accounts.values())
						System.out.println(v);// v.toString()
					break;
				case 3:
					System.out.println("Enter your acc no and deposit amt: ");
					acc = accounts.get(sc.nextInt());
					if(acc== null)
						throw new BankExceptions("Invalid Account No!!!");
					else
						acc.deposit(sc.nextDouble());
					
					break;
				case 4:
					System.out.println("Enter your acc no and withdraw amt: ");
					acc = accounts.get(sc.nextInt());
					if(acc== null)
						throw new BankExceptions("Invalid Account No!!!");
					else
						accounts.get(sc.nextInt()).withdraw(sc.nextDouble());
					break;
				case 5:
					System.out.println("Enter your acc no, benefitiary acc no and amount to transfer");
					acc = accounts.get(sc.nextInt());
					if(acc == null) {
						throw new BankExceptions("Invalid Sender Account No!!!");
					}
					BankAccount acc2 = accounts.get(sc.nextInt());
					if(acc2 == null)
							throw new BankExceptions("Invalid Receiver Account No!!!");
						else
							acc.fundTransfer(sc.nextDouble(), acc2);
				
					break;
					
	            case 6:
					TreeMap<Integer,BankAccount> accounts1 = new TreeMap<>(accounts);
					for(BankAccount a: accounts1.values())
						System.out.println(a);
						
					break;
                case 7:
                	ArrayList<BankAccount> collectionAccs = new ArrayList(accounts.values());
                	
					Collections.sort(collectionAccs, new Comparator<BankAccount>() {
						@Override
						public int compare(BankAccount a1, BankAccount a2) {
							return a1.getOpeningDate().compareTo(a2.getOpeningDate());			
						}
					}	
				);
					for (BankAccount v : collectionAccs)
						System.out.println(v);
					break;
					
                case 8:
                	collectionAccs = new ArrayList(accounts.values());
					Collections.sort(collectionAccs,new AccountBalComparator());
					for (BankAccount v : collectionAccs)
						System.out.println(v);
					break;
				case 0:
					entry=false;
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
