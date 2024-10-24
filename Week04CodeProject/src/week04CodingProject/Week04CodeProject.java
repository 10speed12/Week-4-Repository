package week04CodingProject;

public class Week04CodeProject {
	public static void main(String[] args) {
		// 1: Creation of array of integers named ages with the values 3, 9, 23, 64, 2, 8, 28, and 93:
		int[] ages = {3,9,23,64,2,8,28,93};
		/*
		 1a: Programmatically subtracting the value of the first element in ages from
		 	the last element in ages:
		 */
		ages[ages.length-1]-=ages[0];
		// 1a: Printing new value of last element in ages to console:
		System.out.println("1a) New value of last item in ages after subtracting the value "
				+ "of the first item in ages from it is: " +ages[ages.length-1]);
		// 1b: Creating a new integer array named ages2 with 9 elements:
		int[] ages2 = { 1, 9, 23, 34, 2, 17, 24, 90, 43};
		// 1b-i: Ensuring that ages2 has nine elements:
		System.out.println("1b-i) ages2 array has "+ages2.length+" elements.");
		// 1b-ii: Repeating step 1a on ages2:
		ages2[ages2.length-1]-=ages2[0];
		System.out.println("1b-ii) New value of last item in ages2 after subtracting the value "
				+ "of the first item in ages2 from it is: " +ages2[ages2.length-1]);
		/*
		 1b-iii: Considering that ages and ages2 have different lengths, and I used the same technique
		 for steps 1a and 1b-ii, I believe that I have successfully shown that the method of index value 
		 utilization is dynamic.
		*/
		
		// 1c: Iterate through the array to calculate the average age and print result to console: 
		int ageSum=0; // Define placeholder for storing sum of ages:
		// Iterate through ages2:
		for(int i:ages2) {
			ageSum+=i; // Add current element to ageSum 
		}
		// Print out result of dividing ageSum by length of ages2:
		System.out.println("1c) The average value of ages2 array is "+(ageSum/ages2.length));
		// 2: Create String array names containing the values: Sam, Tommy, Tim, Sally, Buck, and Bob:
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		// 2a: Use a loop to iterate through names and calculate average length of the names:
		int nameLengthSum=0; // Define a placeholder to store sum of the length of each item in names.
		// Iterate through names:
		for(String str:names) {
			// Add the length of current item in names to nameLengthSum:
			nameLengthSum+=str.length();
		}
		// Calculate and store the average length of the strings in names by dividing averageNameLength
		// by the length of names array:
		int averageNameLength=nameLengthSum/names.length;
		System.out.println("2A) Average amount of characters/length of items in names is: " 
				+averageNameLength);
		/*
		2b: Use a loop to iterate through names again and concatenate all the names together, separated
	 	by spaces, and print result to console:
	 	*/
		// Create initially empty String to store concatenation of elements in names:
		String concatenated="";
		for(int i=0;i<names.length;i++) {
			// Concatenate the current item in names followed by a space 
			// to the end of concatenated variable:
			concatenated+=(names[i]+" ");
		}
		// Use String's built-in trim() function to remove trailing spaces from the end of concatenated:
		concatenated=concatenated.trim();
		// Print trimmed version of concatenated variable to the console:
		System.out.println("2B) Concatenated contents of names: "+concatenated);
		// 3) How do you access the last element of any array:
		System.out.println("3) The last element of any array can be accesed by calling \'array_name\'"
				+ "[\'array_name\'.length-1].");
		// 4) How do you access the first element of any array:
		System.out.println("4) The first element of any array can be accesed by calling \'array_name\'"
				+ "[0], as all arrays are 0-indexed by design.");
		// 5) Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		// created names array and add the length of each name to the nameLengths array.
		// Define nameLengths as a new array of integers with a number of elements equal to that of names:
		int[] nameLengths = new int[names.length];
		// Iterate through names:
		for(int i=0; i < names.length; i++) {
			// Set the value stored at i in nameLengths to the length of the item in names stored at i:
			nameLengths[i] = names[i].length();
		}
		System.out.print("5) Contents of namesLength: ");
		// Iterate through the first nameLengths.length-1 elements of nameLengths and use the in-line
		// print function to print the elements to the console in order, separated by commas:
		for(int i=0; i < nameLengths.length-1; i++) {
			System.out.print(nameLengths[i]+",");
		}
		// Use println to print the last element in nameLengths to the console and move to a new line:
		System.out.println(nameLengths[nameLengths.length-1]);
		// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
		// Print the result to the console.
		// Note: I already produced the requested value back in 2a with the nameLengthSum variable, so in the
		// interest of saving space and code efficiency, I'm just printing out the value of nameLengthSum.
		System.out.println("6) Sum of all items in namesLength: "+nameLengthSum);
		/*
		// Code that would produce the same result as above, only taking more lines and steps:
		int sum=0; 
		for(int i:nameLengths) { sum+=i; } 
		System.out.println("6) Sum of all items in namesLength: "+sum);
		*/
		// 7. Write a method that takes a String and an int and returns the String concatenated to itself
		// the inputed integer number of times:
		// Testing the method:
		System.out.println("Testing method for requirement 7:");
		System.out.println("Result for word \"Hello\" and n=3: "+concatenationNTimes("Hello",3));
		System.out.println("Result for word \"DOOM\" and n=0: "+concatenationNTimes("DOOM",0));
		System.out.println("Result for word \"Boop\" and n=26: "+concatenationNTimes("Boop",26));
		// 8. Write a method that takes two Strings, firstName and lastName, and returns 
		// a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("Testing method for requirement 8:");
		System.out.println("Result for firstName \"Peter\" and lastName \"Parker\": "
				+ fullName("Peter","Parker"));
		System.out.println("Result for firstName \"Mark\" and lastName \"Wright\": "
				+ fullName("Mark","Wright"));
		// 9. Write a method that takes an array of int 
		// and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("Testing method for requirement 9:");
		System.out.println("Result of arraySumOverHundred for ages: " + arraySumOverHundred(ages));
		int[] arr={13,-16,23,50,-26,42};
		System.out.println("Result of arraySumOverHundred for array {13,-16,23,50,-26,42}: " 
				+ arraySumOverHundred(arr));
		/*
		10. Write a method that takes an array of double and returns the average of all the elements in the array.
		*/
		System.out.println("Testing method for requirment 10:");
		double[] dArr = {2.5,7,3.6,4.2,3.2,24.5};
		System.out.println("Result of arrayAverage method for double array {2.5,7,3.6,4.2,3.2,24.5}: "
				+ arrayAverage(dArr));
		double[] dArr2 = {5.2,9.4,2.52,Math.PI,6.2452};
		System.out.println("Result of arrayAverage method for double array {5.2, 9.4, 2.52,"
				+ " PI(represented by built-in java function Math.PI), 6.2452}: "
				+ arrayAverage(dArr2));
		/*
		11. Write a method that takes two arrays of double and returns true if the average of the elements
		in the first array is greater than the average of the elements in the second array.
		*/
		System.out.println("Testing method for requirement 11:");
		System.out.println("Result of compareAverages for the arrays used in testing method 10, in the order "
				+ "they were tested, is: " +compareAverages(dArr,dArr2));
		double[] dArr3 = {3,-4.5,6.2,-5.53,8.42}; // Array average manually calculated as 1.518
		double[] dArr4 = {1.45,10.524,-2.552,5.295,9.91,6.21414}; // Array average manually calculated as 5.14019
		System.out.println("Result of compareAverages for arrays {3,-4.5,6.2,-5.53,8.42} and "
				+ "{1.45,10.524,-2.552,5.295,9.91,6.21414}, is: " +compareAverages(dArr3,dArr4));
		/*
		12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		*/
		System.out.println("Testing method for requirement 12:");
		// Test for isHotOutside=true and moneyInPocket greater than 10.50:
		System.out.println("Result of willBuy drink for isHotOutside=true and moneyInPocket=12.40: "
				+willBuyDrink(true,12.40));
		// Test for isHotOutside=false and moneyInPocket greater than 10.50:
		System.out.println("Result of willBuy drink for isHotOutside=false and moneyInPocket=12.40: "
				+willBuyDrink(false,12.40));
		// Test for isHotOutside=true and moneyInPocket less than 10.50:
		System.out.println("Result of willBuy drink for isHotOutside=true and moneyInPocket=5.25: "
				+willBuyDrink(true,5.25));
		// Test for isHotOutside=false and moneyInPocket less than 10.50:
		System.out.println("Result of willBuy drink for isHotOutside=false and moneyInPocket=2.14: "
				+willBuyDrink(false,2.14));
		/*
		 Method 13: Utilizing the framework of LeetCode's Integer To Roman problem, I developed code for a
		 function to take in an integer number between 1 and 3999 and return a String that contains the value in
		 Roman numeral form:
		 */
		System.out.println("Testing method for requirement 13, where an integer value between 1 and 3999, inclusive,"
				+ "is converting into it's roman numeral equvalent.");
		System.out.println("Result of performing intToRoman on 3749: "+intToRoman(3749));
		System.out.println("Result of performing intToRoman on 58: "+intToRoman(59));
		System.out.println("Result of performing intToRoman on 2024: "+intToRoman(2024));
		System.out.println("Result of performing intToRoman on -14: "+intToRoman(-14));
		System.out.println("Result of performing intToRoma on 4000: "+intToRoman(4000));
	}
	// Method 7:
	private static String concatenationNTimes(String word, int n) {
		// Error handling for when n is less than or equal to 0:
		if(n<=0) {
			// If n is less than or equal to 0, return an error message:
			return "Error, inputed integer value must be greater than 0.";
		}
		if(word=="") {
			// If an empty string was entered, just return the empty string as nothing concatenated to nothing
			// is still nothing.
			return word;
		}
		// Initialize an empty string to store result of concatenation:
		String res="";
		// Use a for loop to concatenate word to res n times:
		for(int i = 0; i < n; i++) {
			// Concatenate word to res:
			res+=word;
		}
		return res;
	}
	// Method 8:
	private static String fullName(String firstName, String lastName) {
		return firstName+" "+lastName;
	}
	// Method 9:
	private static boolean arraySumOverHundred(int[] arr) {
		// Create a variable initially set to 0 to store sum of contents of arr:
		int sum=0;
		// Iterate through contents of arr:
		for(int i: arr) {
			// Add current value in arr to sum:
			sum+=i;
		}
		// Check to see if sum is greater than 100:
		if(sum>100) {
			// If sum is greater than 100, return true;
			return true;
		}else {
			// Otherwise, return false:
			return false;
		}
	}
	// Method 10:
	private static double arrayAverage(double[] arr) {
		// Create value to store sum of contents of arr:
		double sum=0;
		// Iterate through arr:
		for(double i: arr) {
			sum+=i;
		}
		// Store value of sum divided by arr.length as double variable average:
		double average = sum/arr.length;
		// Return average:
		return average;
	}
	// Method 11:
	private static boolean compareAverages(double[] arr1, double[] arr2) {
		// Compare results of the arrayAverage function for arr1 and arr2:
		if(arrayAverage(arr1) > arrayAverage(arr2)) {
			// If arrayAverage result for arr1 is greater than the result for arr2, return true:
			return true;
		}else {
			// Otherwise, return false:
			return false;
		}
	}
	// Method 12:
	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket > 10.50) {
			// If isHotOutside is true and moneyInPocket is greater than 10.50, return true;
			return true;
		}else {
			// Otherwise, return false:
			return false;
		}
	}
	// Method 13:
	private static String intToRoman(int num) {
		// Confirm that entered number is between 1 and 3999, inclusive:
        if (num > 0 && num < 4000) {
			// Initialize a string variable to store all the numerals in:
			String roman = "";
			// Set up loop to decrease the value of num and add numerals to the string as needed until 
			// num equals 0:
			while (num != 0) {
				// Set up an if-else statement chain to check the current value of num:
				if (num > 999) {
					// If num is greater than 1000:
					for (int i = 0; i < num / 1000; i++) {
						// Perform a for loop that will add as many M's to the numeral string as
						// the value in the thousands place digit in num:
						roman += "M";
					}
					// Set num to be equal to the remainder of num divided by 1000:
					num = num % 1000;
				} else if (num > 899 && num <= 999) {
					// Case if current value of num is between 900 and 999:
					// Add CM to the numeral string:
					roman += "CM";
					// Set num to be equal to the remainder of num divided by 900:
					num = num % 900;
				} else if (num > 499 && num <= 899) {
					// Case if current value of num is between 500 and 899:
					// Add 'D' to the numeral string:
					roman += "D";
					// Set num to be equal to the remainder of num divided by 500:
					num = num % 500;
				} else if (num > 399 && num <= 499) {
					// Case if current value of num is between 400 and 499:
					// Add 'CD' to the numeral string:
					roman += "CD";
					// Set num to be equal to the remainder of num divided by 400:
					num = num % 400;
				} else if (num > 99 && num <= 399) {
					// Case if current value of num is between 100 and 399:
					for (int i = 0; i < num / 100; i++) {
						// Perform a for loop that will add as many C's to the numeral string as
						// the value of the current digit in the hunderd's place in num:
						roman += "C";
					}
					// Set num to be equal to the remainder of num divided by 100:
					num = num % 100;
				} else if (num > 89 && num <= 99) {
					// Case if current value of num is between 90 and 99:
					// Add 'XC' to the numeral string:
					roman += "XC";
					// Set num to be equal to the remainder of num divided by 90:
					num = num % 90;
				} else if (num > 49 && num <= 89) {
					// Case if current value of num is between 50 and 89:
					// Add 'L' to the numeral string:
					roman += "L";
					// Set num to be equal to the remainder of num divided by 50:
					num = num % 50;
				} else if (num > 39 && num <= 49) {
					// Case if current value of num is between 40 and 49:
					// Add 'XL' to the numeral string:
					roman += "XL";
					// Set num to be equal to the remainder of num divided by 40:
					num = num % 40;
				} else if (num > 9 && num <= 39) {
					// Case if current value of num is between 10 and 39:
					for (int i = 0; i < num / 10; i++) {
						// Perform a for loop that will add as many x's to the numeral string as
						// the value of the current digit in the hunderd's place in num:
						roman += "X";
					}
					// Set num to be equal to the remainder of num divided by 10:
					num = num % 10;
				} else if (num == 9) {
					// If current value of num is nine:
					// Add 'IX' to numeral string:
					roman += "IX";
					// Subtract nine from num:
					num -= 9;
				} else if (num > 4 && num <= 8) {
					// If current value of num is greater than 4 and less than or equal to 8:
					// Add "V" to the numeral string:
					roman += "V";
					// Subtract 5 from num:
					num -= 5;
				} else if (num == 4) {
					// If current value of num is 4:
					// Add "IV" to the numeral string:
					roman += "IV";
					// Subtract 4 from num:
					num -= 4;
				} else if (num > 0 && num < 4) {
					// If current value of num is greater than 0 and less than 4:
					// Temp storage of current value of num for loop-bound storage:
					int temp = num;
					// Set up for-loop that repeats initial num-value times:
					for (int i = 0; i < temp; i++) {
						// Add an "I" to numeral string:
						roman += "I";
						// Decrement num:
						num--;
					}
				} else {
					// Code block for emergency error handle purposes where num goes below 0:
					return "Error. Num decremented below 0.";
				}
			}
			return roman;
		} else {
			// Error handling if a value less than or equal to 0, or greater than 3999 is entered:
			return "Error. " + num + " is not between 1 and 3999.";
		}
    }
}
