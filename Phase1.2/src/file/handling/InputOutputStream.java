package file.handling;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputOutputStream {

	public static void main(String[] args) throws IOException{
		
		//attaches keyboard to DataInputStream
		DataInputStream dis = new DataInputStream(System.in);
		
		//attaches file to FileOutputStream
		FileOutputStream fos = new FileOutputStream("D://Computer programming//eclipse//workspace//Awesome.txt",true);
		
		//attaches FileOutputStream to BufferedOutputStream
		BufferedOutputStream bout = new BufferedOutputStream(fos,1024);
		System.out.println("Enter text (@ at the end): ");
		char ch;
		
		//read characters from dis int ch, then write them into bout.
		//repeated as long as the read character is not @
		while((ch=(char)dis.read())!='@') {
			bout.write(ch);
		}
		System.out.println("Data has been written!");
		bout.close();
	}

}
