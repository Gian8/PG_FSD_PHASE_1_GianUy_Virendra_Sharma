package file.handling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignmentUsingFOS {

	public static void main(String args[]) {

		try {
			File file = new File("D://Computer programming//eclipse//workspace//FileHandlingHomework.txt");
			if(file.createNewFile()) {
				System.out.println("New file created!");
			} 
			else {
				if(file.exists()) {
					//char[] arr = new char[100];

					//FileWriter output = new FileWriter("D://Computer programming//eclipse//workspace//FileHandlingHomework.txt");
					//System.out.println("Write a description about yourself here: ");
					//Scanner s = new Scanner(System.in);
					//String data = s.nextLine();
					//output.write(data);
					//System.out.println("Description about me!");
					//output.close();
					
					DataInputStream dis = new DataInputStream(System.in);
					FileOutputStream fos = new FileOutputStream("D://Computer programming//eclipse//workspace//FileHandlingHomework.txt", true);
					BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
					System.out.println("Enter text (@ at the end): ");
					char c;
					while((c=(char)dis.read()) !='$') {
						bout.write(c);
					}
					bout.close();
					System.out.print("--------------------");
					//FileReader input = new FileReader("D:\\Computer programming\\eclipse\\workspace\\FileHandlingHomework.txt");
					//input.read(arr);
					//System.out.println("Data in the file:");
					//System.out.println(arr);
					//input.close();
					
					System.out.println("Configuring input data...");
					System.out.println("File now exists!");
					System.out.println("File path: " + file.getAbsolutePath());
					System.out.println("File name: " + file.getName());
					System.out.println("File class: " + file.getClass());
					System.out.println("File parent: " + file.getParent());
					System.out.println("File space allocated: " + file.getUsableSpace());
					System.out.println("File length: " + file.length());
					System.out.println("File list: " + file.list());

					//last placement of filereader before deletion
					
					//FileReader input = new FileReader("D:\\Computer programming\\eclipse\\workspace\\FileHandlingHomework.txt");
					//input.read(arr);
					//System.out.println("Data in the file:");
					//System.out.println(arr);
					//input.close();
					FileInputStream fis = new FileInputStream("D:\\Computer programming\\eclipse\\workspace\\FileHandlingHomework.txt");
					System.out.println("File channel: " + fis.getChannel());
					System.out.println("File bytes read: " + fis.available());
					System.out.println("Class: " + fis.getClass());
					System.out.println(fis.getFD());
					System.out.println("Content of File: ");
					int content;
					while((content=fis.read())!=-1) {
						System.out.print((char)content);
					}
					System.out.println();
					fis.close();
				}						
				else {
					System.out.println("File does not exists!");
				}
			
			boolean b = file.delete();
			if(b==true) {
				System.out.println("           <---Deleting this file now...");
				System.out.println("File deleted.");
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
