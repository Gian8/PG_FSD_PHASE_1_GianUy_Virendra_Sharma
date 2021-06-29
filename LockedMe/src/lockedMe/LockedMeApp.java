package lockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class LockedMeApp {

	final static String Directory = "C:\\Users\\gianc\\Desktop\\Simplilearn\\Phase1\\Submissions\\LockedMe";
	final static File dir = new File(Directory + "\\lockedMeFiles");
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException
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
	
	public void mainMenu() throws IOException
	{
		System.out.println("=====================");
		System.out.println("--    Main Menu    --");
		System.out.println("=====================");
		System.out.println();
		System.out.println("What would you like to do today?");
		System.out.println("1. Show files");
		System.out.println("2. Show file operations");
		System.out.println("3. Close the app" + "\n");
		System.out.println("Please choose 1, 2 or 3:");
	
		int choice = scan.nextInt();
		try
		{
			if(choice == 1)
			{
				LockedMeApp.listFiles();
				mainMenu();	
			}
			if (choice == 2)
			{
				System.out.println("__________________________________________________" + "\n");
				System.out.println("Opening File Operations Menu..." + "\n");
				fileOperations();
			}
			if (choice == 3)
			{
				System.out.println("Closing the App...");
				System.out.println("Thank You for using LockedMe App!");
				System.exit(0);
			}
			if (choice !=1 && choice != 2 && choice != 3)
			{
				throw new CustomLockedMeException("Invalid entry!");
			}
		}
		catch (CustomLockedMeException e)
		{
			e.getStackTrace();
			System.out.println("__________________________________________________" + "\n");
			System.out.println(e);
			System.out.println("Invalid input! Please restart the App.");
			System.out.println("__________________________________________________" + "\n");
		}
	}
	
	public void fileOperations() throws CustomLockedMeException, IOException
	{
		System.out.println("=======================");
		System.out.println("==  File Operations  ==");
		System.out.println("=======================");
		System.out.println();
		System.out.println("1. Add a file");
		System.out.println("2. Delete a file");
		System.out.println("3. Search for a file");
		System.out.println("4. Return to Main Menu");
		System.out.println("\n" + "Please choose 1, 2, 3, or 4: ");
		int choice2 = scan.nextInt();
		try
			{
			if (choice2 == 1)
			{
				System.out.println("Please enter the file name you want to create:");
				String nameOfFileToAdd = scan.next().trim().toLowerCase();
				addFile(nameOfFileToAdd);
				fileOperations();
			}
			if (choice2 == 2)
			{
				System.out.println("Please enter the file name you want to delete:");
				String nameOfFileToDelete = scan.next().trim();
				deleteFile(nameOfFileToDelete);
				fileOperations();
			}
			if (choice2 == 3)
			{
				System.out.println("Please enter the file name you want to search:");
				String nameOfFileToSearch = scan.next().trim();
				searchFile(nameOfFileToSearch);
				fileOperations();
			}
			if (choice2 == 4)
			{
				System.out.println("\n" + "Returning to Main Menu..." + "\n");
				mainMenu();
			}
			if (choice2 != 4 && choice2 !=1 && choice2 != 2 && choice2 != 3)
			{
				throw new CustomLockedMeException("Invalid entry!");
			}
		}
		catch (CustomLockedMeException e)
		{
			e.getStackTrace();
			System.out.println("__________________________________________________" + "\n");
			System.out.println(e);
			System.out.println("Invalid input! Please restart the App.");
			System.out.println("__________________________________________________" + "\n");
		}
	}	

	static void listFiles()
	{
		if (dir.list().length == 0)
		{
			System.out.println("__________________________________________________" + "\n");
			System.out.println("The directory is empty.");
		}
		else
		{
			String[] filesInDirectory = dir.list();
			System.out.println("\n" + "Showing files in ascending order: ");
			System.out.println("__________________________________________________" + "\n");
			Arrays.sort(filesInDirectory);
			for (String sortedFileNames : filesInDirectory)
			{
				System.out.println(sortedFileNames);
			}
		}
		System.out.println("__________________________________________________" + "\n");
		System.out.println("Returning to Main Menu..."+ "\n");
//		System.out.println("__________________________________________________" + "\n");
	}

	void addFile(String nameOfFileToAdd) throws IOException
	{
		File rootFilePath = new File(dir + "\\" + nameOfFileToAdd);
		String[] filesInDirectory = dir.list();
		for (String fileToAdd : filesInDirectory)
		{
			if (nameOfFileToAdd.equalsIgnoreCase(fileToAdd))
			{
				System.out.println("__________________________________________________" + "\n");
				System.out.println("\n" + nameOfFileToAdd + " file already exists!" + "\n");
				System.out.println("__________________________________________________" + "\n");
				System.out.println("Returning to File Operations Menu..." + "\n");
				return;
			}
		}
		System.out.println("\n" + "Creating the file now..." + "\n");
		rootFilePath.createNewFile();
		System.out.println("__________________________________________________" + "\n");
		System.out.println("You have sucessfully created "+ nameOfFileToAdd + " in the directory" + "\n");
		System.out.println("__________________________________________________" + "\n");
		System.out.println("Returning to File Operations Menu..." + "\n");
	}
	
	void deleteFile(String nameOfFileToDelete) throws CustomLockedMeException
	{	
		File rootFilePath = new File(dir + "\\" + nameOfFileToDelete);
		String[] filesInDirectory = dir.list();
		for (String fileToDelete : filesInDirectory)
		{
			if (nameOfFileToDelete.equals(fileToDelete))
			{
				System.out.println("\n" + "Searching for the file now...");
				System.out.println("File located." + "\n" + "Deleting the file now..." + "\n");
				rootFilePath.delete();
				System.out.println("__________________________________________________" + "\n");
				System.out.println("You have sucessfully deleted "+ nameOfFileToDelete + " in the directory" + "\n");
				System.out.println("__________________________________________________" + "\n");
				System.out.println("Returning to File Operations Menu..." + "\n");
				return;
			}
		}
		System.out.println("\n" + "Searching for the file now..." + "\n");
		System.out.println("__________________________________________________" + "\n");
		System.out.println("\n" + "Unable to delete the file." + "\n" + "Please make sure the spelling is correct (Case-ensitive) " + "\n" + "Otherwise, make sure the file exists first." + "\n");
		System.out.println("__________________________________________________" + "\n");
		System.out.println("Returning to File Operations Menu..." + "\n");
	}

	void searchFile(String nameOfFileToSearch)
	{
		File rootFilePath = new File(dir + "\\" + nameOfFileToSearch);
		String[] filesInDirectory = dir.list();
		for (String fileToSearch : filesInDirectory)
		{
			if (nameOfFileToSearch.equals(fileToSearch))
			{
				System.out.println("\n" + "Searching for the file now..." + "\n");
				System.out.println("__________________________________________________" + "\n");
				System.out.println(nameOfFileToSearch + " was found in the directory!" + "\n");
				System.out.println("__________________________________________________" + "\n");
				System.out.println("Returning to File Operations Menu..." + "\n");
				return;
			}
		}
		System.out.println("\n" + "Searching for the file now..." + "\n");
		System.out.println("__________________________________________________" + "\n");
		System.out.println("\n" + nameOfFileToSearch + " does not exists." + "\n");
		System.out.println("__________________________________________________" + "\n");
		System.out.println("Returning to File Operations Menu..." + "\n");
	}
	class CustomLockedMeException extends Exception
	{
		CustomLockedMeException(String CLME)
		{
			super(CLME);
		}
	}
}