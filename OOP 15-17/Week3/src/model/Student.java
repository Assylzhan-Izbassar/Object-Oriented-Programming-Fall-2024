package model;

public class Student {
	private String name;
	public int numberOfCourses;
	public static int studentCnt = 0;
	
	static {
//		this.numberOfCourses = 5;
		Student.studentCnt++;
	}
	
	
	public Student(String name) {
		if (this.validateName(name)) {
			this.name = name;	
		} else {
			this.showNameValidation();
		}

	}
	
	public Student(String name, int numberOfCourses) {
//		this(name);
		this.name = name;
		this.numberOfCourses = numberOfCourses;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		if (name.length() > 3) {
			this.name = name;	
		} else {
			this.showNameValidation();
		}
	}
	
	private void showNameValidation() {
		System.err.println("Minimum required number chars is 4!");
	}
	
	private boolean validateName(String name) { 
		if (name.length() > 3) {
			return true;
		} 
		return false;
	}
}
