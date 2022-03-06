package com.encapsulation;

public class EncapsulationClassB {

	public static void main(String[] args) {
		EncapsulationClassA obj = new EncapsulationClassA();
		System.out.println("My current role is : " + obj.getJob());
		System.out.println("My Salary is : " + obj.getSalary());

	}
}
