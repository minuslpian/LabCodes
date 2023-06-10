package com.app.test;

public class Stack{
	private int size;
	private int []arr;
	private int top;
	//default constructor
	public Stack() {
		size = 5;
		arr=new int[size];
		top = -1;
	}
	
	//parameterized constructor
	public Stack(int size) {
		this.size = size;
		arr=new int[size];
		top = -1;
	}
	// pushing new element to stack
	public void push(int num) throws Exception {
		if(!isFull()) {
			arr[++top]=num;
		}else {
			throw new Exception("Stack Overflow!!!");
		}
		
	}
	// popping out topmost element from stack
	public int pop() throws Exception {
		if(!isEmpty()) {
			return arr[top--];
		}
		else {
			throw new Exception("Stack Underflow!!!");
		}
		
	}
	// check if stack is full
	public boolean isFull() {
		return top==size-1;
		
	}
	// check if stack is empty
	public boolean isEmpty() {
		return top==-1;
		
	}
}