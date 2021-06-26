package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class SerialDeserialization {
	public static void main(String args[]) throws IOException {
	
		//Student[] students = {new Student(101, 25, "Gregori", "Wanita St.", 6), new Student(102, 24, "Samantha", "Jehova Ave.", 5),new Student(103, 25, "Jeff", "Randolf dr.", 6),new Student(104, 26, "Bruno", "Dempster st.", 6),new Student(105, 21, "Lisa", "Lakeview dr.", 5)}; 
		//ArrayList<Student> studentList = new ArrayList<Student>(Arrays.asList(students));
		Student s1 = new Student(101, 25, "Gregori", "Wanita St.", 6);
		Student s2 = new Student(102, 24, "Samantha", "Jehova Ave.", 5);
		Student s3 = new Student(103, 25, "Jeff", "Randolf dr.", 6);
		Student s4 = new Student(104, 26, "Bruno", "Dempster st.", 6);
		Student s5 = new Student(105, 21, "Lisa", "Lakeview dr.", 5);	
		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		//ArrayList<Student> students = new ArrayList<>();
		//students.add(new Student(101, 25, "Gregori", "Wanita St.", 6));
		//students.add(new Student(102, 24, "Samantha", "Jehova Ave.", 5));
		//students.add(new Student(103, 25, "Jeff", "Randolf dr.", 6));
		//students.add(new Student(104, 26, "Bruno", "Dempster st.", 6));
		//students.add(new Student(105, 21, "Lisa", "Lakeview dr.", 5));
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		for(int i = 0; i < 5; i++) {			
		try {
			fos = new FileOutputStream("D:\\Computer programming\\eclipse\\workspace\\Student.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(students.get(i));
	//		oos.writeObject(s2);
	//		oos.writeObject(s3);
	//		oos.writeObject(s4);
	//		oos.writeObject(s5);
			System.out.println("Serialization done!!");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			oos.close();
			fos.close();
		}
					Student o = null;
		try {
			FileInputStream fis = new FileInputStream("D:\\Computer programming\\eclipse\\workspace\\Student.ser");
			ObjectInputStream ois =new ObjectInputStream(fis);
				o = (Student) ois.readObject(); 
			ois.close();
			fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}
	//	System.out.println("Student Name: " + students.getStuName());
		System.out.println("Student Name: " + o.getStuName());
		System.out.println("Student Age: " + o.getStuAge());
		System.out.println("Student Roll No: " + o.getStuRollNum());
		System.out.println("Student Address: " + o.getStuAddress());
		System.out.println("Student Height: " + o.getStuHeight());
	//	System.out.println("Student Name: " + ((Student) students).getStuName());
	//	System.out.println("Student Age: " + ((Student) s).getStuAge());
	//	System.out.println("Student Roll No: " + ((Student) s).getStuRollNum());
	//	System.out.println("Student Address: " + ((Student) s).getStuAddress());
	//	System.out.println("Student Height: " + ((Student) s).getStuHeight());
	}
}}

class Student implements Serializable {
	
	public int getStuRollNum() {
		return stuRollNum;
	}

	public void setStuRollNum(int stuRollNum) {
		this.stuRollNum = stuRollNum;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}

	private int stuRollNum;
	private int stuAge;
	private String stuName;
	private transient String stuAddress; //transient will prevent it from serializing
	private transient int stuHeight;
	
	public Student(int roll, int age, String name, String address, int height) {
		this.stuRollNum = roll;
		this.stuAge = age;
		this.stuName = name;
		this.stuAddress = address;
		this.stuHeight = height;
		
	}
}
