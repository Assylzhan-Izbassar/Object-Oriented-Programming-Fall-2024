package dll;

import java.util.Vector;

import models.Teacher;

public class DBContext {
	
	private static String fullPath = "C:\\Users\\a.izbassar\\Desktop\\Object-Oriented-Programming-Fall-2024\\OOP 17-19\\Week13\\src\\data\\";
	private static DBContext db = new DBContext();
	
	public static Vector<Teacher> teacher;
	
	{
		
		this.teacher = getTeachers();
	}
	
	private DBContext() {
		
	}
	
	// ...
	
	public static Vector<Teacher> getTeachers() {
		Object o = ReaderWriter.deserialize(fullPath + "teachers.txt");
		
		if (o instanceof Vector) {
			return (Vector<Teacher>) o;
		}
		return null;
	}
	
	public static boolean saveTeachers() {
		return ReaderWriter.serialize(teacher, fullPath + "teachers.txt");
	}

	public static DBContext getDb() {
		return db;
	}
	
	
}
