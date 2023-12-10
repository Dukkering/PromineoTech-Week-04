package week04Project;

import java.lang.StringBuilder;

public class Week04JavaProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Problem 1 - Create an array of int called ages

		int[] ages = {3,9,23,64,2,8,28,93};
		
		// a -Subtract the value of the first element in the array from the last element
		
		int result = ages[ages.length - 1] - ages[0];
		
		System.out.println(result);
		
		
		// b - Create a second array of int called ages2 with nine elements
		int[] ages2 = {20, 30, 50, 70, 90, 11, 13, 15, 25};
		
		// b.ii - Repeat the subtraction method to show it works regardless of array length; 
		// that the index usage is dynamic.
		
		result = ages2[ages2.length - 1] - ages2[0];
		
		System.out.println(result);
		
		
		// c - Use a loop to iterate through the array and calculate the average age
		// initializes averageAges variable
		int agesAverage= 0; 
		
		
		// Sets a for loop to iterate the number of times of elements in ages, once per
		// loop, and add each element in ages to ageAverage. ageAverage is then divided by
		// the number of elements in ages to get the average. 
		
		for (int i = 0; i <= ages.length - 1; i++) {
			agesAverage += ages[i]; 
		}
		agesAverage /= ages.length;
		
		System.out.println(agesAverage);
		
		// // // // //
		
		// Problem 2 - Create an array of String called names;
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// a - Use a Loop to iterate through the array and calculate the average number of letters
		// per name. Print the result to the console.
		
		// Initializing variables
		int totalLetters = 0;
		
		// Enhanced For loop to iterate the total # of letters to totalLetters
		for(String name : names) {
			totalLetters += name.length();
		}
		
		// Getting the average number of letters
		double averageLetters = (double) totalLetters / names.length;
		
		System.out.println(averageLetters);
		
		// b - Use a loop to iterate through the array again and concatenate all the names together,
		// separated by spaces, and print the result to the console.
		
		// Using a stringbuilder to iterate through the array of names
		StringBuilder allNames = new StringBuilder();
		for (String name : names) {
			allNames.append(name + " ");
		}
		// Converting from StringBuilder to String
		allNames.toString();
		
		System.out.println(allNames);
		
		// // // // //
		
		// 3 - How do you access the last elemeent?
		
		// You call upon the last number in the index of the array by calling on the arrayName.length - 1
		
		System.out.println(names[names.length - 1]);
		
		// // // // //
		
		// 4 - How do you access the first element of any array?
		
		// You call upon 0 in the index of the array
		
		System.out.println(names[0]);
		
		// // // // //
		
		// 5 - Create a new array of int called nameLengths. Write a loop to iterate over the previously created 
		// names array and add the length of each name to the nameLengths array.
		
		// Declaring the new array, and setting the length of the array to the number of elements in names
		int[] nameLengths = new int[names.length];
		
		// Iterating through names to populate nameLengths; The assigning index and value are both controlled
		// by the iteration of the i variable
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		// // // // //
		// 6 - Write a loop to iterate over the nameLengts array and calculate the sum of all the elements
		// in the array. Print to console.
		
		// Initializing an int variable to hold the value of the sum of nameLength
		int nameLengthTotal = 0;
		
		// Making a for loop to add together the values in nameLengths
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthTotal += nameLengths[i];
		}
		
		System.out.println(nameLengthTotal);
		
		// // // // //
		
		// 7 - Write a method that takes a String, word, and an int, n, as arguments and returns the word
		// concatenated to itself n number of times
		
		// Initializing the variables
		
		String word = "Balloon";
		int n = 5;
		
		// Calling on the created method, wordTimesN;
		String repeatedWord = wordTimesN(word, n);
		System.out.println(repeatedWord);
		
		// // // // //
		
		// 8 -  Write a method that takes two Strings, firstName and lastName, and returns a full name.
				// The full name should be the first and last name as a String separated by a space.
		// Initializing String variables
		String firstName = "John";
		String lastName = "Smith";
		
		// Calling on the created Method, createFullName
		String fullName = createFullName(firstName, lastName);
		System.out.println(fullName);
		
		// // // // //
		
		// 9 - Write a method that takes an array of int and returns true if the sum of all the ints in the 
		// array is greater than 100.
		
		// Building two arrays of numbers; One that is over 100, one that is 100 exactly, and one that is 
		// less than 100.
		int[] numbiesBig = {30, 35, 40, 45, 50};
		int[] numbiesCent = {25, 25, 25, 25};
		int[] numbiesSmall = {1, 2, 3, 4, 5};
		
		// Calling the method on each array to see if the conditions match true
		
		boolean isTrue = isUnder100(numbiesBig);
		System.out.println(isTrue);
		
		boolean isTrue2 = isUnder100(numbiesCent);
		System.out.println(isTrue2);
		
		boolean isTrue3 = isUnder100(numbiesSmall);
		System.out.println(isTrue3);
		
		// // // // //
		
		// 10 - Write a method that takes an array of double and returns the average of all elements in
		// the array.
		
		// Building an Array of double
		double[] doubleArray = {1.1, 4.6, 2.7, 2.6, 100.2};
		// Calling on the method to get the average of the array
		double anAverage = arrayAverage(doubleArray);
		System.out.println(anAverage);
		
		// // // // //
		
		// 11 - Write a method that takes two arrays out double and returns the average of all the 
		// elements in the array.
		
		// Building two arrays of double
		
		double[] firstArray = {1.2, 3.4, 5.6, 7.8, 9.0};
		double[] secondArray = {1.1, 3.2, 5.3, 7.4, 9.0};
		// Calling on the method to determine if firstArray's average is bigger than secondArray's average
		boolean isFirstBigger = averageArrayComparison(firstArray, secondArray);
		System.out.println(isFirstBigger);
		
		// // // // //
		
		// 12 - Write a method called willBuyDrink that takes a boolean isHotOutside, and a double
		// moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
		
		// Initializing variables to get a True result
		boolean isHotOutside = true;
		double moneyInPocket = 10.51;
		
		boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(willBuyDrink);
		
		// // // // // 
		
		// 13 - Create a method of your own that solves a problem. In comments, describe what it does and 
		// why you created it.
		
		// I created a simple method that takes time in hours, payrate per hour, and tax rate as a 
		// percentage. This method will multiply the payrate by the hours. then turn the tax rate into
		// a decimal and multiply that by the total income to get the total taxes. It then takes the 
		// total income minus the total taxes to get the adjusted income. I could have adjusted it further
		// to automatically include varying levels of tax rate instead based on income, but this has to 
		// be turned in in four hours and I'm learning a very important lesson about procrastination here.
		
		double totalIncome = wages(80, 15.0, 25);
		System.out.println(totalIncome);
		
	}
	
	// #7 Method
	// Takes two input, word and n, and has word concatenate itself n number of times, returns it.
	
	public static String wordTimesN (String x, int y) {
		// Declare a stringbuilder variable to hold the result
		StringBuilder repeatedWord = new StringBuilder();
		
		for (int i = 0; i < y; i++) {
			repeatedWord.append(x);
		}
		//Convert from StringBuilder to String, return repeatedWord
		return repeatedWord.toString();
	}
	
	// #8 Method
	// Takes two input in string format, concatenates them with a space, returns them.
	public static String createFullName (String x, String y) {
		String fullName = x + " " + y;
		return fullName;
	}
	
	// #9 Method
	// Takes the array input, adds it together, compares to see if the sum is under 100, returns
	
	public static boolean isUnder100 (int[] array) {
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		return sum > 100;
	}
	
	// #10 Method
	// Takes an array of Doubles, gives back the average of all elements
	
	public static double arrayAverage (double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	// #11 Method
	// Takes two arrays of double, averages each array, compares the average
	
	public static boolean averageArrayComparison (double[] array1, double[] array2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double number1 : array1) {
			sum1 += number1;
		}
		for (double number2 : array2) {
			sum2 += number2;;
		}
		return sum1 > sum2;
	}
	
	// #12 Method
	// Checks if the boolean is true and if the double > 10.50
	
	public static boolean willBuyDrink(boolean x, double y) {
		if (x == true && y > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// #13 Method
	
	public static double wages (int time, double payRate, double taxes) {
		double totalIncome = time * payRate;
		double taxRate = taxes * .01;
		double taxedIncome = totalIncome * taxRate;
		double adjustedIncome = totalIncome - taxedIncome;
		return adjustedIncome;
	}

}
