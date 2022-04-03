package com.usa.collections;

import java.util.Arrays;

public class Array_Object {
	
	public static void main(String[] args) {
		
		String name1 = "Alam";
		String name2 = "Alam";
		String name3 = "Refat";
		String name4 = "Emon";
		String name5 = "Somiaya";
		String name6 = "Rakib";
		String name7 = "Jahan";
		
		int a = 10;
		     a = 20;
		     a = 30;
		     a = 40;
		    // System.out.println(a);

   //  What is an array 
   // Array is an object as well as non-primitive data type 
   // Array  can handle group of object in a single unit or variables 
   // array i can use two way 
   // One single dimension and multi-dimension
  // What is dimension?
  //  single dimension is [] &  multi-dimension [][]
  // Why you need single dimension array 
  // If i need to handle single column then i have to use single dimension [] esarray 
   // If i need to handle multiple column & row then i have to use multi-dimension [][] array 	     
		     
    // What is drawback in array? dis-advantage 
    //  Array length is fixed
   // Array use the length keyword 
	// declare a array 19th data is length     
		     
	//	  How to declare a array
		int  num [] = new int [20];
		num [0] = 10;
		num [1] = 11;
		num [2] = 12;
		num [3] = 13;
		num [4] = 14;
		num [5] = 15;
		num [6] = 16;
		num [7] = 17;
		num [8] = 18;
		num [9] = 19;	
		num [9] = 19;	
		//num [10] = 20;   We are getting ArrayIndexOutOfBoundsException: 
		// num [11] = 21;	
		//System.out.println("Colling by index : "+ num[5]);
		
	int numbers[] = {10, 20, 30, 40, 60, 70, 80, 90, 100};	
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);

	}
	
	
	
	String name[] = {"Tawhid","Alam","Rakib","Sumaya","Sumona","Emon","Shika","Taniya","Zara","Sharmin", 
			                   "Jahan", "Bellal", "Sabiha","Mukta", "Farib", "Sagor", "Tanzir", "Shabuddin", "Zubair", "Refat"};
	
	//System.out.println("Colling by index : "+ name[5]);
	
	//System.out.println(Arrays.asList(name));
	
	
	int arr [][] =    {{1, 2, 3, 4, 5, 6},
			                 { 7, 8, 9, 10, 11},  // Row  0, 1, 2  //  0=3  9=1
			                 {12, 13, 14, 15}};
	//System.out.println(arr[1][4]);
			           
		
	}

}
