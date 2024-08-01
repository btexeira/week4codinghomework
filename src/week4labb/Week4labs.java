package week4labb;

import java.util.Arrays;

public class Week4labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] numbers = {1,2,3,4,5}; for(int i = 0; i < numbers.length; i++) { System.out.println(numbers[i]); }
		
		//1. array of int ages with defined elements inside
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};	
		//a. subtracting first element from last element
			System.out.println("The difference of the first and last age is " + ((ages[ages.length - 1]) - ages[0]) + "."); 
	
		//b. array of int called ages2 with 9 elements, showing use with different array length
		int[] ages2 = {14, 8, 3, 9 , 17, 38, 94, 100, 48}; 
			//1.a. subtracting first element from last element
			System.out.println("The difference of the first and last age is " + ((ages2[ages2.length - 1]) - ages2[0]) + ".");
			
		//c. using a for loop to find average age of age (from 1)	
			//defaulting sum to 0
		int sum = 0;
		//finding the sum of all values in age2
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		
		//declaring a double for the average of ages2
		int average = sum / ages2.length; 
		System.out.println("The average of the ages is " + average + ".");
			
		//String of names
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		//
		sum = 0;
		for(int i = 0; i < names.length; i++) { 
			sum += names[i].length();
		}
		average = sum / names.length;
		System.out.println("The average number of letters per name is " + average + ".");
		
		//3. how to access the last element of an array: array[array.length - 1] 
		//example from names:
		System.out.println("The last name written is " + (names[names.length - 1]) + ".");
		
		//4. how to access the first element of an array: array[0] 
		//example from names:
		System.out.println("The first name written is " + (names[0]) + ".");
		
		//5. create a new array of int names called nameLengths
		//write a loop that adds length of each name to nameLengths
		int [] nameLengths = new int [names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		//6. loop to calculate sum of previously made array
		sum = 0; //defaulting sum to 0
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all name lengths in nameLengths array is " + sum + ".");
	}
		//7. method that returns word concatenated to itself n amount of times
		
	private static String duplicateWord(String word, int n) {
		String duplicatedWord = "";
		for (int i = 0; i < n; i++) {
			duplicatedWord += word;
		}
		return "duplicatedWord() returns => " + duplicatedWord;
	}
	
	//8. method with 2 strings, first/last name, returning fullname
	private static String fullName(String firstName, String lastName) {
		return "fullName() returns =>" + firstName + " " + lastName;
	}
	//9. method of int array that returns true if sum of all ints >100
	private static boolean isSumGreaterThan100(int[]arr) {
		return Arrays.stream(arr).sum()	> 100;
	}
	//10. array of double and returns the average of all the elements in array
	private static double calculateAverage(double[] array) {
		double sum = 0;
		for (double element : array) {
			sum += element;
		}
		return sum / array.length;
	}
	//11. method that take 2 arrays of double and returns true if average
	//is greater than elements in the second array. 
	private static boolean ifFirstArrAvgGreater(double[] firstArray, double[] secondArray) {
		return calculateAverage(firstArray) > calculateAverage(secondArray);
	}
	//12. method called willBuyDrink
	private static boolean willBuyDrinks(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside = true && moneyInPocket > 10.50 ;
	}
	//13. method of own making: wrote a method that forms fullName + age
	private static String fullNameAge(String firstName, String lastName, int age) {
		return "fullNameAge() returns =>" + firstName + " " + lastName + ", I am " + age + " ";
	}
}	
	
	