package com.encapsulation;

// What is the encapsulation?

// Encapsulation in java is a process of wrapping code and 
// data together in to a single unit

// First able i have to use private access modifier,

// 2nd able i have to use getter & setter method
// I have to finish within the class

// If i need to be access in other class private variable or method
// i have to use getter and setter method public access modifier
// to get access in other class
// but i am unable to see the implementation data only see the out come

// Can you create a class as private 
// Ans: No it not possible 
// But i can create Variable & method as well 
public class EncapsulationClassA {
// First condition -> (declare  the variable with private access modifier)
	private String job = "QA Automation Engineer";
	private int salary = 8000;

// 2nd conditions (Create a getter & setter method)
// How we Create getter & setter method 

// Right click inside the class + select source + getter & setter option + 
// expand it and select get Method 

	public String getJob() {
		return job;
	}

	public int getSalary() {
		return salary;
	}

// 3rd condition 
// Complete within the class

	public static void main(String[] args) {
		EncapsulationClassA obj = new EncapsulationClassA();
		System.out.println("My current role is : " + obj.getJob());
		System.out.println("My Salary is : " + obj.getSalary());
	}

}
