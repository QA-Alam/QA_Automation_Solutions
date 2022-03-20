package com.abstraction;

public abstract class AbstructClassA {

	// What is the abstraction?
	// Abstraction means in-complete class, hiding the implementation and showing functionality
	// Abstraction i can implement two way

	// One, is Abstract class -> Abstract can contain 0 to 100% abstract method
	// or (complete / concrete) and abstract method,
	// If inside the class one abstract method is present, then class automatically will be abstract class
	// abstract class finish within 2nd class or sub class or another class
	// abstract class can inherit by using extends key word 

	// Two, Interface -> Interface can contain only abstract method or 100% abstract  method
	// Interface inherit by using implements key word 
	
	
	// What is an interface?
	// Ans: An Interface is a completely abstract class that is used to group related methods with empty bodies 
	// Interface access must be implemented by another class 

	// abstract method
	public abstract void getSalary();

	// (complete - concrete) method
	public void getInfo() {
		System.out.println("I am a concrete method ");
	}
	
	public void getInfo1() {
		System.out.println("I am a concrete method ");
	}
	
	public void getInfo2() {
		System.out.println("I am a concrete method ");
	}

	
	public void getInfo5() {
		System.out.println("I am a concrete method ");
	}
	public static void main(String[] args) {
		//AbstructClassA obj = new AbstructClassA();
	}
}