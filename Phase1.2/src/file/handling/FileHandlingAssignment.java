package file.handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignment {

	public static void main(String args[]) {

		try {
			File file = new File("D://Computer programming//eclipse//workspace//FileHandlingHomework.txt");
			if(file.createNewFile()) {
				System.out.println("New file created!");
			} 
			else {
				if(file.exists()) {
					char[] arr = new char[100];

					FileWriter output = new FileWriter("D://Computer programming//eclipse//workspace//FileHandlingHomework.txt");
					System.out.println("Write a description about yourself here: ");
					Scanner s = new Scanner(System.in);
					String data = s.nextLine();
					output.write(data);
					System.out.println("Description about me!");
					output.close();

					FileReader input = new FileReader("D:\\Computer programming\\eclipse\\workspace\\FileHandlingHomework.txt");
					input.read(arr);
					System.out.println("Data in the file:");
					System.out.println(arr);
					input.close();

					System.out.println("File now exists!");
					System.out.println("File path: " + file.getAbsolutePath());
					System.out.println("File name: " + file.getName());
					System.out.println("File class: " + file.getClass());
					System.out.println("File parent: " + file.getParent());
					System.out.println("File space allocated: " + file.getUsableSpace());
					System.out.println("File length: " + file.length());
					System.out.println("File list: " + file.list());						
				}				
				else {
					System.out.println("File does not exists!");
				}
			
			boolean b = file.delete();
			if(b==true) {
				System.out.println("File deleted!!");
			} 
			else {
				System.out.println("File was not deleted.");
			}
			}
		} 		
		catch(IOException e) {
			e.printStackTrace();
		}		
	}
}

