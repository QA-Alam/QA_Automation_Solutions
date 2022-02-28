package com.usa.java.practice;

public class Static_Method {

	static int salary;
	static int bonus;
	static int performance;
	static int cola;

	// static method cannot handle non-static variable

	// static method as well as void method
	public static void getEmployeesInfo() {
		int total;
		salary = 98000;
		bonus = 3000;
		performance = 2000;
		cola = 6000;

		total = salary + bonus + performance;

		System.out.println("This my total salary per year : " + total);

	}

	// How you call static method or variable inside another methods?
	// By class name
	public static void main(String[] args) {
		Static_Method.getEmployeesInfo();
	}

}
