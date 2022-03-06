package com.inheritance;

public class Parents extends GrandParent {
	// This is a single level inhabitance
	// Parent extends the grandparent class
	protected void getBigHouse() {
		System.out.println("I have a big house ");
	}
	public static void main(String[] args) {
		// if i create parent class object then i get access both class properties
		// If i create a grandparent class object then i get only grandparent properties
		// GrandParent obj1 = new GrandParent();
		Parents obj = new Parents();
		obj.getBuildings();
		obj.getBigHouse();

	}

}
