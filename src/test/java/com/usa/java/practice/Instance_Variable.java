package com.usa.java.practice;

public class Instance_Variable  {  // This is a class
	
	//int salary  = 8000;
	//String name = " Alam ";
	//String info =" 123-13-3534 ";
	
	// This is a instance variable & i have the access instance variable within the class and any method 
   // static method cannot handle the instance variable or non static variable 
	
	int salary;
	String name;
	String info;
	
	public  void getSalary() { // This is a one method
		//GlobalVariable.firstName;
	
		salary = 10000;
		name = "Alam";
		info = "123-13-3534";
        System.out.println(salary + name + info);  
	}
	
	
	public  void getName() {  // This is a two method
		salary = 8000;
		name = "Tawhid";
		info = "234-13-2334";
		System.out.println(salary + name + info);
	}
	public void getInfo() {  // This is a three method
		salary = 9000;
		name = "Emon";
		info = "454-13-4564";
		System.out.println(salary + name + info);
	}
	
	// How you call the method inside the main method?
	// Ans: By creating object 
	// How you create the object?
	// Ans: By class name 
	// Give me the syntax how you create an object 
	// Ans: ClassName objectName = new ClassName();
	
	public static void main(String[] args) {
		Instance_Variable obj = new Instance_Variable();  // Object
		obj.getName();
		obj.getSalary();
		obj.getInfo();

		
	}
}
