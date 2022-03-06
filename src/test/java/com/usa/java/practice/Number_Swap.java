package com.usa.java.practice;

public class Number_Swap {
	// static int x = 100;
	// static int y = 200;
	// How to swap the numbers using third variable
	public static void swapTheNumbersUsingThirdVariable() {
		int temp; // This is a third variable
		int x = 100; // x value is 100 but we need to be swap as 200
		int y = 200; // y value is 200 but we need to be swap as 100
		// ----------------------------------------------------------------//
		temp = x; // temp value is 100
		x = y; // x value is 200
		y = temp; // y value is 100

		// verify the swap values
		System.out.println("x =  " + x);
		System.out.println("y =  " + y);
	}

	// How to swap the number without third variable
	public static void swapTheNumbersUsingWithOutThirdVariable() {
		int x = 100; // x value is 100 but we need to be swap as 200
		int y = 200; // y value is 200 but we need to be swap as 100

		x = x + y; // x value is 300
		y = x - y; // y value is 100
		x = x - y; // x value is 200

		// verify the swap values
		System.out.println("x =  " + x);
		System.out.println("y =  " + y);
	}

	public static void main(String[] args) {
		Number_Swap.swapTheNumbersUsingWithOutThirdVariable();
	}
}
