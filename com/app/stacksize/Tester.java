package com.app.stacksize;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc= new Scanner(System.in);){
			
		
		
		boolean b=true;
		Stack s = null;
		
		System.out.println("select from menu 1.fixed size 2.growable size 3.");
		if(sc.nextInt() == 1)
			s= new FixedStack();
			
		else if(sc.nextInt() == 2)
			s=new GrowableStack();
		else
			System.out.println("wrong input!!");
		while(b){
			System.out.println("select from menu 1.push 2.pop 3.Exit");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("enter id name address");
				Customer c=new Customer(sc.nextInt(),sc.next(),sc.next());
				if(s != null)
					s.push(c);
				break;
			case 2:
				System.out.println(s.pop());
				break;
			case 3:
				b=false;
				break;
			}
		}
	}}

}
