package com.usa.testng;

import org.testng.annotations.Test;

public class TestNGPriority {

	@Test (priority = 1)
	public void verifyTravel(){
	   System.out.println("Travel history successful ");
	}
	
	@Test (priority = 3)
	public void verifyIncome2(){
	   System.out.println ("Income history successful 2");
	}
	
	@Test (priority = 2)
	public void verifyIncome(){
	   System.out.println ("Income history successful");
	}
}
