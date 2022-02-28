package com.usa.java.practice;

public class Parameter_Method {

	public void getEmployeesInfo(String name) {
		System.out.println(name);

	}

	public String getInfo(String name) {
		return name;

	}

	public static String getInfo1(String name) {
		return name;

	}

	public static void main(String[] args) {
		System.out.println(Parameter_Method.getInfo1("01 Alam"));

		Parameter_Method obj = new Parameter_Method();
		obj.getEmployeesInfo("01 Refat");
		System.out.println(obj.getInfo("01 Sazzad"));
	}
}
