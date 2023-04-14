package com.app.core;

public class GrowableStack extends FixedStack implements Stack{
	private Customer[] arr= new Customer[STACK_SIZE];
	private int top=0;
	@Override
	public void push(Customer c) {
		if(c!= null && top < arr.length) {
			arr[top++]=c;
		}
		else {
			Customer temp[]= new Customer[arr.length*2];
			for(int i=0;i<arr.length;i++) {
				temp[i]=arr[i];
			}
			arr=temp;
		}
	}
	
}
