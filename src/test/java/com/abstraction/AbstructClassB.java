package com.abstraction;

public class AbstructClassB extends AbstructClassA{

	@Override
	public void getSalary() {
		System.out.println("I am a abstruact method ");
		
	}
	public static void main(String[] args) {
		AbstructClassB obj = new AbstructClassB();
		obj.getSalary();
		obj.getInfo();
	}
}
