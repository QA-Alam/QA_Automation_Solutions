package com.usa.testng;

import org.testng.annotations.Test;

public class TestNGRunMultipleTimes {

	@Test (invocationCount = 100)
	public void getEmployees() {
		System.out.println("Test Exceuted");
	}
}
