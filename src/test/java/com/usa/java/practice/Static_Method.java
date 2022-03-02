package com.usa.java.practice;

public class Static_Method {

	static int salary;
	static int bonus;
	static int performance;
	static int cola;

	int sum;

	// static method cannot handle non-static variable

	// static method as well as void method
	public static void getEmployeesInfo() {
		int total;
		salary = 98000;
		bonus = 3000;
		performance = 2000;
		cola = 6000;
		// sum = 1000; // this is a instance variable & it cannot handle static method

		total = salary + bonus + performance;

		System.out.println("This my total salary per year : " + total);

	}

	// Non-method can handle static variable
	public void getName() {
		salary = 98000; // This is a static variable
		sum = 3000; // This is a instance variable
	}

	// How you call static method or variable inside another methods?
	// By class name
	public static void main(String[] args) {
		Static_Method.getEmployeesInfo();
	}

}
