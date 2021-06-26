package file.handling;

import java.io.FileReader;

public class FileReaderDemo {
	
	public static void main(String args[]) {
		
		char[] arr = new char[100];
		
		try {
			FileReader input = new FileReader("D:\\Computer programming\\eclipse\\workspace\\FileReaderPractice.txt");
			input.read(arr);
			System.out.println("Data in the file.");
			System.out.println(arr);
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
	}
	

}
