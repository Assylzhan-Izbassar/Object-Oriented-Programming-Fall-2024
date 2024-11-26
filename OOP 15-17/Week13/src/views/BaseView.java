package views;


import java.util.Scanner;
import java.util.Vector;

import controllers.BaseController;
import models.Teacher;

public class BaseView {
	
	BaseController bc = new BaseController();
	Scanner in = new Scanner(System.in);
	
	public void createTeacherView() {
		System.out.println("Enter the username: ");
		String username = in.nextLine();
		System.out.println("Enter the password: ");
		String password = in.nextLine();
	
		bc.createTeacher(username, password);
		
		System.out.println("New teacher is created!");
	}
	
	public void showTeachers() {
		Vector<Teacher> teachers = (Vector<Teacher>) bc.getTeachers();
		
		for (Teacher t: teachers) {
			System.out.println(t);
		}
	}
}
