package com.inheritance;

public class GrandParent {
	
	// What is the inheritance? 
	// We can transfer the common properties one class to another class 
	
	// How you use inheritance?
	// Ans: We have to use protected  access modifier & Extends key word 
	
	// There are many types of inheritance 
	// 1, Single level inheritance
	// 2. Multi level inheritance
	// 3. Multiple inheritance
	
	// What is the single level inheritance?
	// Ans: transfer the common properties one class to another class or Class A to B, or Parent to child 
	
	// What is the Multi level inheritance?
	// Ans: transfer the common properties from Grandparent to parent to child, Or Class A to B to C, 
	
	// What is the Multiple inheritance?
	// Ans: Multiple is not possible in  inheritance concept or class level inheritance 
	// Because of diamond issues
	// but It is possible with interface level using implements key word  
	


	protected void getBuildings() {
		System.out.println("I have a one big building");
	}

}
