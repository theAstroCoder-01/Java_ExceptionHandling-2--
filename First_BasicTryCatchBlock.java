package TenExercises;

public class First_BasicTryCatchBlock {
	
	public static void main(String[] args) {
	
	try {
		int result = divide(10, 0);
		System.out.println("Result: " + result);
	
	} catch(ArithmeticException e) {
		System.out.println("Error: Division by zero is not allowed");
	}
}

	public static int divide(int numerator, int denominator) {
		return numerator / denominator;
	}
}
