package controllers;

import models.UserType;
import models.Student;

import java.util.Vector;

import dll.DBContext;
import models.Manager;
import models.Teacher;
import models.User;

public class UserController {
	
	public static boolean createUser(
			String username,
			String password, 
			UserType type) {
		switch(type) {
		case TEACHER:
			Teacher newTeacher = new Teacher(username, password);
			DBContext.teacher.add(newTeacher);
			return DBContext.saveTeachers();
		case STUDENT:
			Student newStudent = new Student(username, password);
			break;
		case MANAGER:
			Manager newManager = new Manager(username, password);
			break;
		default:
			return false;
		}
		
		return true;
	}
	
	public static Object getUsers(UserType type) {
		switch(type) {
		case TEACHER:
			return DBContext.getTeachers();
		default:
			return null;
		}
	}
}
