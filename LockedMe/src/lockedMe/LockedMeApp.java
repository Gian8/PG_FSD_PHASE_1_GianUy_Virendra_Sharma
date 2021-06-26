package lockedMe;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LockedMeApp {

	final static String Directory = "C:\\Users\\gianc\\Desktop\\Simplilearn\\Phase1\\Submissions\\LockedMe";
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		LockedMeApp run = new LockedMeApp();
		run.welcome();
		run.mainMenu();
	}
	
	public void welcome()
	{
		System.out.println("===================================");
		System.out.println("==            WELCOME            ==");
		System.out.println("==               TO              ==");
		System.out.println("==          LOCKEDME APP         ==");
		System.out.println("==                               ==");
		System.out.println("==    Developer: Gian Carlo Uy   ==");
		System.out.println("===================================");
		System.out.println();
	}
	
	public void mainMenu()
	{
		System.out.println("=====================");
		System.out.println("--    Main Menu    --");
		System.out.println("=====================");
		System.out.println();
		System.out.println("What would you like to do today?");
		System.out.println("1. Show files");
		System.out.println("2. Show file operations");
		System.out.println("3. Close the app");
		System.out.println();
		mainMenuHandler();		
	}
	
	public void mainMenuHandler()
	{
		System.out.println("Please choose 1, 2, or 3: ");
		String choice = scan.nextLine();
		
		switch (choice)
		{
		case "1": LockedMeApp.listFiles();
					break;
		case "2": fileOperations();
		case "3": System.out.println("Closing the App...");
		          System.out.println("Thank You for using LockedMe App!");
		          System.exit(0);
		          break;
		default:  System.out.println("Invalid choice, please choose 1, 2, or 3 only.");
		}
		mainMenu();
	}
	
	public void fileOperations()
	{
		System.out.println("=======================");
		System.out.println("==  File Operations  ==");
		System.out.println("=======================");
		System.out.println();
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search for a file");
		System.out.println("4. Return to Main Menu");
		System.out.println();
		fileOperationsHandler();
	}
	
	public void fileOperationsHandler()
	{
		System.out.println("Please choose 1, 2, 3, or 4: ");
		String choice2 = scan.nextLine();
		switch (choice2)
		{
		case "1": LockedMeApp.addFile();
					break;
		case "2": LockedMeApp.deleteFile();
					break;
		case "3": LockedMeApp.searchFile();
					break;
		case "4": mainMenu();
					break;
		}
		fileOperations();
	}
	
	public static void listFiles()
	{
		System.out.println("Showing files in ascending order: ");
		System.out.println("__________________________________________________");
		File[] file = new File(Directory).listFiles();
		Set<String> sortedFiles = new TreeSet<>();
		for (File filesToSort : file)
		{
			if (!filesToSort.isFile())
			{
				continue;
			}
			sortedFiles.add(filesToSort.getName());
		}
		sortedFiles.forEach(System.out::println);
		System.out.println("__________________________________________________");
	}
	
	public static void addFile() throws InvalidPathException
	{
		{ try {
			boolean fileCreated = false;			
			System.out.println("Enter the file name that you want to create:");		
		//	Scanner in = new Scanner (System.in);	
			String filename= scan.next();
		
			File f= new File (filename);
			if (f.exists()) 
			{
				System.out.println(f.getName() + " file already exists!");
			}
			else
			{
				System.out.println("Creating file now...");
				fileCreated = f.createNewFile();
				if (fileCreated) 
				{
					System.out.println("You have sucessfully created a new file  :"+"'" +f.getName()+"'"+ " in the directory");
				}
				else
				{
					System.out.println("Unable to create file.");
				}
			}
			
//			if (f.createNewFile()) {
//				System.out.println( "You have sucessfully created a new file  :"+"'" +f.getName()+"'"+ " in the directory");
//			}
//			else {
//				System.out.println( f.getName()+  ":File already exists ");	
//			}	
	//		menuList2();
	//		scan.close();
			} catch(Exception e) {  
				e.printStackTrace(); 
				System.out.println("File is not created ");
			}		
		}
//		{ try {
//			File file = new File(Directory);
//			if (file.createNewFile())
//			{
//				System.out.println("New file created successfully!");
//			}
//			else
//			{
//				if (file.exists())
//				{
//					DataInputStream dis = new DataInputStream(System.in);
//					FileOutputStream fos = new FileOutputStream(Directory);
//					BufferedOutputStream bout = new BufferedOutputStream(fos, 1024);
//					System.out.println("Please enter the file name you want to create (enter @ symbol right after file name without space between): ");
//					char c;
//					while()
//				}
//			}
	//		boolean fileCreated = false;			
//			System.out.println("Please enter the file name you want to create: ");		
//			String addName= scan.next();
//			File addFile= new File (addName);
//			if (addFile.exists()) 
//			{
//				System.out.println(addFile.getName() + " file already exists!");
//			}
//			else
//			{
//				System.out.println("Creating file now...");
//				//fileCreated = addFile.createNewFile();
//				if (fileCreated) 
//				{
//					System.out.println("You have sucessfully created a new file  :"+"'" +addFile.getName()+"'"+ " in the directory");
//				}
//				else
//				{
//					System.out.println("Unable to create file.");
//				}
//			}
			
//			if (f.createNewFile()) {
//				System.out.println( "You have sucessfully created a new file  :"+"'" +f.getName()+"'"+ " in the directory");
//			}
//			else {
//				System.out.println( f.getName()+  ":File already exists ");	
//			}	
//			scan.close();
//			} catch(Exception e) {  
//				e.printStackTrace(); 
//				System.out.println("Unable to create file.");
//			}		
//		}
		
//		System.out.println("Please enter the file name you want to create: ");
//		String fileDir = Directory;
//		Path addPath = Paths.get(fileDir);
//		if (!Files.exists(addPath))
//		{
//			System.out.println("File does not exists!");
//			return;
//		}
//		
//		String newFileDir = Directory + "/" + addPath.getFileName();
//		int g = 0;
//		while (Files.exists(Paths.get(newFileDir)))
//		{
//			g++;
//			newFileDir = Directory + "/" + g + "_" + addPath.getFileName();
//		}
//		try
//		{
//			Files.copy(addPath, Paths.get(newFileDir));
//		}
//		catch (IOException e)
//		{
//			System.out.println("Unable to create file.");
//		}
	}
	
	public static void deleteFile()
	{
		System.out.println("Please enter the file name you want to delete: ");
		String deleteName = scan.nextLine();
		String deleteFile = Directory + "/" + deleteName;
		Path deletePath = Paths.get(deleteFile);
		
		try 
		{
			Files.delete(deletePath);
		}
		catch (IOException e)
		{
			System.out.println("File was not deleted.");
		}
		finally
		{
			System.out.println("File deleted!");
		}
	}
	
	public static void searchFile()
	{
		System.out.println("Please enter the file name you want to search: ");
		String searchFile = scan.nextLine();
		
		File[] file = new File(Directory).listFiles();
		ArrayList<String> fileList = new ArrayList<>();
		for (File fileToSearch : file)
		{
			if (!fileToSearch.isFile())
			{
				continue;
			}
			fileList.add(fileToSearch.getName());
		}
		boolean findResult = false;
		for (String fileNameToBeSearched : fileList)
		{
			if (fileNameToBeSearched.equals(searchFile))
			{
				findResult = true;
			}
		}
		if (findResult)
		{
			System.out.println("File " + searchFile + " was found!");
		}
		else
		{
			System.out.println(searchFile + " was not found.");
		}
	}	
}


 