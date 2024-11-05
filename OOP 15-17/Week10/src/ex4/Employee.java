package ex4;

public class Employee extends Person {
	double salary;
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
