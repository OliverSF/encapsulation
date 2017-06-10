package arrays;

import java.util.Scanner;

public class NewArrayTest {

	public static void main(String[] args) {
		
		//declaring and initialising sum variable
				double sum = 0;
				
				//declaring x variable to hold user input for array size
				int x;
				
				//Declaring and creating instance of the scanner class
				Scanner input = new Scanner(System.in);
				
				//Output to console asking user to input the array size
				System.out.println("Enter the size of your Array: ");
				
				x = input.nextInt(); //assigning user input to x
				
				double numbers [] = new double[x]; //
				
				for (int counter = 0; counter < numbers.length; counter++) {
					System.out.println("Enter your number: ");
					numbers[counter] = input.nextDouble();
				}
				
				printArray(numbers);
				
				for (int counter = 0; counter < numbers.length; counter++) {
					sum += numbers[counter];
					
		}
				System.out.println("\nThe sum of your numbers is: " + sum);
				
			input.close();
	}
				public static void printArray(double [] n) {
		
					for(double val : n) {
						System.out.print(val + " ");
					}
					
					System.out.println();
		
		
	} //end main method
} //end class