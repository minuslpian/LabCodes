package com.app.stacksize;

public interface Stack {
	int STACK_SIZE = 10;
	void push(Customer c);
	Customer pop();
}
