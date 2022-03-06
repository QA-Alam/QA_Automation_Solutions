package com.inheritance;

public class ChildClass extends  Parents{
	// This is a multilevel inhabitance 
	// Child extends parent & parent extends grandparent class
	public void getVehicle() {
		System.out.println("I have a BMW");
	}
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.getVehicle();  // This property from child class 
		obj.getBuildings();  // This property from grandparent  class
		obj.getBigHouse();  // This property from parents class
	}
}
