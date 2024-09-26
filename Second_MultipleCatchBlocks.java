package TenExercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Second_MultipleCatchBlocks {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Enter numerator: ");
			int numerator = input.nextInt();
			
			System.out.println("Enter denomiantor: ");
			int denominator = input.nextInt();
			
			int result = divide(numerator, denominator);
			System.out.println("Result: " + result);
		} catch(ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed");
		} catch(InputMismatchException e) {
			System.out.println("Error: Invalid Input. Please enter integers only.");
		}
	}
	
	public static int divide(int numerator, int denominator) {
		return numerator / denominator;
	}
}
