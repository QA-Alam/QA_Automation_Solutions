package com.usa.java.practice;


public class Java_Condition {

	// Java condition for verify the data or elements 
	
	
	// How to verify the data in java?
	// By using java conditions 
	public static void main(String[] args) {
		 int time = 11;
		 
		// if (time == 11) {
		//	 System.out.println(" Good morning : " );
		 	 
		 if (time < 10) {
			 System.out.println(" Good Day : " );
		 }
		 
		 else  if (time > 12) {
			 System.out.println(" Good Morning : " );
		 }
		 
		 else  if (time < 5) {
			 System.out.println(" Good Afternoon  : " );
		 }
		 	 
		 else  {
			 System.out.println(" Good Evening  : " );
		 }
	}
}
