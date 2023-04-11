package com.app.fruits;

public class Mango extends Fruit{
	
	public Mango(String color,double weight,String name,boolean fresh) {
		super(color,weight,name,fresh);
	}
	
 @Override
 public String taste() {
	 return "Sweet";
 }
 
 public void pulp() {
	 System.out.println("Name : "+getName()+" Color : "+getColor()+" Creating pulp");
		
	 
 }
 public void specFunc() {
	 this.pulp();
 }
}

