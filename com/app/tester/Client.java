package com.app.tester;
import com.app.core.*;
import com.app.core.Stack;

import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in);){

		boolean b=true;
		Stack s = null;
		
		while(b){
			System.out.println("select from menu 1.fixed size 2.growable size 3.push 4.pop 5.Exit");
			switch(sc.nextInt()) {
			case 1:
				if(s==null)
					s= new FixedStack();
				
				else {
					System.out.println("You have already chosen a stack!!!");
				}
				break;
			case 2:
				if(s==null)
					s= new GrowableStack();
				else
					System.out.println("You have already chosen a stack!!!");
				break;
			case 3:
				System.out.println("enter id name address");
				Customer c=new Customer(sc.nextInt(),sc.next(),sc.next());
				if(s != null)
					s.push(c);
				break;
			case 4:
				System.out.println(s.pop());
				break;
			case 5:
				b=false;
				break;
			}
		}
	}}

}
