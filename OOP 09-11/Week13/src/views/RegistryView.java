package views;

import java.util.Scanner;
import java.util.Vector;

import controllers.AdminController;
import main.DBContext;
import models.Student;

public class RegistryView {
	
	private Scanner in = new Scanner(System.in);
	
	public void createStudent() {
		System.out.println("Enter the username: ");
		
		String username = in.nextLine();
		
		System.out.println("Enter the password: ");
		
		String password = in.nextLine();
		
		AdminController.createUser(username, password, "S");
	}
	
	public void printStudent() {
		Vector<Student> students = DBContext.students;
		
		for (Student s: students) {
			System.out.println(s);
		}
	}
	
}
