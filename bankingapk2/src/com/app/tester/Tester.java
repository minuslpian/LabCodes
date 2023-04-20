package com.app.tester;
import com.app.banking.*;

import static com.app.banking.ValidationRules.*;
import java.time.LocalDate;
import java.util.*;

public class Tester {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
		List<BankAccount> accounts=new ArrayList<>(TestData.populateAccount());
	
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
					
					accounts.add(new BankAccount(accNo,customerName,accType,d,accType.getMinAmt(),openingBalance));
					
					break;
				case 2:
//					System.out.println("Enter your acc no: ");
//					int i = accounts.indexOf(new BankAccount(sc.nextInt()));
//					System.out.println(accounts.get(i));
					for(BankAccount b: accounts)
						System.out.println(b);
					break;
				case 3:
					System.out.println("Enter your acc no and deposit amt: ");
					int index = accounts.indexOf(new BankAccount(sc.nextInt())) ;
					accounts.get(index).deposit(sc.nextDouble());
					break;
				case 4:
					System.out.println("Enter your acc no and withdraw amt: ");
					int in = accounts.indexOf(new BankAccount(sc.nextInt())) ;
					accounts.get(in).withdraw(sc.nextDouble());
					break;
				case 5:
					System.out.println("Enter your acc no, benefitiary acc no and amount to transfer");
					int indexOfSender = accounts.indexOf(new BankAccount(sc.nextInt()));
					int indexOfReceiver = accounts.indexOf(new BankAccount(sc.nextInt())) ;
					accounts.get(indexOfSender).fundTransfer(sc.nextDouble(), accounts.get(indexOfReceiver));
					break;
					
	            case 6:
					Collections.sort(accounts);
					break;
                case 7:
					Collections.sort(accounts, new Comparator<BankAccount>() {
						@Override
						public int compare(BankAccount a1, BankAccount a2) {
							if(a1.getAccountNo()> a2.getAccountNo())
								return -1;
							else if(a1.getAccountNo()== a2.getAccountNo())
								return 0;
							else
								return 1;
						}
					});
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
