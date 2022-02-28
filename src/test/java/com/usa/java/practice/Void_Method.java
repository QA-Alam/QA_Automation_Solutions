package com.usa.java.practice;

public class Void_Method {
	int salary;
	int bonus;
	int performance;
	int cola;

	// Non-static method as well as void method
	public void getEmployeesInfo() {
		int total;
		salary = 98000;
		bonus = 3000;
		performance = 2000;
		cola = 6000;

		total = salary + bonus + performance;

		System.out.println("This my total salary per year : " + total);

	}

	// How you call non-static method inside another methods?
	// By creating obj
	// How you create the object?
	// Ans: By class name
	// Give me the syntax how you create an object
	// Ans: ClassName objectName = new ClassName();

	public static void main(String[] args) {
		Void_Method obj = new Void_Method();
		obj.getEmployeesInfo();
	}

}
