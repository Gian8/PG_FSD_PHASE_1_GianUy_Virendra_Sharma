package file.handling;

import java.io.File;
import java.io.IOException;

public class FileHandlingPractice {
	
	public static void main(String args[]) {
		
		try {
			File file = new File("D://Computer programming//eclipse//workspace//Sample.txt");
		 
			if(file.createNewFile()) {
				System.out.println("New file created!");
			} 
			else {
				if(file.exists()) {
					System.out.println("File already exists!");
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
