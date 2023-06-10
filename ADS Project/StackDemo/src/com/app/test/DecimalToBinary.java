package com.app.test;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		int size=0;
		int num1=num;
		// determine size for stack
		while(num!=0) {
			num=num/2;
			size++;
		}
		Stack s= new Stack(size);
		try {
			// push binary values into stack
			while(num1 != 0) {
					s.push(num1%2);
					num1=num1/2;
			}
			// pop binary values from stack
			for(int i=0;i<size;i++) {
				System.out.print(s.pop());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
