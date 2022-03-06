package com.inheritance;

public class ClassC implements ClassA, ClassB {

	// This one is current class property
	public void getName() {
		System.out.println("This method from class C");
	}

	// This method from interface class property which one was incomplete or abstract
	// Method in class B, Whenever we call inside the complete class using implement key word
	// Then it will be automatically Override inside the complete class
	// or implemented the method inside complete class
	@Override
	public void getProperties() { //
		System.out.println("This method from class B");

	}

	@Override
	public void getSalary() {
		System.out.println("This method from class A ");

	}

	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.getSalary();
		obj.getProperties();
		obj.getName();
	}

}
