package file.handling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamPractice {

	public static void main(String args[]) throws IOException {
		
		//KEYWORDS: fis = FileInputStream
		//attach the file to fis
		FileInputStream fis = new FileInputStream("D://Computer programming//eclipse//workspace//Awesome.txt");
		
		//illustrating getChannel() method
		System.out.println(fis.getChannel());
		
		/*Illustrating get FD() method
		 * returns the FileDescriptor object that represents the connection to the actual file
		 * in the file system being used by this
		 */
		//System.out.println(fis.getFD());
		
		/*illustrating available method
		 * returns an estimate of the number of remaining bytes that can be read (or skipped over)
		 * from this input stream
		 */
		System.out.println("Number of remaining bytes: " + fis.available());
		
		/*Illustrating skip method
		 * Original File content:
		 * this is my first line
		 * this is my second line
		 */
		fis.skip(7);
		System.out.println("FileContents: ");
		
		//read characters from FileInputStream and write them
		int ch;
		while((ch=fis.read()) !=-1) {
			System.out.print((char)ch);
		}
		//close the file
		fis.close();
	}
}
