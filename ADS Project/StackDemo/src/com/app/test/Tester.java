package com.app.test;

public class Tester {

	public static void main(String[] args) {
		Stack s= new Stack();
		try {
			s.push(10);
			s.push(20);
			s.push(30);
//			s.push(40);
//			s.push(50);
			
			System.out.println(s.pop());
			System.out.println(s.pop());
			System.out.println(s.pop());
//			System.out.println(s.pop());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	
			

	}

}
