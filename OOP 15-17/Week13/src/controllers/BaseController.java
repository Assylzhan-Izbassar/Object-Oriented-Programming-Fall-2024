package controllers;

import models.Course;
import models.DBContext;
import models.Teacher;

public class BaseController {

//	public boolean createCourse(String name) {
//		Course newCourse = new Course(name);
//		DBContext.courses.add(newCourse);
//		DBContext.serialize(newCourse, "course.txt");
//		return true;
//	}
	
	public boolean createTeacher(String username, String password) {
		Teacher newTeacher = new Teacher(username, password);
		DBContext.teachers.add(newTeacher);
		DBContext.saveTeachers();
		return true;
	}
	
	public Object getTeachers() {
		return DBContext.deserialize("teachers.txt");
	}
	
}
