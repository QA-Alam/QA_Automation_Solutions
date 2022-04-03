package com.usa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import org.testng.annotations.Test;

public class List_Interface {

	// How to declare ArrayList, LinkedList, Vector & Stack
	@Test
	public static void getArrayList() {
		
		int a = 20;    // 1byte  100%
		// One way
		// Non-Generic code, Java old version like 1.2 - 1.5
		ArrayList object = new ArrayList();
		object.add(1);
		object.add("Alam");
		object.add(14);

		// 2nd way
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
	 // list.add("Alam");
		list.add(1);

		// Class to class create a object
		ArrayList<String> name = new ArrayList<>();
		name.add("Alam");
		name.add("Tawhid");
		name.add("Rakib");  // 2
		name.add("Rakib");  // 50 %
		name.add(null);
		name.add(null);
		name.add(null);
		

		// 3rd way
		// Interface to class create instances
		List<Integer> number = new ArrayList<>();  // Imported
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(49);
		number.add(56);

		// 4th way
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
		//System.out.println(numbers);
		// Basic loop	
		for (int i = 0; i < numbers.size(); i++) {
			//System.out.println(numbers.get(i));

		}

		// Advance loop
		List<String> names = Arrays.asList("Selenium", "Java", "Maven", "Cucumber", "TestNG", "Apache POI");
		for (String myValue : names) {
			System.out.println(myValue);
		}

	}
//   
	public static void getLinkedList() {
		LinkedList<String> link = new LinkedList<>();
		link.add("Selenium");  
		link.add("Java");
		link.add("Maven");
		link.add("Cucumber");
		link.add("TestNG");
	}

	public static void getVector() {
		Vector<String> link = new Vector<>();  // performances is slow 
		link.add("Selenium");  // 
		link.add("Java");
		link.add("Maven");
		link.add("Cucumber");
		link.add("TestNG");  // 100%
		link.add("Cucumber"); 
	}
}
