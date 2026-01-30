package com.learn.tree;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String args[]) {
		String filename = "D:\\DSA\\Data\\TestFile.txt";
		
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Student obj = (Student) ois.readObject();
			System.out.println(obj.student_id);
			System.out.println(obj.name);
			
			ois.close();
			fis.close();
		}catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}
}
