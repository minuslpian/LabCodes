package com.app.operators;

import java.util.Scanner;

import com.app.test.Stack;


public class InfixToPostFix {
	
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			String s = sc.next();
			
			Stack s1 = new Stack(s.length());
			
			char[] arr = s.toCharArray();
			
			try {
				for(int i=0; i<arr.length; i++ ) {
					if(arr[i]>=40 && arr[i]<=47 ) {
						if(arr[i]==41) {
							while(!s1.isEmpty()) {
								int c= s1.pop();
								if(c != 40 && c != 41)
								 {
									System.out.println((char)c);
								}	
							}	
						}
						s1.push(arr[i]);
				}
					else 
						System.out.println(arr[i]);
				}
				
						
			} catch (Exception e) {
				e.printStackTrace();
			}
					
			
		}
	}
}
