package com.app.company;

import java.io.Serializable;

public class Employee implements Serializable{
	private static int id=1;
	private String name;
	private double salary;
	private DeptType Type;
	{
		id++;
	}
	public enum DeptType {
		MAINTENANCE, SECURITY, QUALITY, SALES, MANAGEMENT, DEVLOPEMENT
	}
	public Employee(String name, double salary, String type) {
		super();
		this.name = name;
		this.salary = salary;
		Type = DeptType.valueOf(type.toUpperCase());
	}
	public double getSalary() {
		return salary;
	}
	public static int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", Type=" + Type + "]";
	}

	

}
