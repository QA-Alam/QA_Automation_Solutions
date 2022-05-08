package com.usa.testng;

import org.testng.annotations.Test;

public class TestNGTrueFalse {

	
	@Test (enabled= true)
	public void verifyTravel(){
	   System.out.println("Travel history successful ");
	}
	
	@Test (enabled= false)
	public void verifyIncome2(){
	   System.out.println ("Income history successful 2");
	}
	
	@Test (enabled= false)
	public void verifyIncome(){
	   System.out.println ("Income history successful");
	}
}
