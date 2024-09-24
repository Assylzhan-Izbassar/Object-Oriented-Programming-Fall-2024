import java.util.*;


public class Student {
	private String name;
	private String studentId;
	private static int studentCount = 0;
	private Date yearOfStudy = new Date(2023, 9, 1);
	
	{
		Student.studentCount++;
		this.studentId = this.yearOfStudy.getYear() % 100 + "BD" + Student.studentCount;
	}
	
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	// keyword: this
	
	public Student(String name, String studentId) {
		this(name);
		this.studentId = studentId;
	}
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentId() {
		return this.studentId;
	}
	
	public String toString() {
		return "{\n'name':"+ this.name + "\n}\n";
	}
}
