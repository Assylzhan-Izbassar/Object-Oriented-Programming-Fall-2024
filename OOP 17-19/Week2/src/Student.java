import java.util.Date;

public class Student {
	private String name;
	private String studentId;
	private Date yearOfApplication = new Date(2023, 9, 1);
	
	public static int studentCount = 0;
	
	{
		Student.studentCount++;
		this.studentId = this.yearOfApplication.getYear() % 100 + "BD" + Student.studentCount; 
	}
	
	public Student() {
	}
	
	
	public Student(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public static void method1(Student s) {
		s.setName("Asan");
	}
	
	public static void method2() {
		Student t = new Student();
		t.setName("Usen");
		method1(t);
		System.out.print(t.getName());
	}
	
	public String getStudentId() {
		return this.studentId;
	}
	
	public String toString() {
		return this.getName() + " " + this.getStudentId();
	}
}
