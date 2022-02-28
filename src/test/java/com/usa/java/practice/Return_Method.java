package com.usa.java.practice;

public class Return_Method {
	String name;
	int num;
	double value = 100.99;

	public String getInfo() { // String default value is null
		return name;
	}

	public int getInfo1() { // int default value is 0
		return num;
	}

	public double getInfo2() { // double default value is 0.0
		return value;
	}

	public static void main(String[] args) {
		Return_Method obj = new Return_Method();
		System.out.println("String default value is : " + obj.getInfo());
		System.out.println("int default value is : " + obj.getInfo1());
		System.out.println("Return values is : " + obj.getInfo2());  // 
		
		// End of the day before leaving the job i have to push the code in central repo !
		// Today 5 PM my job is done 
		// My off-shore team start the work at there day time, before they start the work they pull the existing code 
		
		
		
	}

}
