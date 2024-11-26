package main;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;

import models.Course;
import models.Employee;
import models.Lesson;
import models.Student;

public class DBContext {
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Employee> employees = new Vector<Employee>();
	public static Vector<Course> courses = new Vector<Course>();
	public static Vector<Lesson> lessons = new Vector<Lesson>();
	
	// ...
	static String filename = "";
	
	public static boolean serializeStudents() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(students);
			
			oos.close();
			
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
}
