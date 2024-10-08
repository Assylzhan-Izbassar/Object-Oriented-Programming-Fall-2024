package exam3;

public class Student extends Person {
	
	public double gpa;
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public String getDescription() {
		return "I am a student with name " + this.name + " and GPA = " + this.gpa;
	}
}
