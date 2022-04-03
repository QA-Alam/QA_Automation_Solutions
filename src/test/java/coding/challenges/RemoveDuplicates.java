package coding.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class RemoveDuplicates {

	// How to find out duplicate value from a strings

	// @Test
	public void getFindOutDuplicateFromStrings() {

		// I declare a string arrays to added to multiple value in a single objects
		String[] values = { "Alam", "Alam", "Jahan", "Rakib", "Emon", "Balal", "Sumiya" };

		// as we know set cannot handle the duplicate values,
		// so i can use a set interface to remove the duplicate values

		// How to declare a hash-set?
		// Set is a interface and hash-set is a class
		Set<String> store = new HashSet<>();

		// Then i have to use a looping, there are many loop like, basic loop, advance
		// loop, while loop, do while and etc..,
		// However, i gonna use a advance loop

		for (String duplicate : values) {

			// Now i have use java condition
			if (store.add(duplicate) == false) {

				// Finally i get my duplicate data
				System.out.println("My Duplicate value is a : " + duplicate);
			}

		}

	}

	// How to remove duplicate value from numeric number
	// @Test
	public void getRemoveDuplicateFromNumeric() {
		// How to declare a ArrayList?
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(10);
		num.add(10);
		// Remove the duplicate by using stream API, And syntax is below
		List<Integer> duplicate = num.stream().distinct().collect(Collectors.toList());

		System.out.println("My unique value is a : " + duplicate);
	}

	// How to find out max & min number from array list
	// @Test
	public void getMaxAndMinNumbers() {
		// How to declare a ArrayList?
		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(10);
		num.add(10);

		// Collections is a java utility class
		// Help of Collections class i can call max & min method then i can pass the
		// ArrayList object,
		// again i have to store in one int variable which one can get result
		int max = Collections.max(num);
		System.out.println("My max number is  : " + max);

		int min = Collections.min(num);
		System.out.println("My min number is  : " + min);
	}

// How to find out the second highest number from array 
	// @Test
	public void getSecondHighestNumber() {
		// How to declare a array?
		int num[] = { 10, 100, 40, 70, 50, 60, 30, 80, 20 };

		// Find out the length and store in one int variable
		int size = num.length;

		// Then i have to use sort method which one can help us to sort the values
		Arrays.sort(num);

		// Help of array variable passing the parameter like [lenght storing object -
		// which
		// value i need to find out]
		int result = num[size - 2];
		System.out.println("2nd highest number is : " + result);

	}

	// How to convert int to string & String to int?
	// @Test
	public void getConvertDataType() {
		int num = 1234;
		String convertString = new Integer(num).toString();
		System.out.println("convert int to string :  " + convertString);

		String value = "5675";
		int convertInt = Integer.parseInt(value);
		System.out.println("convert String to int :  " + convertInt);
	}

	// @Test
	// How to brake the sentence or words
	public void getBreakWords() {
		String name = "United State of America";
		// I have to use loop
		for (String split : name.split(" ")) {
			System.out.println(split);
		}
	}

	// @Test
	// How to verify the value is present or not from array
	public void gteVerifyPresentElements() {
		String[] value = new String[] { "Selenium", "Java", "Maven", "Cucumber", "TestNG", "JDBC" };
		List<String> list = Arrays.asList(value);
		// List<String> list = Arrays.asList( "Selenium", "Java", "Maven", "Cucumber",
		// "TestNG", "JDBC" );
		if (list.contains("Alam")) {
			System.out.println("My element is preasent");
		} else
			System.out.println("Element is not preasent");

	}

	// @Test
	// 99.99% common
	// How to reveres a string without inbuilt method of predefine method
	public void getReveresString() {

		// I have to declare a value with string variable
		String text = "sysofnI"; // Infosys

		// Then i have t0 declare a char array, because char can handle characters
		char[] rev = text.toCharArray();

		// After declare a char array i have to use a loop, inside the loop i can
		// decrement the text using i --
		for (int i = rev.length - 1; i >= 0; i--) {

			// Finally i can get the value by char array object and passing looping variable
			// i
			System.out.print(rev[i]);

		}

	}

	// How to compare the two data/string
	// What is deference between == and equal method
	@Test
	public void getCompareData() {
		// Variable
		String name1 = "Alam"; // Expected data
		String name2 = "Alam"; // Actual data

		// == return true or false
		// variable to variable is true if we are use == sign
		System.out.println("variable to variable is true, if maching the data from string : " + (name1 == name2)); // true
		// equal method return true or false
		// variable to variable is true if we are use equal method
		System.out.println("variable to variable is true, if maching the data from string : " + (name1.equals(name2))); // true

		// Object to variable we cannot compare using == sign
		String name3 = new String("Alam");

		System.out.println("variable to object is fales , if maching the data from string : " + (name1 == name3)); // false

		// Object to variable we can compare using equal method
		System.out.println("variable to object is true, if maching the data from string : " + (name1.equals(name3))); // true

		// Object to Object is true if we are using equal method
		String name4 = new String("Alam");
		System.out.println("Object to Object is true, if maching the data from string : " + (name3.equals(name4))); // true
	}

}