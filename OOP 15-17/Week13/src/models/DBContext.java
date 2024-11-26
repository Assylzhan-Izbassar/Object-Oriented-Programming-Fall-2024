package models;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class DBContext {
	private static String filePath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 15-17\\Week13\\src\\data\\";
	public static Vector<Student> students = new Vector<Student>();
	public static Vector<Teacher> teachers = new Vector<Teacher>();
	public static Vector<Manager> managers = new Vector<Manager>();
	public static Vector<Course> courses = new Vector<Course>();
	// ...
	
	public static void saveTeachers() {
		DBContext.serialize(teachers, "teachers.txt");
	}
	
	public static void serialize(Object data, String fileName) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(getFilePath() + fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object deserialize(String fileName) {
		FileInputStream fis;
		try {
			fis = new FileInputStream(getFilePath() + fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object result = ois.readObject();
			
			ois.close();
			
			return result;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String getFilePath() {
		return filePath;
	}
	
}
