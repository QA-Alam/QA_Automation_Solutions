package com.usa.java.practice;

public class Global_Variable {
     
	static int income;
	static String firstName;
	static String information;

// This is a global variable and i have an access the global variable within my project any packages any class 
// How you can call static variable in other classes = By class name 
	public static void getSomayaInfo() {
		income = 11000;
		firstName = " Somaya ";
		information = " 2345235 ";
		System.out.println(income + firstName + information);
	}

	public void getMoktaInfo() { 
		income = 8500;
		firstName = " Mukta";
		information = " 83648589 ";
		System.out.println(income + firstName + information);
	}

	public void getRakibInfo() {
		income = 9500;
		firstName = " Rakib";
		information = " 5225 69th st";
		System.out.println(income + firstName + information);
	}

	
	 void getAlamInfo() {
		income = 10000;
		firstName = " Alam";
		information = " Bangladesh";
		System.out.println(income + firstName + information);
	}
	
	
	// How to call non-static method?
	// By creating obj
	// How you create the object?
	// Ans: By class name
	// Give me the syntax how you create an object
	// Ans: ClassName objectName = new ClassName();

	public static void main(String[] args) {
		Global_Variable.getSomayaInfo();
		
		
		Global_Variable obj = new Global_Variable();
		obj.getRakibInfo();
		obj.getMoktaInfo();
		obj.getAlamInfo();
	}
}