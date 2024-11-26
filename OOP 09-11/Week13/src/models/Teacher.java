package models;

public class Teacher extends Employee {
	
	private TeacherTitle title;

	public Teacher(String username, String password) {
		super(username, password);
	}

	public TeacherTitle getTitle() {
		return title;
	}

	public void setTitle(TeacherTitle title) {
		this.title = title;
	}

}
