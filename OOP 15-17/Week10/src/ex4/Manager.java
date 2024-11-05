package ex4;

import java.util.Vector;

public class Manager extends Employee {
	Vector<Employee> employees;
	double bonus;
	
	{
		this.employees = new Vector<Employee>();
	}
	
	public Object clone() throws CloneNotSupportedException {
		Manager clone = (Manager) super.clone();
		Vector<Employee> emRef = new Vector<Employee>();
		
		for(Employee e: this.employees) {
			emRef.add((Employee) e.clone());
		}
		
		clone.employees = emRef;
		return clone;
	}
}
