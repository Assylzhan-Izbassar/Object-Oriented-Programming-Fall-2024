package views;

import java.util.Scanner;

import controllers.UserController;
import models.UserType;

public class BaseView {
	
	private static Scanner in = new Scanner(System.in);
//	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	public static void welcome() {
		System.out.println("Welcome to WSP!\nPlease select the option:");
		System.out.println("1. Create a new user;");
		System.out.println("2. Show teachers;");
		System.out.println("3. Exit;");
		
		int option = in.nextInt();
		
		if (option == 1) {
			createUser();
		} else if (option == 2) {
			showTeachers();
		} else if (option == 3) {
			System.out.println("Bye Bye!");
		}
	}
	
	public static void showTeachers() {
		System.out.println("Loading the teachers...");
		
		Object o = UserController.getUsers(UserType.TEACHER);
		
		System.out.println(o);
		
		welcome();
	}
	
	public static void createUser() {
		
		System.out.println("What role do you want to create?");
		System.out.println("1. Teacher;");
		System.out.println("2. Student;");
		System.out.println("3. Manager;");
		
		int option = in.nextInt();
		
		in.nextLine(); // waiting moment
		
		if (option == 1) {
			System.out.println("Creating a new teacher...");
			
			System.out.println("Enter a username:");
			String username = in.nextLine();
			System.out.println("Enter a password:");
			String password = in.nextLine();
			
			// controller
			boolean res = UserController.createUser(username, password, UserType.TEACHER);
			
			if (res) {
				System.out.println(username + " is created!");
			} else {
				System.err.println("error!");
			}
			welcome();
		}
	
	}
}
