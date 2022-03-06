package com.polymorphism;

public class OverRidingClassB extends OverRidingClassA {

	
	  public void getVehicle() { 
		  System.out.println("I have a BMW car "); }
	 
	// This is override method i change the value
	public void getMarry() {
		System.out.println("My new wife name SABINA");
	}

	public static void main(String[] args) {
		OverRidingClassB obj = new OverRidingClassB();
		obj.getVehicle();
		obj.getGold();
		obj.getCash();
		obj.getMarry();
	}
}
