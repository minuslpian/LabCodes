package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String color,double weight,String name,boolean fresh) {
		super(color,weight,name,fresh);
	}
	
 @Override
 public String taste() {
	 return "Sour";
 }
 
 public void juice() {
	 System.out.println("Name : "+getName()+" Weight : "+getWeight()+" Extracting juice");
		
	 
 }
 public void specFunc() {
	 this.juice();
 }
}
