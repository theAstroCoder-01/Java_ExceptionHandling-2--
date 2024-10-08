package TenExercises;

import javax.smartcardio.CardException;

	
	// Custom exception class
	public class Sixth_CustomParseException extends Exception {
	    
		private static final long serialVersionUID = 1L;

		public Sixth_CustomParseException(String message) {
	        super(message);
	    }
	}

	public class ParseInt {

	    // Method to parse integer from a string and throw custom exception on failure
	    public static int parseInt(String value) throws Sixth_CustomParseException {
	        try {
	            // Try parsing the string to an integer
	            return Integer.parseInt(value);
	        } catch (NumberFormatException e) {
	            // Catch NumberFormatException and throw custom exception
	            throw new Sixth_CustomParseException("Failed to parse the string '" + value + "' as an integer.");
	        }
	    }

	    public static void main(String[] args) {
	        // Test cases to demonstrate behavior
	        String[] testValues = {"123", "abc", "456", "78a"};

	        for (String value : testValues) {
	            try {
	                // Try to parse each value
	                int result = parseInt(value);
	                System.out.println("Parsed value: " + result);
	            } catch (Sixth_CustomParseException e) {
	                // Catch and handle the custom exception
	                System.out.println("Error: " + e.getMessage());
	            }
	        }
	    }
	}
