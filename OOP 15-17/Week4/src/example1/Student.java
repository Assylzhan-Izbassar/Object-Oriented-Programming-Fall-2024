package example1;

class Student extends Person {
	private int studentId;
	
	public Student() {
		super();
	}
	
	public Student(String name, int studentId) {
		super(name);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}
	
//	@Override
//	public void move() {
//		super.move();
//		System.out.println("He / She hurry up to lecture time...");
//	}
	
	public void move(double speed) {
//		super.move(speed);
		System.out.println(this.getName() + " isn't late to lecture...");
	}
	
	@Override
	public String toString() {
		return super.getName() + " with id = " + this.studentId;
	}
}
