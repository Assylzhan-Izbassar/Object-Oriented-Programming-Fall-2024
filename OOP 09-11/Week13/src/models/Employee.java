package models;

public abstract class Employee extends User {
	
	protected int workingYears;
	
	public Employee(String username, String password) {
		super(username, password);
	}

}
