package TenExercises;

import java.io.FileReader;
import java.io.IOException;

public class Third_FinallyBlock {

	public static void main(String[] args) {
		readFile("example.txt");
	}
	
	public static void readFile(String fileName) {
		
		FileReader fileReader = null;
		
		try {
			fileReader = new FileReader(fileName);
			System.out.println("Reading file... ");
		
		} catch(IOException e) {
			System.out.println("Error: File not found.");
		
		} finally {
			
			if(fileReader != null) {
				
				try {
					fileReader.close();
					System.out.println("File closed.");
				
				} catch(IOException e) {
					System.out.println("Error: Failed to close file");
				}
			}
		}
	}
}
