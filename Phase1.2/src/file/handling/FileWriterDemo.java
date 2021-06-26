package file.handling;

import java.io.FileWriter;

public class FileWriterDemo {

	public static void main(String[] args) {

		String data = "I'm an RN learning computer programming";
		try {
			//this will create a writer using FileWriter
			FileWriter output = new FileWriter("D://Computer programming//eclipse//workspace//Awesome.txt");
			//this writes string (from data) to the file
			output.write(data);
			System.out.println("Data is written to the file.");
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
