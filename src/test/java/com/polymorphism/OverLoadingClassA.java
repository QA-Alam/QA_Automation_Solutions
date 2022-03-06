package com.polymorphism;

public class OverLoadingClassA {

	// What is the polymorphism ?
	// polymorphism is many forms, Which one can change the behaver based on the situation 
	
	// polymorphism i can approach two way
	// 1. Method overloading, Static binding or compile time polymorphism
	// 2. Method overriding, dynamic or run time polymorphism
	
	
	// What is method over loading?
	// Ans: Same method i can use again & again by changing the parameter 
	// and finish within the class 
	
	// How you change the parameter?
	// Ans: I can change the parameter by using the data type & location of data type 
	
	public void getSalary(int salary) { // This parameter i have only one argument 
		System.out.println(salary);
	}
	
	public void getSalary(int salary, int id) { // this parameter i added 2 argument 
		System.out.println(salary );
		System.out.println(id);
	}
	
	public void getSalary(double salary, int id) { // This parameter change the data type 
		System.out.println(salary );
		System.out.println(id);
	}
	
	public void getSalary( int id, double salary) {   // This parameter change the location 
		System.out.println(salary);
		System.out.println(id);
	}
	
	public static void main(String[] args) {
		OverLoadingClassA obj = new OverLoadingClassA();
		//obj.getSalary(9000);
		obj.getSalary(5665, 4873);
	}
}
