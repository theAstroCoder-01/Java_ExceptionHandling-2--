package TenExercises;

import java.io.InvalidClassException;

public class Fifth_CustomException {

	public static void main(String[] args) {
		
		try {
			checkTemperature(-300);
		} catch(InvalidClassException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static void checkTemperature(int temperature) throws InvalidClassException {
		if(temperature < -272) {
			throw new InvalidClassException("Temperature below absolute zero is not valid");
		}
	}
	
}
