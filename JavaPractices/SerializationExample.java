package com.learn.tree;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		Student s = new Student();
		s.student_id = "aa";
		s.name = "aaa";
		String filename = "D:\\DSA\\Data\\TestFile.txt";
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.close();
			fos.close();
			System.out.println("File Saved Successfully...");
		}catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}

	}

}
