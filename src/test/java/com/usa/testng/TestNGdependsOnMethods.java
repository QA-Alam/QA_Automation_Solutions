package com.usa.testng;

import org.testng.annotations.Test;

public class TestNGdependsOnMethods {

	@Test 
	public void getAddress() {
     System.out.println("1");
	}
	@Test (dependsOnMethods = {"getAddress"})
	public void getSalary() {
		  System.out.println("2");
	}
	@Test (dependsOnMethods = {"getSalary"})
	public void getStartDate() {
		  System.out.println("3");
	}
	@Test (dependsOnMethods = {"getStartDate"})
	public void getEmployees() {
		  System.out.println("4");
	}
}
