package TenExercises;

public class Fourth_ThrowingExceptions {

	public static void main(String[] args) {
		
		try {
			validateAge(-5);
		
		} catch(IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void validateAge(int age) {
		if(age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
	}
	
}
