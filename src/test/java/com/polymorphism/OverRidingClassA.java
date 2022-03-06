package com.polymorphism;

public class OverRidingClassA {

	
	// What is the polymorphism ?
	// polymorphism is many forms, Which one can change the behaver based on the situation 
	
	// polymorphism i can approach two way
	// 1. Method overloading, Static binding or compile time polymorphism
	// 2. Method overriding, dynamic or run time polymorphism
	
	
	// What is method overriding?
		// Ans: Same method i can use again & again by changing the parameter 
	// and finish within the 2nd class or sub class
		
		// How you change the parameter?
		// Ans: I can change the parameter by using the data type & location of data type 
	
	// I am a parent & i give a condition to my son 
	// if you need all my properties you should marry with (Rani)
	public void getProperty() {
		System.out.println("I have a big house");
	}	
	public void getCash() {
		System.out.println("I have a $100000");		
	}
	public void getGold() {
		System.out.println("I have a 100 gram");	
	}
	// My son marry with rani 
	public void getMarry() {
		System.out.println("My wife name is Rani");
	}
}
