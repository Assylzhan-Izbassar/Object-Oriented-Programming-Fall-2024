package controllers;

import models.Manager;
import models.Student;
import models.Teacher;
import models.User;
import main.DBContext;

public class AdminController {
	
	public static User createUser(String username, String password, String type) {
		if (type.equals("S")) {
			Student s = new Student(username, password);
			DBContext.students.add(s);
			DBContext.serializeStudents();
			return s;
		} else if (type.equals("T")) {
			Teacher t = new Teacher(username, password);
			DBContext.employees.add(t);
			return t;
		} else if (type.equals("M")) {
			return new Manager(username, password);
		}
		// ...
		return null;
	}
}	
