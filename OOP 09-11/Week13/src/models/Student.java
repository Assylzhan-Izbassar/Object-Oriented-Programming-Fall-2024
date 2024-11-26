package models;

public class Student extends User {
	
	private String speciality;

	public Student(String username, String password) {
		super(username, password);
	}
	
	public Student(String username, String password, String speciality) {
		super(username, password);
		this.setSpeciality(speciality);
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	public String toString() {
		return this.getUsername();
	}
	
}
