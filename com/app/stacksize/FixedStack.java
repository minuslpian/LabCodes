package com.app.stacksize;

public class FixedStack implements Stack {
	private Customer[] arr= new Customer[STACK_SIZE];
	private int top=0;
	@Override
	public void push(Customer c) {
		if(c!= null && top < arr.length) {
			arr[top++]=c;
		}
		else
			System.out.println("Stack is full!!!");

	}

	@Override
	public Customer pop() {
		
		if(top > 0) {
			Customer c=arr[top-1];
			top--;
			if(c != null)
				return c;
		}
		else
			System.out.println("Stack is empty!!!");
		return null;
	}

}
